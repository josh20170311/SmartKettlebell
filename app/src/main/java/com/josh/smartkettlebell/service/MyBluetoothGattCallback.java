package com.josh.smartkettlebell.service;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.content.Intent;
import android.util.Log;

import com.josh.smartkettlebell.db.MyDBHelper;
import com.josh.smartkettlebell.ui.main.training.trainingplan.training.TrainingActivity;
import com.josh.smartkettlebell.util.AHRS;
import com.josh.smartkettlebell.util.Decoder;
import com.josh.smartkettlebell.util.LowPassFilter;

import java.util.Arrays;
import java.util.Date;

import static com.josh.smartkettlebell.service.MyBluetoothService.ACTION_CONNECTED;
import static com.josh.smartkettlebell.service.MyBluetoothService.ACTION_DISCONNECTED;
import static com.josh.smartkettlebell.service.MyBluetoothService.ACTION_SERVICE_DISCOVERED;
import static com.josh.smartkettlebell.service.MyBluetoothService.EXTRA_MOTION_AHRS_DATA;
import static com.josh.smartkettlebell.service.MyBluetoothService.EXTRA_MOTION_DATA;
import static com.josh.smartkettlebell.service.MyBluetoothService.EXTRA_MOTION_FACC_DATA;
import static com.josh.smartkettlebell.service.MyBluetoothService.EXTRA_MOTION_TIMESTAMP;
import static com.josh.smartkettlebell.ui.main.MainActivity.TAG;
import static com.josh.smartkettlebell.util.SensorTagUUID.UUID_MOTION_DATA;

public class MyBluetoothGattCallback extends BluetoothGattCallback {
    private final MyBluetoothService service;
    private final MyDBHelper dbHelper;
    LowPassFilter[] filters = new LowPassFilter[]{
            new LowPassFilter(),
            new LowPassFilter(),
            new LowPassFilter()};
    AHRS ahrs = new AHRS(10, 0.8f);
    private TrainingActivity trainingActivity;
    private boolean is_recording = false;
    private long recordId = -1;

    public MyBluetoothGattCallback(MyBluetoothService service, MyDBHelper dbHelper) {
        this.service = service;
        this.dbHelper = dbHelper;
    }

    @Override
    public void onConnectionStateChange(BluetoothGatt gatt, int status, int newState) {
        super.onConnectionStateChange(gatt, status, newState);
        if (newState == BluetoothGatt.STATE_CONNECTED) {
            Log.d(TAG, "onConnectionStateChange: device connected" + this + service);
            gatt.discoverServices();
            service.sendBroadcast(new Intent(ACTION_CONNECTED));
        } else if (newState == BluetoothGatt.STATE_DISCONNECTED) {
            Log.d(TAG, "onConnectionStateChange: device disconnected" + this + service);
            service.sendBroadcast(new Intent(ACTION_DISCONNECTED));
            trainingActivity.setDeviceReady(false);
        }
    }

    @Override
    public void onServicesDiscovered(BluetoothGatt gatt, int status) {
        super.onServicesDiscovered(gatt, status);
        if (status == BluetoothGatt.GATT_SUCCESS) {
//            Log.d(TAG, "onServicesDiscovered: services discovering successful");
            service.serviceInit();
            service.sendBroadcast(new Intent(ACTION_SERVICE_DISCOVERED));
        } else {
            Log.d(TAG, "onServicesDiscovered: services discovering failed : " + status);
        }
    }

    @Override
    public void onCharacteristicRead(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int status) {
        super.onCharacteristicRead(gatt, characteristic, status);
//            sendData(characteristic.getValue());
    }

    @Override
    public void onCharacteristicWrite(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int status) {
        super.onCharacteristicWrite(gatt, characteristic, status);
//        Log.d(TAG, "onCharacteristicWrite: ");
        if (status == BluetoothGatt.GATT_SUCCESS) {
            service.completedCommand();
        }
    }

    @Override
    public void onCharacteristicChanged(BluetoothGatt gatt, BluetoothGattCharacteristic c) {
        super.onCharacteristicChanged(gatt, c);
        //Log.d(TAG, "onCharacteristicChanged: ");
        long timeStamp = new Date().getTime();
        if (c.getUuid().equals(UUID_MOTION_DATA)) {
            byte[] value = c.getValue();
            float[] data = Decoder.decodeMotionData(value);
            assert data != null;
            if (trainingActivity != null) {
                trainingActivity.setDeviceReady(true);
                trainingActivity.count(data);
                trainingActivity.receiveData(data, timeStamp);
            }

            float[] facc_data = new float[3];
            float[] ahrs_data = ahrs.Update(Arrays.copyOfRange(data, 0, 3), Arrays.copyOfRange(data, 3, 6));
            facc_data[0] = filters[0].next(data[0]);
            facc_data[1] = filters[1].next(data[1]);
            facc_data[2] = filters[2].next(data[2]);
            sendMotionData(data, facc_data, ahrs_data, timeStamp);
            if (is_recording) {
                dbHelper.insertData(data, facc_data, recordId, timeStamp);
            }
        }
    }

    void sendMotionData(float[] data, float[] facc_data, float[] ahrs_data, long timeStamp) {
        Intent intent = new Intent(MyBluetoothService.ACTION_SHOW_DATA);
        intent.putExtra(EXTRA_MOTION_DATA, data);
        intent.putExtra(EXTRA_MOTION_FACC_DATA, facc_data);
        intent.putExtra(EXTRA_MOTION_AHRS_DATA, ahrs_data);
        intent.putExtra(EXTRA_MOTION_TIMESTAMP, timeStamp);
        service.sendBroadcast(intent);
    }

    @Override
    public void onDescriptorWrite(BluetoothGatt gatt, BluetoothGattDescriptor descriptor, int status) {
        super.onDescriptorWrite(gatt, descriptor, status);
//        Log.d(TAG, "onDescriptorWrite: ");
        if (status == BluetoothGatt.GATT_SUCCESS) {
            service.completedCommand();
        }
    }

    public void startRecord(String exerciseName, long trainingID, int number) {
        if (!is_recording) {
            recordId = dbHelper.createRecord(exerciseName, trainingID, number);
            is_recording = true;
        }
    }

    public void stopRecord() {
        if (is_recording) {
            is_recording = false;
        }
    }

    public void setTrainingActivity(TrainingActivity trainingActivity) {
        this.trainingActivity = trainingActivity;
    }
}
