package com.josh.smartkettlebell.util;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.util.Log;

import static com.josh.smartkettlebell.ui.main.MainActivity.TAG;

public class GattUtility {
    public static void dumpServices(BluetoothGatt gatt) {
        for (BluetoothGattService s : gatt.getServices()) {
            Log.d(TAG, "dumpServices: \t service : " + s.getUuid());
            for (BluetoothGattCharacteristic c : s.getCharacteristics()) {
                Log.d(TAG, "dumpServices: \t\t characteristic : " + c.getUuid());
                for (BluetoothGattDescriptor d : c.getDescriptors()) {
                    Log.d(TAG, "dumpServices: \t\t\t descriptor : " + d.getUuid());
                }
            }
        }
    }
}
