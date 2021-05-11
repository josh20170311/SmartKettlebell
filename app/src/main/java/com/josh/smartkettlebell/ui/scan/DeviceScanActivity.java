package com.josh.smartkettlebell.ui.scan;

import android.Manifest;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.preference.PreferenceManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.josh.smartkettlebell.R;
import com.josh.smartkettlebell.ui.main.settings.SettingsFragment;

import java.util.List;

public class DeviceScanActivity extends AppCompatActivity {
    private final int EnableBluetoothRequestCode = 100;
    private final int LocationPermissionRequestCode = 110;
    private final Handler handler = new Handler();
    private final String TAG = "myTag";

    BluetoothAdapter adapter = BluetoothAdapter.getDefaultAdapter();
    BluetoothLeScanner scanner = adapter.getBluetoothLeScanner();
    Boolean isScanning = false;
    Button btn_connect;
    RecyclerView rv_deviceList;
    DeviceListAdapter listAdapter = new DeviceListAdapter();

    ScanCallback scanCallback = new ScanCallback() {
        @Override
        public void onScanResult(int callbackType, ScanResult result) {
            super.onScanResult(callbackType, result);
            //Log.d(TAG, "onScanResult: "+result);
            String name = result.getDevice().getName();
            if(name != null && name.equals("CC2650 SensorTag")){
                listAdapter.addDevice(result);
                listAdapter.notifyDataSetChanged();
            }
        }

        @Override
        public void onBatchScanResults(List<ScanResult> results) {
            super.onBatchScanResults(results);
        }

        @Override
        public void onScanFailed(int errorCode) {
            super.onScanFailed(errorCode);
            //Log.d(TAG, "onScanFailed: ScanFailed error code : " + errorCode);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_connecting);

        btn_connect = findViewById(R.id.btn_connect);
        btn_connect.setOnClickListener(v -> {
            if(isScanning){
                btn_connect.setText(R.string.Scan);
            }else {
                btn_connect.setText(R.string.Scanning);
            }
            scanDevice();
        });

        rv_deviceList = findViewById(R.id.rv_deviceList);
        rv_deviceList.setAdapter(listAdapter);
        rv_deviceList.setLayoutManager(new LinearLayoutManager(this));
        rv_deviceList.setOnClickListener(e ->
                Log.d(TAG, "onCreate: "+e.getId()));

        requestEnableLocation();//要求打開位置
        requestEnableBluetooth();//要求打開藍芽
        requestPermissionFineLocation();//要求精確位置許可
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == EnableBluetoothRequestCode) {
            if(resultCode == 0)
                finish();
//                requestEnableBluetooth();
            else
                scanner = BluetoothAdapter.getDefaultAdapter().getBluetoothLeScanner();

        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode == LocationPermissionRequestCode){
            if(grantResults[0] == -1) // 0 : granted ,1 : denied
                requestPermissionFineLocation();

        }
    }

    private void scanDevice(){
        Log.d(TAG, "scanDevice: scan device");
        requestEnableLocation();
        if(isScanning){
            isScanning = false;
            scanner.stopScan(scanCallback);
        }else{
            isScanning =true;
            scanner.startScan(scanCallback);

            handler.postDelayed(() -> {
                btn_connect.setText(getText(R.string.scan));
                isScanning = false;
                scanner.stopScan(scanCallback);
            },10000);
        }
    }
    private void requestPermissionFineLocation(){
        if(ContextCompat.checkSelfPermission(getBaseContext(),
                Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(DeviceScanActivity.this,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION},LocationPermissionRequestCode);
        }
    }
    private void requestEnableBluetooth(){
        if(adapter == null || !adapter.isEnabled()){
            Intent intent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(intent, EnableBluetoothRequestCode);
        }
    }

    private void requestEnableLocation(){
        LocationManager manager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);
        assert manager != null;


        boolean is_gps_enabled = manager.isProviderEnabled(LocationManager.GPS_PROVIDER);
        if(!is_gps_enabled){
            new AlertDialog.Builder(this)
                    .setMessage("Location Service is disabled")
                    .setPositiveButton("Setting", (dialogInterface,paramInt) -> {
                        Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                        startActivity(intent);
                    })
                    .setNegativeButton("Cancel", (dialogInterface, param)-> finish())
                    .show();
        }
//        boolean is_network_enabled = manager.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
//        Log.d(TAG, "requestEnableLocation: "+ is_gps_enabled + " , " + is_network_enabled);
//        if(provider_gps != null && provider_network != null)
//        List<String> providers = manager.getAllProviders();
//        Log.d(TAG, "requestEnableLocation: "+ Arrays.toString(providers.toArray())); // [passive, gps, network]
//        Log.d(TAG, "requestEnableLocation: " + manager.isLocationEnabled());
//        if(){
//            Intent intent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
//            startActivityForResult(intent, EnableBluetoothRequestCode);
//        }
    }
    public void onItemClicked(String address){
            PreferenceManager.getDefaultSharedPreferences(this)
                    .edit()
                    .putString(SettingsFragment.KEY_DEVICE_ADDRESS,address)
                    .apply();
            finish();
    }

}