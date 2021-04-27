package com.josh.smartkettlebell.ui.main.training;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.MaterialToolbar;
import com.josh.smartkettlebell.R;

public class AddTrainingPlanActivity extends AppCompatActivity {
    Button btn1;
    TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_training_plan);
        //抓取View
        findView();

        //設定button
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(e -> {
            getIntent().putExtra("tv1",tv1.getText().toString());
            getIntent().putExtra("tv2",tv2.getText().toString());
            setResult(TrainingFragment.ADD_PLAN_REQUEST_CODE,getIntent());
            finish();
        });


        //設定返回建
        MaterialToolbar toolbar = findViewById(R.id.add_plan_app_bar);
        toolbar.setNavigationOnClickListener(v -> {
            finish();
        });
    }
    void findView(){
        btn1 = findViewById(R.id.btn1);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
    }
}