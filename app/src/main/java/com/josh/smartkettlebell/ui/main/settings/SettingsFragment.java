package com.josh.smartkettlebell.ui.main.settings;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceManager;

import com.josh.smartkettlebell.R;

import java.util.Map;
import java.util.Objects;

public class SettingsFragment extends PreferenceFragmentCompat {
    static String KEY_DEVICE_ADDRESS = "com.josh.smartkettlebell.Key_Device_ADDRESS";

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey);
    }

}