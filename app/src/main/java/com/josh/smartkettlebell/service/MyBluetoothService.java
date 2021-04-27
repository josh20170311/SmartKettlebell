package com.josh.smartkettlebell.service;

import android.app.Service;
import android.bluetooth.*;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

import com.josh.smartkettlebell.db.MyContract;
import com.josh.smartkettlebell.db.MyDBHelper;

import java.util.LinkedList;
import java.util.Queue;

import static com.josh.smartkettlebell.util.SensorTagUUID.*;


public class MyBluetoothService extends Service {

    private final String TAG = "myTag";
    public static final String ACTION_SHOW_DATA = "com.josh.smartkettlebell.ACTION_SHOW_DATA";
    public static final String ACTION_CONNECTED = "com.josh.smartkettlebell.ACTION_CONNECTED";
    public static final String ACTION_DISCONNECTED = "com.josh.smartkettlebell.ACTION_DISCONNECTED";
    public static final String ACTION_SERVICE_DISCOVERED = "com.josh.smartkettlebell.ACTION_SERVICE_DISCOVERED";
    public static final String EXTRA_MOTION_DATA = "com.josh.smartkettlebell.EXTRA_MOTION_DATA";
    public static final String EXTRA_MOTION_FACC_DATA = "com.josh.smartkettlebell.EXTRA_MOTION_FACC_DATA";
    public static final String EXTRA_MOTION_AHRS_DATA = "com.josh.smartkettlebell.EXTRA_MOTION_AHRS_DATA";
    public static final String EXTRA_MOTION_TIMESTAMP = "com.josh.smartkettlebell.EXTRA_MOTION_TIMESTAMP";

    private BluetoothAdapter adapter = BluetoothAdapter.getDefaultAdapter();
    private BluetoothGatt gatt;
    private MyBluetoothGattCallback callback = new MyBluetoothGattCallback(this,new MyDBHelper(this, MyContract.DATABASE_NAME));
    private final Queue<Runnable> commandQueue = new LinkedList<>();
    private Boolean isCommandQueueLocked = false;



    public class LocalBinder extends Binder {
        public MyBluetoothService getService(){
            return MyBluetoothService.this;
        }
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG, "onBind: ");
        return new LocalBinder();
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.d(TAG, "onUnbind: ");
        return super.onUnbind(intent);
    }

    public void connectToDevice(String address){
        BluetoothDevice device = adapter.getRemoteDevice(address);
        if(gatt != null){
            gatt.disconnect();
            gatt.close();
        }
        gatt = device.connectGatt(this,true,callback);
    }

    public boolean init(){
        adapter = BluetoothAdapter.getDefaultAdapter();
        return adapter != null;
    }



    public void setNotification(BluetoothGattCharacteristic c , boolean enable){
        gatt.setCharacteristicNotification(c,enable);
        if(c.getUuid().equals(UUID_MOTION_DATA)){
            BluetoothGattDescriptor d = c.getDescriptor(UUID_NOTIFICATION_DESCRIPTOR);
            d.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
            Runnable r = () -> gatt.writeDescriptor(d);
            commandQueue.add(r);
            nextCommand();
        }
    }

    private void nextCommand(){
       // Log.d(TAG, "nextCommand: ");
        if(isCommandQueueLocked)return;
        if(commandQueue.size() < 1)return;
        Runnable r = commandQueue.peek();
        assert r != null;
        r.run();
        isCommandQueueLocked = true;
    }

    public void completedCommand(){
            isCommandQueueLocked = false;
            commandQueue.poll();
            nextCommand();
    }

    public void writeCharacteristic(BluetoothGattCharacteristic c){
        Log.d(TAG, "writeCharacteristic: ");
        commandQueue.add(() -> gatt.writeCharacteristic(c));
        nextCommand();
    }

    public void serviceInit(){
        Log.d(TAG, "serviceInit: ");
        BluetoothGattService s = gatt.getService(UUID_MOTION_SERVICE);
        BluetoothGattCharacteristic c_config = s.getCharacteristic(UUID_MOTION_DATA_CONFIG);
        BluetoothGattCharacteristic c_period = s.getCharacteristic(UUID_MOTION_DATA_PERIOD);
        c_config.setValue(new byte[]{0x7f,0x00}); // 01111111,           00000000
        /*                                           ||||||||-> MagX|Y|Z       ||->Acc range bit2
        /*                                           |||||||-> GyrZ            |->Acc range bit1
        /*                                           ||||||-> GyrY                Acc range : 0 +-2g
        /*                                           |||||-> GyrX                             1 +-4g
        /*                                           ||||-> AccZ                              2 +-8g
        /*                                           |||-> AccY                               3 +-16g
        /*                                           ||->AccX
        /*                                           |->None
        * */
        c_period.setValue(new byte[]{0x0a}); // sampling period : 100ms (10Hz)
        writeCharacteristic(c_config);
        writeCharacteristic(c_period);
        setNotification(s.getCharacteristic(UUID_MOTION_DATA),true);
    }

    public void disconnectDevice(){
        Log.d(TAG, "disconnectDevice: ");
        gatt.disconnect();
    }

    public void startRecord(String tag){
        callback.startRecord(tag);
    }

    public void stopRecord(){
        callback.stopRecord();
    }


    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy: service destroyed "+this);
        super.onDestroy();
    }


}