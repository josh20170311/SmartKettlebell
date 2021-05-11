package com.josh.smartkettlebell.ui.main.settings;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceManager;

import com.josh.smartkettlebell.R;

import java.util.Map;
import java.util.Objects;

public class SettingsFragment extends PreferenceFragmentCompat {
    public static String KEY_DEVICE_ADDRESS = "com.josh.smartkettlebell.KEY_DEVICE_ADDRESS";
    public static String KEY_DEVICE_STATE = "com.josh.smartkettlebell.KEY_DEVICE_STATE";
    public static String ACTION_FROM_SETTING = "com.josh.smartkettlebell.ui.scan.action_from_setting";
    private String rootKey;
    public String TAG = "myTag";

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey);
        this.rootKey = rootKey;
    }

    public void update() {
        setPreferencesFromResource(R.xml.root_preferences, rootKey);
    }

    @Override
    public void onResume() {
        super.onResume();
        update();
    }
}