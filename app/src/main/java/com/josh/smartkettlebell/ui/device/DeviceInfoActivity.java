package com.josh.smartkettlebell.ui.device;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.graphics.Color;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.josh.smartkettlebell.R;
import com.josh.smartkettlebell.db.MyContract;
import com.josh.smartkettlebell.db.MyDBHelper;
import com.josh.smartkettlebell.service.MyBluetoothService;
import com.josh.smartkettlebell.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class DeviceInfoActivity extends AppCompatActivity implements View.OnClickListener {


    private static final String TAG = "myTag";
    public static final String EXTRA_DEVICE_ADDRESS = "com.josh.smartkattlebell.ui.device.EXTRA_DEVICE_ADDRESS";
    public static final String EXTRA_DEVICE_NAME = "com.josh.smartkattlebell.ui.device.EXTRA_DEVICE_NAME";

    private LineChart chart_acc, chart_facc, chart_ahrs, chart_gyr, chart_mag;
    private TextView tv_name, tv_address, tv_rssi, tv_noti, tv_motionData, tv_status;
    private Button btn_recordData;
    private EditText et_tag;
    private MyBluetoothService mBluetoothService;
    private String deviceAddress;
    private String deviceName;
    private MyDBHelper dbHelper = new MyDBHelper(this, MyContract.DATABASE_NAME);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_info);

        deviceAddress = getIntent().getStringExtra(EXTRA_DEVICE_ADDRESS);
        deviceName = getIntent().getStringExtra(EXTRA_DEVICE_NAME);

        chart_acc = findViewById(R.id.chart_acc);
        chart_facc = findViewById(R.id.chart_facc);
        chart_ahrs = findViewById(R.id.chart_ahrs);
        chart_gyr = findViewById(R.id.chart_gyr);
        chart_mag = findViewById(R.id.chart_mag);
        setChart(chart_acc);
        setChart(chart_facc);
        setChart(chart_ahrs);
        setChart(chart_gyr);
        setChart(chart_mag);

        tv_name = findViewById(R.id.tv_DeviceName);
        tv_name.setText(deviceName);
        tv_address = findViewById(R.id.tv_DeviceAddress);
        tv_address.setText(deviceAddress);
        tv_rssi = findViewById(R.id.tv_DeviceRssi);
        tv_noti = findViewById(R.id.tv_Notification);
        tv_motionData = findViewById(R.id.tv_MotionData);
        tv_status = findViewById(R.id.tv_DeviceStatus);

        btn_recordData = findViewById(R.id.btn_recordData);
        btn_recordData.setOnClickListener(this);

        et_tag = findViewById(R.id.et_tag);

        filter.addAction(MyBluetoothService.ACTION_CONNECTED);
        filter.addAction(MyBluetoothService.ACTION_DISCONNECTED);
        filter.addAction(MyBluetoothService.ACTION_SHOW_DATA);
        filter.addAction(MyBluetoothService.ACTION_SERVICE_DISCOVERED);
        registerReceiver(receiver,filter);

        bindService(new Intent(this,MyBluetoothService.class),connection,BIND_AUTO_CREATE);
    }

    private void setChart(LineChart chart){
        {
            chart.setBackgroundColor(Color.WHITE);
            chart.getDescription().setEnabled(false);
            chart.setDrawGridBackground(false);
            chart.setDragEnabled(true);
            chart.setScaleEnabled(true);
            chart.setPinchZoom(true);



            LineDataSet x,y,z;
            if(chart.equals(chart_ahrs)){
                x = new LineDataSet(new ArrayList<Entry>(), "roll");
                y = new LineDataSet(new ArrayList<Entry>(), "pitch");
                z = new LineDataSet(new ArrayList<Entry>(), "yaw");
            }else{
                x = new LineDataSet(new ArrayList<Entry>(), "x");
                y = new LineDataSet(new ArrayList<Entry>(), "y");
                z = new LineDataSet(new ArrayList<Entry>(), "z");
            }

            x.setColor(Color.RED);
            y.setColor(Color.BLUE);
            z.setColor(Color.GREEN);

            x.setCircleRadius(1f);
            y.setCircleRadius(1f);
            z.setCircleRadius(1f);

            x.setCircleColor(Color.RED);
            y.setCircleColor(Color.BLUE);
            z.setCircleColor(Color.GREEN);

            x.setDrawCircles(true);
            y.setDrawCircles(true);
            z.setDrawCircles(true);

            x.setDrawCircleHole(false);
            y.setDrawCircleHole(false);
            z.setDrawCircleHole(false);


            ArrayList<ILineDataSet> dataSets = new ArrayList<>();
            dataSets.add(x);
            dataSets.add(y);
            dataSets.add(z);

            chart.setData(new LineData(dataSets));

        }
        XAxis xAxis;
        {
            xAxis = chart.getXAxis();
//            xAxis.enableAxisLineDashedLine(10f, 10f, 0f);
        }
        YAxis yAxis;
        {
            yAxis = chart.getAxisLeft();
            chart.getAxisRight().setEnabled(false);
            //yAxis.enableGridDashedLine(10f,10f,0f);
            if(chart.equals(chart_gyr)){
                yAxis.setAxisMaximum(250f);
                yAxis.setAxisMinimum(-250f);
            }
            else if(chart.equals(chart_mag)){
                yAxis.setAxisMaximum(4800);
                yAxis.setAxisMinimum(-4800f);
            }
            else if(chart.equals(chart_ahrs)){
                yAxis.setAxisMaximum(180f);
                yAxis.setAxisMinimum(-180f);
            }else{
                yAxis.setAxisMaximum(2f);
                yAxis.setAxisMinimum(-2f);
            }
        }
    }

    int i = 0; // index of received data
    private void updateCharts(float[] data, float[] facc_data, float[] ahrs_data){
//        int entryCount = chart_acc.getLineData().getDataSetByIndex(0).getEntryCount();
//        Log.d(TAG, "updateCharts: i : " + i);
        if(i > 49){
            chart_acc.getLineData().getDataSetByIndex(0).removeEntry(0);
            chart_acc.getLineData().getDataSetByIndex(1).removeEntry(0);
            chart_acc.getLineData().getDataSetByIndex(2).removeEntry(0);
            chart_gyr.getLineData().getDataSetByIndex(0).removeEntry(0);
            chart_gyr.getLineData().getDataSetByIndex(1).removeEntry(0);
            chart_gyr.getLineData().getDataSetByIndex(2).removeEntry(0);
            chart_mag.getLineData().getDataSetByIndex(0).removeEntry(0);
            chart_mag.getLineData().getDataSetByIndex(1).removeEntry(0);
            chart_mag.getLineData().getDataSetByIndex(2).removeEntry(0);
            chart_facc.getLineData().getDataSetByIndex(0).removeEntry(0);
            chart_facc.getLineData().getDataSetByIndex(1).removeEntry(0);
            chart_facc.getLineData().getDataSetByIndex(2).removeEntry(0);
            chart_ahrs.getLineData().getDataSetByIndex(0).removeEntry(0);
            chart_ahrs.getLineData().getDataSetByIndex(1).removeEntry(0);
            chart_ahrs.getLineData().getDataSetByIndex(2).removeEntry(0);
            chart_acc.getXAxis().setAxisMinimum(i - 49);
            chart_gyr.getXAxis().setAxisMinimum(i - 49);
            chart_mag.getXAxis().setAxisMinimum(i - 49);
            chart_facc.getXAxis().setAxisMinimum(i - 49);
            chart_ahrs.getXAxis().setAxisMinimum(i - 49);
        }

        chart_acc.getLineData().addEntry(new Entry(i, data[0]), 0);
        chart_acc.getLineData().addEntry(new Entry(i, data[1]), 1);
        chart_acc.getLineData().addEntry(new Entry(i, data[2]), 2);
        chart_gyr.getLineData().addEntry(new Entry(i, data[3]), 0);
        chart_gyr.getLineData().addEntry(new Entry(i, data[4]), 1);
        chart_gyr.getLineData().addEntry(new Entry(i, data[5]), 2);
        chart_mag.getLineData().addEntry(new Entry(i, data[6]), 0);
        chart_mag.getLineData().addEntry(new Entry(i, data[7]), 1);
        chart_mag.getLineData().addEntry(new Entry(i, data[8]), 2);
        chart_facc.getLineData().addEntry(new Entry(i, facc_data[0]), 0);
        chart_facc.getLineData().addEntry(new Entry(i, facc_data[1]), 1);
        chart_facc.getLineData().addEntry(new Entry(i, facc_data[2]), 2);
        chart_ahrs.getLineData().addEntry(new Entry(i, ahrs_data[0]), 0);
        chart_ahrs.getLineData().addEntry(new Entry(i, ahrs_data[1]), 1);
        chart_ahrs.getLineData().addEntry(new Entry(i, ahrs_data[2]), 2);
//        String a = chart_acc.getLineData().getDataSetByIndex(0).toString();
//        Log.d(TAG, "updateCharts: "+a);
//        setMaxMin(chart_acc);
//        setMaxMin(chart_gyr);
//        setMaxMin(chart_mag);

        i++;
        chart_acc.notifyDataSetChanged();
        chart_gyr.notifyDataSetChanged();
        chart_mag.notifyDataSetChanged();
        chart_facc.notifyDataSetChanged();
        chart_ahrs.notifyDataSetChanged();

        chart_acc.invalidate();
        chart_gyr.invalidate();
        chart_mag.invalidate();
        chart_facc.invalidate();
        chart_ahrs.invalidate();
    }
    private void setMaxMin(LineChart chart){
        float[] a_max = new float[3];
        float[] a_min = new float[3];
        float max = Float.MIN_VALUE;
        float min = Float.MAX_VALUE;
        a_max[0] = chart.getLineData().getDataSetByIndex(0).getYMax();
        a_max[1] = chart.getLineData().getDataSetByIndex(1).getYMax();
        a_max[2] = chart.getLineData().getDataSetByIndex(2).getYMax();
        a_min[0] = chart.getLineData().getDataSetByIndex(0).getYMin();
        a_min[1] = chart.getLineData().getDataSetByIndex(1).getYMin();
        a_min[2] = chart.getLineData().getDataSetByIndex(2).getYMin();
        for(float x:a_min)
            if(x < min)
                min = x;
        for(float y:a_max)
            if(y > max)
                max = y;
        Log.d(TAG, "setMaxMin: " + Arrays.toString(a_max));
        Log.d(TAG, "setMaxMin: " + Arrays.toString(a_min));
        Log.d(TAG, "setMaxMin: setmax : max : " + max);
        Log.d(TAG, "setMaxMin: setmin : min : " + min);
//        if(max <= min)
//            return;
//        下面同時打開記憶體會爆掉 原因未知
//        chart.getAxisLeft().setAxisMaximum(max);
//        chart.getAxisLeft().setAxisMinimum(min);

    }

    private final IntentFilter filter = new IntentFilter();

    private boolean isRecording = false;

    double[][] window = new double[6][20];
    int window_count = 0;
    String[] predict_array = new String[]{"划船", "推舉", "擺盪", "深蹲", "硬舉", "靜置"};
    String predict_string = "N/A";

    private final BroadcastReceiver receiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            Log.d(TAG, "onReceive: DeviceInfoReceiver : action : "+action);

            switch(Objects.requireNonNull(action)){
                case MyBluetoothService.ACTION_CONNECTED:
                    runOnUiThread(() -> {
                        tv_status.setText(R.string.connected);
                    });
                    break;
                case MyBluetoothService.ACTION_DISCONNECTED:
                    runOnUiThread(()->{
                        tv_status.setText(R.string.disconnected);
                    });
                    break;
                case MyBluetoothService.ACTION_SHOW_DATA:
                    float[] data = intent.getFloatArrayExtra(MyBluetoothService.EXTRA_MOTION_DATA);
                    float[] facc_data = intent.getFloatArrayExtra(MyBluetoothService.EXTRA_MOTION_FACC_DATA);
                    float[] ahrs_data = intent.getFloatArrayExtra(MyBluetoothService.EXTRA_MOTION_AHRS_DATA);
//                    long timeStamp = intent.getLongExtra(MyBluetoothService.EXTRA_MOTION_TIMESTAMP,-1);
                    assert data != null;
                    assert facc_data != null;
                    assert ahrs_data != null;

                    for (int i = 0; i < window.length; i++) {
                        window[i][window_count] = data[i];
                    }
                    window_count++;
                    if(window_count>=window.length) {
                        double[] features = Feature.getFeature_6axis(window[0], window[1], window[2], window[3], window[4], window[5]);
                        window_count=0;
                        int p = RandomForestClassifier.predict(features);
                        predict_string = predict_array[p];
                    }
                    runOnUiThread(()->{
                        updateCharts(data, facc_data, ahrs_data);
                        tv_motionData.setText("");
                        for(float d:data)
                            tv_motionData.append(d+"\n");
                        for(float d:facc_data)
                            tv_motionData.append(d+"\n");
                        for(float d:ahrs_data)
                            tv_motionData.append(d+"\n");
                        tv_motionData.append(predict_string);
                    });
                    break;
                case MyBluetoothService.ACTION_SERVICE_DISCOVERED:
//                    mBluetoothService.displayService();
                    break;
            }

        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: destroyed");
        mBluetoothService.disconnectDevice();
    }

    private final ServiceConnection connection = new ServiceConnection(){

        @Override
        public void onServiceConnected(ComponentName name, IBinder binder) {
            mBluetoothService = ((MyBluetoothService.LocalBinder)binder).getService();
            if(!mBluetoothService.init()){
                Log.d(TAG, "on ServiceConnected: init failed");
                finish();
            }
            mBluetoothService.connectToDevice(deviceAddress);
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            mBluetoothService = null;
        }
    };

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id == R.id.btn_recordData){
            if(isRecording){
                isRecording = false;
                btn_recordData.setText(R.string.recordData);
                mBluetoothService.stopRecord();
            }else{
//                recordId = dbHelper.createRecord(et_tag.getText().toString());
                btn_recordData.setText(R.string.recording);
                isRecording = true;
                mBluetoothService.startRecord(et_tag.getText().toString());
            }
        }
    }
}