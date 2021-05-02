package com.josh.smartkettlebell.ui.main.training;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.josh.smartkettlebell.R;

public class TrainingFragment extends Fragment {
    static final int ADD_PLAN_REQUEST_CODE = 101;
    String TAG = "myTag";
    Button btn_scan;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_training, container, false);
        FloatingActionButton fab = view.findViewById(R.id.fab_add_action);
        fab.setOnClickListener(e -> {

            Intent intent = new Intent(getActivity(), TrainingPlanActivity.class);
            startActivity(intent);
        });


        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    }
}