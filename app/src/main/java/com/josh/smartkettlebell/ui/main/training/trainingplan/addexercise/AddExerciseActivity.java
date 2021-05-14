package com.josh.smartkettlebell.ui.main.training.trainingplan.addexercise;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.MaterialToolbar;
import com.josh.smartkettlebell.R;
import com.josh.smartkettlebell.ui.main.training.trainingplan.TrainingPlanActivity;

public class AddExerciseActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView iv_swing, iv_squat, iv_deadlift, iv_row, iv_push;
    ImageView currentIV;
    Button btn;
    EditText et_exercise_number;
    MaterialToolbar toolbar;
    int requestCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_exercise);

        requestCode = getIntent().getIntExtra(TrainingPlanActivity.EXTRA_REQUEST_CODE, 0);


        iv_swing = findViewById(R.id.iv_swing);
        iv_squat = findViewById(R.id.iv_squat);
        iv_deadlift = findViewById(R.id.iv_deadlift);
        iv_row = findViewById(R.id.iv_row);
        iv_push = findViewById(R.id.iv_push);
        btn = findViewById(R.id.btn_add_exercise);
        et_exercise_number = findViewById(R.id.et_exercise_number);
        toolbar = findViewById(R.id.toolbar_add_exercise);

        iv_swing.setTag("swing");
        iv_squat.setTag("squat");
        iv_deadlift.setTag("deadlift");
        iv_row.setTag("row");
        iv_push.setTag("push");

        iv_swing.setOnClickListener(this);
        iv_squat.setOnClickListener(this);
        iv_deadlift.setOnClickListener(this);
        iv_row.setOnClickListener(this);
        iv_push.setOnClickListener(this);
        btn.setOnClickListener(this);
        toolbar.setNavigationOnClickListener(v -> {
            finish();
        });

        et_exercise_number.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().isEmpty()) {
                    et_exercise_number.setText("0");
                    return;
                }
                try {

                    int i = Integer.parseInt(s.toString());
                    if (i > 100)
                        et_exercise_number.setText("100");
                } catch (NumberFormatException e) {
                    et_exercise_number.setText("100");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        if (requestCode == TrainingPlanActivity.REQUEST_CODE_ADD_EXERCISE) {
            currentIV = iv_swing;
        } else if (requestCode == TrainingPlanActivity.REQUEST_CODE_EDIT_EXERCISE) {
            toolbar.setTitle("Edit Exercise");

            btn.setText("Done");
            String name = getIntent().getStringExtra(TrainingPlanActivity.EXTRA_EXERCISE_NAME);
            switch (name) {
                case "swing":
                    currentIV = iv_swing;
                    break;
                case "squat":
                    currentIV = iv_squat;
                    break;
                case "deadlift":
                    currentIV = iv_deadlift;
                    break;
                case "row":
                    currentIV = iv_row;
                    break;
                case "push":
                    currentIV = iv_push;
                    break;
            }
        } else {
            currentIV = iv_swing;
        }
        currentIV.setImageAlpha(128);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_swing:
            case R.id.iv_squat:
            case R.id.iv_deadlift:
            case R.id.iv_row:
            case R.id.iv_push:
                currentIV.setImageAlpha(255);
                currentIV = (ImageView) v;
                currentIV.setImageAlpha(128);
                break;
            case R.id.btn_add_exercise:
                Intent intent = new Intent();
                intent.putExtra(TrainingPlanActivity.EXTRA_EXERCISE_NAME, currentIV.getTag().toString());

                String str_action_number = et_exercise_number.getText().toString();
                int number = Integer.parseInt(str_action_number);
                intent.putExtra(TrainingPlanActivity.EXTRA_EXERCISE_NUMBER, number);

                if (requestCode == TrainingPlanActivity.REQUEST_CODE_ADD_EXERCISE) {
                    setResult(TrainingPlanActivity.RESULT_CODE_ADD_EXERCISE, intent);
                } else if (requestCode == TrainingPlanActivity.REQUEST_CODE_EDIT_EXERCISE) {
                    int position = getIntent().getIntExtra(TrainingPlanActivity.EXTRA_EXERCISE_POSITION, -1);
                    intent.putExtra(TrainingPlanActivity.EXTRA_EXERCISE_POSITION, position);
                    setResult(TrainingPlanActivity.RESULT_CODE_EDIT_EXERCISE, intent);
                }
                finish();
                break;

        }

    }

}