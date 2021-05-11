package com.josh.smartkettlebell.ui.main.training.trainingplan.training;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.josh.smartkettlebell.Counter.Counter;
import com.josh.smartkettlebell.R;
import com.josh.smartkettlebell.db.MyContract;
import com.josh.smartkettlebell.db.MyDBHelper;
import com.josh.smartkettlebell.model.Exercise;
import com.josh.smartkettlebell.model.MotionData;
import com.josh.smartkettlebell.service.MyBluetoothService;
import com.josh.smartkettlebell.ui.main.challenge.ChallengeFragment;
import com.josh.smartkettlebell.ui.main.settings.SettingsFragment;
import com.josh.smartkettlebell.util.ZhangPhilGifView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public class TrainingActivity extends AppCompatActivity {
    public static final String EXTRA_LIST = "EXTRA_LIST";
    public static final String EXTRA_REQUEST_CODE = "EXTRA_REQUEST_CODE";
    ZhangPhilGifView gv_demo;
    TextView tv_stopwatch;
    TextView tv_count;
    TextView tv_count_max;
    TextView tv_exercise_title;
    Button btn_next;
    ProgressBar progressBar;
    Timer timer = new Timer();
    long duration = 0;
    LinkedList<Exercise> exerciseList;
    int currentExerciseIndex = 0;
    int count = 0;
    boolean lockReceivingData = false;
    boolean isDeviceReady = false;
    MyBluetoothService myBluetoothService;
    TrainingActivity trainingActivity ;
    LinkedList<MotionData> motionDataList ;
    MyDBHelper myDBHelper = new MyDBHelper(this, MyContract.DATABASE_NAME);
    ServiceConnection serviceConnection = new ServiceConnection(){
        final String TAG = "myTag";
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            myBluetoothService = ((MyBluetoothService.LocalBinder)service).getService();
            myBluetoothService.init();
            myBluetoothService.connectToDevice(
                    PreferenceManager.getDefaultSharedPreferences(
                            getApplicationContext()).getString(SettingsFragment.KEY_DEVICE_ADDRESS,
                            null));
            Log.d(TAG, "onServiceConnected: "+trainingActivity);
            Log.d(TAG, "onServiceConnected: "+myBluetoothService);
            myBluetoothService.setTrainingActivity(trainingActivity);

        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);

        trainingActivity = this;
        exerciseList = new LinkedList<>((ArrayList<Exercise>)getIntent().getSerializableExtra(EXTRA_LIST));
        setMap();
        setView();
        bindService(new Intent(this, MyBluetoothService.class),serviceConnection,BIND_AUTO_CREATE);
    }


    public String TimeFormat(long time){
        long sec = time % 60;
        long min = (time / 60) % 60;
        long hour = (time / 3600) % 24;
        if(hour == 0)
            return String.format(Locale.TAIWAN,"%02d:%02d",min,sec);
        else
            return String.format(Locale.TAIWAN,"%02d:%02d:%02d",hour,min,sec);
    }
    private void setView(){
        progressBar = findViewById(R.id.activity_training_progressBar);
        progressBar.setVisibility(View.VISIBLE);

        tv_exercise_title = findViewById(R.id.tv_exercise_title);
        tv_count = findViewById(R.id.tv_count);
        tv_count_max = findViewById(R.id.tv_count_max);
        gv_demo = findViewById(R.id.gv_demo);
        setContent(exerciseList.get(currentExerciseIndex));

        btn_next = findViewById(R.id.btn_next);
        btn_next.setOnClickListener(event->{
            exerciseList.get(currentExerciseIndex)
                    .setActualNumber(count);
            exerciseList.get(currentExerciseIndex)
                    .setMotionData(motionDataList);

            currentExerciseIndex++;
            if(currentExerciseIndex >= exerciseList.size()) {
                lockReceivingData = true;
                //寫入資料庫
                new Thread(() -> {
                    getSharedPreferences(ChallengeFragment.PREFERENCE_NAME_CHALLENGE,MODE_PRIVATE)
                    .edit()
                    .putBoolean(ChallengeFragment.PREFERENCE_KEY_DONE,true)
                    .apply();
                    long trainingID = myDBHelper.createTraining(duration);
                    for(Exercise e : exerciseList){
                        long recordID = myDBHelper.createRecord(e.getName(),trainingID,e.getNumber());
                        for(MotionData d : e.getMotionData()){
//                            Log.d(TAG, "setView: "+d.getTimestamp());
                            myDBHelper.insertData(d.getData(),null,recordID,d.getTimestamp());
                        }
                    }
                }).start();
                if(getIntent().getIntExtra(TrainingActivity.EXTRA_REQUEST_CODE,0) == ChallengeFragment.REQUEST_CODE_CHALLENGE)
                    setResult(ChallengeFragment.RESULT_CODE_CHALLENGE);
                finish();
                return;
            }else if(currentExerciseIndex == exerciseList.size()-1){
                btn_next.setText(R.string.Complete);
            }

            setContent(exerciseList.get(currentExerciseIndex));

        });

        tv_stopwatch = findViewById(R.id.tv_stopwatch);


    }
    private void setContent(Exercise e){
        String name = e.getName();
        int num = e.getNumber();
        count = 0;
        motionDataList = new LinkedList<>();
        tv_count.setText(String.valueOf(count));
        tv_count_max.setText(String.valueOf(num));
        tv_exercise_title.setText(String.valueOf(name));
        gv_demo.setGif(map_gif.getOrDefault(name,0));
        counter.reset(map_setting.getOrDefault(name,null));
    }
    Counter counter = new Counter(new Counter.Setting(0,null));

    HashMap<String, Integer> map_gif = new HashMap<>();
    HashMap<String, Counter.Setting> map_setting = new HashMap<>();

    public void setMap(){
        map_gif.put("push",R.drawable.push_gif);
        map_gif.put("row",R.drawable.row_gif);
        map_gif.put("deadlift",R.drawable.deadlift_gif);
        map_gif.put("squat",R.drawable.squat_gif);
        map_gif.put("swing",R.drawable.swing_gif);
        map_setting.put("push"      ,new Counter.Setting(-1, Counter.Setting.Target.PEAK));
        map_setting.put("row"       ,new Counter.Setting(-1, Counter.Setting.Target.PEAK));
        map_setting.put("deadlift"  ,new Counter.Setting(-1, Counter.Setting.Target.PEAK));
        map_setting.put("squat"     ,new Counter.Setting(-1, Counter.Setting.Target.PEAK));
        map_setting.put("swing"     ,new Counter.Setting(-1, Counter.Setting.Target.PEAK));
    }

    public void count(float[] data){//call by myGattCallBack
        if(currentExerciseIndex >= exerciseList.size())
            return;
        if(counter.count(data[0])){
            count++;
            if(count<exerciseList.get(currentExerciseIndex).getNumber())
                tv_count.setText(String.valueOf(count));
            else if(count == exerciseList.get(currentExerciseIndex).getNumber()){
                tv_count.setText(String.valueOf(count));
                lockReceivingData = true;
            }
        }
    }

    public void receiveData(float[] data,long timeStamp){//call by myGattCallBack
        if(!lockReceivingData)
            motionDataList.add(new MotionData(data,timeStamp));
    }

    public void setDeviceReady(boolean deviceReady){
        if(!isDeviceReady && deviceReady){
            progressBar.setVisibility(View.INVISIBLE);
            timer.purge();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    duration++;
                    runOnUiThread(() -> tv_stopwatch.setText(TimeFormat(duration)));
                }
            },1000,1000);
            isDeviceReady = !isDeviceReady;
        }
        else if(isDeviceReady && !deviceReady){
            progressBar.setVisibility(View.VISIBLE);
            isDeviceReady = !isDeviceReady;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbindService(serviceConnection);
    }
}