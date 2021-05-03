package com.josh.smartkettlebell.ui.main.training.trainingplan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.josh.smartkettlebell.R;
import com.josh.smartkettlebell.model.Exercise;
import com.josh.smartkettlebell.ui.main.training.trainingplan.addexercise.AddExerciseActivity;
import com.josh.smartkettlebell.ui.main.training.trainingplan.training.TrainingActivity;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Objects;

public class TrainingPlanActivity extends AppCompatActivity {
    public static final String EXTRA_EXERCISE_NAME = "EXTRA_EXERCISE_NAME";
    public static final String EXTRA_EXERCISE_NUMBER = "EXTRA_EXERCISE_NUMBER";
    public static final String EXTRA_EXERCISE_POSITION = "EXTRA_EXERCISE_POSITION";
    public static final String EXTRA_REQUEST_CODE = "EXTRA_REQUEST_CODE";
    public static int REQUEST_CODE_ADD_EXERCISE = 300;
    public static int RESULT_CODE_ADD_EXERCISE = 301;
    public static int REQUEST_CODE_EDIT_EXERCISE = 400;
    public static int RESULT_CODE_EDIT_EXERCISE = 401;
    Button btn_start;
    FloatingActionButton fab;
    RecyclerView rv;
    ItemTouchHelper touchHelper;

    LinkedList<Exercise> exerciseList = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training_plan);

        btn_start = findViewById(R.id.btn_start_training);
        fab = findViewById(R.id.fab_add_action);
        rv = findViewById(R.id.rv_action_plan_list);


        rv.setLayoutManager(new LinearLayoutManager(this));

        touchHelper = new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(
                ItemTouchHelper.UP|ItemTouchHelper.DOWN,
                ItemTouchHelper.RIGHT){
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView,
                                  @NonNull RecyclerView.ViewHolder viewHolder,
                                  @NonNull RecyclerView.ViewHolder target) {

                Objects.requireNonNull(rv.getAdapter()).notifyItemMoved(viewHolder.getAdapterPosition(),target.getAdapterPosition());
                Collections.swap(exerciseList,viewHolder.getAdapterPosition(),target.getAdapterPosition());


                return true;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
                if(direction == ItemTouchHelper.RIGHT){
                    exerciseList.remove(viewHolder.getAdapterPosition());
                    Objects.requireNonNull(rv.getAdapter()).notifyItemRemoved(viewHolder.getAdapterPosition());
                }
            }

            @Override
            public boolean isLongPressDragEnabled() {
                return false;
            }
        });
        touchHelper.attachToRecyclerView(rv);
        rv.setAdapter(new ExerciseListAdapter(exerciseList,touchHelper,this));

        fab.setOnClickListener(e -> {
            Intent intent = new Intent(this, AddExerciseActivity.class);
            intent.putExtra(EXTRA_REQUEST_CODE,REQUEST_CODE_ADD_EXERCISE);
            startActivityForResult(intent, REQUEST_CODE_ADD_EXERCISE);
        });

        btn_start.setOnClickListener(e -> {
            Intent intent = new Intent(this, TrainingActivity.class);
            intent.putExtra(TrainingActivity.EXTRA_LIST,exerciseList);
            startActivity(intent);
        });


        MaterialToolbar toolbar = findViewById(R.id.toolbar_add_exercise);
        toolbar.setNavigationOnClickListener(v -> {
            finish();
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_CODE_ADD_EXERCISE){
            String name = data.getStringExtra(EXTRA_EXERCISE_NAME);
            int number = data.getIntExtra(EXTRA_EXERCISE_NUMBER,-1);

            exerciseList.add(new Exercise(name, number));
            rv.getAdapter().notifyDataSetChanged();
        }else if(resultCode == RESULT_CODE_EDIT_EXERCISE){
            String name =data.getStringExtra(EXTRA_EXERCISE_NAME);
            int number = data.getIntExtra(EXTRA_EXERCISE_NUMBER,-1);
            int position = data.getIntExtra(EXTRA_EXERCISE_POSITION,-1);
            Exercise exercise = exerciseList.get(position);
            exercise.setName(name);
            exercise.setNumber(number);
            rv.getAdapter().notifyItemChanged(position);
        }

    }
}