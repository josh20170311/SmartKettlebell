package com.josh.smartkettlebell.ui.main.training.trainingplan.training;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.Button;
import android.widget.TextView;

import com.josh.smartkettlebell.R;
import com.josh.smartkettlebell.interfaces.ICounter;
import com.josh.smartkettlebell.model.Exercise;
import com.josh.smartkettlebell.service.MyBluetoothService;
import com.josh.smartkettlebell.ui.main.settings.SettingsFragment;
import com.josh.smartkettlebell.util.ZhangPhilGifView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public class TrainingActivity extends AppCompatActivity {
    public static final String EXTRA_LIST = "EXTRA_LIST";
    ZhangPhilGifView gv_demo;
    TextView tv_stopwatch;
    TextView tv_count;
    TextView tv_count_max;
    TextView tv_exercise_title;
    Button btn_next;
    Timer timer = new Timer();
    long time = 0;
    LinkedList<Exercise> exerciseList;
    int currentExerciseIndex = 0;
    int count = 0;
    MyBluetoothService myBluetoothService;
    TrainingActivity trainingActivity = this;
    ServiceConnection serviceConnection = new ServiceConnection(){
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            myBluetoothService = ((MyBluetoothService.LocalBinder)service).getService();
            myBluetoothService.init();
            myBluetoothService.connectToDevice(
                    PreferenceManager.getDefaultSharedPreferences(
                            getApplicationContext()).getString(SettingsFragment.KEY_DEVICE_ADDRESS,
                            null));
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

        exerciseList = new LinkedList<>((ArrayList<Exercise>)getIntent().getSerializableExtra(EXTRA_LIST));
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
        tv_exercise_title = findViewById(R.id.tv_exercise_title);
        tv_count = findViewById(R.id.tv_count);
        tv_count_max = findViewById(R.id.tv_count_max);
        gv_demo = findViewById(R.id.gv_demo);
        setContent(exerciseList.get(currentExerciseIndex));

        btn_next = findViewById(R.id.btn_next);
        btn_next.setOnClickListener(event->{
            currentExerciseIndex++;
            if(currentExerciseIndex >= exerciseList.size())
                return;

            setContent(exerciseList.get(currentExerciseIndex));
        });

        tv_stopwatch = findViewById(R.id.tv_stopwatch);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                time++;
                runOnUiThread(() -> {
                    tv_stopwatch.setText(TimeFormat(time));
                });
            }
        },1000,1000);
    }
    private void setContent(Exercise e){
        String name = e.getName();
        int num = e.getNumber();
        tv_count.setText(String.valueOf(0));
        tv_count_max.setText(String.valueOf(num));
        tv_exercise_title.setText(String.valueOf(name));
        switch (name) {
            case "swing":
                gv_demo.setGif(R.drawable.swing_gif);
                break;
            case "squat":
                gv_demo.setGif(R.drawable.squat_gif);
                break;
            case "deadlift":
                gv_demo.setGif(R.drawable.deadlift_gif);
                break;
            case "row":
                gv_demo.setGif(R.drawable.row_gif);
                break;
            case "push":
                gv_demo.setGif(R.drawable.push_gif);
                break;
        }
    }
    public void count(float[] data){
        ICounter counter = new ICounter() {
            @Override
            public int count(float[] input) {
                return 0;
            }
        };
        if(counter.count(data) > 0){
            count++;
            tv_count.setText(count);
        }
    }
}