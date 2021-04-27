package com.josh.smartkettlebell.ui.main.training;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.preference.PreferenceManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.josh.smartkettlebell.R;
import com.josh.smartkettlebell.ui.device.DeviceInfoActivity;
import com.josh.smartkettlebell.ui.scan.DeviceScanActivity;
import com.josh.smartkettlebell.ui.viewmodel.CardViewModel;

public class TrainingFragment extends Fragment {
    static final int ADD_PLAN_REQUEST_CODE = 101;
    Button btn_scan;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_training, container, false);



        //設定Button
        btn_scan = view.findViewById(R.id.btn_scan);
        btn_scan.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), DeviceScanActivity.class);
            startActivity(intent);
        });


        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    }
}