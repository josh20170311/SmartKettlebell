package com.josh.smartkettlebell.ui.main;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.preference.PreferenceManager;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;
import com.josh.smartkettlebell.R;
import com.josh.smartkettlebell.service.MyBluetoothService;
import com.josh.smartkettlebell.ui.main.challenge.ChallengeFragment;
import com.josh.smartkettlebell.ui.main.data.DataFragment;
import com.josh.smartkettlebell.ui.main.schedule.ScheduleFragment;
import com.josh.smartkettlebell.ui.main.settings.SettingsFragment;
import com.josh.smartkettlebell.ui.main.training.TrainingFragment;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "myTAG : MainActivity : ";
    public static final String ACTION_UPDATE_SETTINGS_PREFERENCE = "com.josh.smartkettlebell.ACTION_UPDATE_SETTINGS_PREFERENCE";
    Fragment trainingFragment;
    Fragment scheduleFragment;
    Fragment dataFragment;
    Fragment challengeFragment;
    Fragment settingFragment;
    Fragment currentFragment;
    FragmentManager fragmentManager = getSupportFragmentManager();
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    MaterialToolbar topAppBar;
    MyBluetoothService myBluetoothService;
    ServiceConnection connection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            myBluetoothService = ((MyBluetoothService.LocalBinder)service).getService();
            Log.d(TAG, "onServiceConnected: "+myBluetoothService);
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            Log.d(TAG, "onServiceDisconnected: ");
        }
    };

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        drawerLayout = findViewById(R.id.drawerLayout);
        topAppBar  = findViewById(R.id.topAppBar);
        navigationView = findViewById(R.id.navigationView);
        topAppBar.setNavigationOnClickListener(v -> drawerLayout.open());

        setNavigation();
        Log.d(TAG, "onCreate: finished");
        IntentFilter filter = new IntentFilter();
        filter.addAction(ACTION_UPDATE_SETTINGS_PREFERENCE);
        registerReceiver(receiver,filter);
        bindService(new Intent(this, MyBluetoothService.class),connection,BIND_AUTO_CREATE);
    }




    private void setNavigation(){
        navigationView.setNavigationItemSelectedListener(item -> {
            switch(item.getItemId()){
                case R.id.page_training:
                    if(trainingFragment == null)
                        trainingFragment = new TrainingFragment();
                    currentFragment = trainingFragment;
                    break;
                case R.id.page_schedule:
                    if(scheduleFragment == null)
                        scheduleFragment = new ScheduleFragment();
                    currentFragment = scheduleFragment;
                    break;
                case R.id.page_data:
                    if(dataFragment == null)
                        dataFragment = new DataFragment();
                    currentFragment = dataFragment;
                    break;
                case R.id.page_challenge:
                    if(challengeFragment == null)
                        challengeFragment = new ChallengeFragment();
                    currentFragment = challengeFragment;
                    break;
                case R.id.page_setting:
                    if(settingFragment == null)
                        settingFragment = new SettingsFragment();
                    currentFragment = settingFragment;
                    break;
            }
            changeFragment(currentFragment);
            drawerLayout.close();
            return true;
        });

        trainingFragment = new TrainingFragment();
        changeFragment(trainingFragment);
    }
    private void changeFragment(Fragment f){
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.main_container, f);
        transaction.commit();
    }
    BroadcastReceiver receiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            if(Objects.equals(intent.getAction(), ACTION_UPDATE_SETTINGS_PREFERENCE)){
                ((SettingsFragment)settingFragment).update();
            }
        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        PreferenceManager.getDefaultSharedPreferences(this)
                .edit()
                .putString(SettingsFragment.KEY_DEVICE_STATE,"Disconnected")
                .apply();

    }
}