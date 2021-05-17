package com.josh.smartkettlebell.ui.main.training;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.josh.smartkettlebell.R;
import com.josh.smartkettlebell.ui.main.training.trainingplan.TrainingPlanActivity;
import com.josh.smartkettlebell.ui.main.training.trainingplan.training.TrainingActivity;

import static com.josh.smartkettlebell.ui.main.MainActivity.TAG;

public class TrainingFragment extends Fragment {
    RecyclerView rv_training;
    ImageView iv_no_training;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_training, container, false);
        FloatingActionButton fab = view.findViewById(R.id.fab_add_excercise);

        rv_training = view.findViewById(R.id.rv_training_list);
        rv_training.setLayoutManager(new LinearLayoutManager(getContext()));
        rv_training.setAdapter(new TrainingListAdapter(getContext()));

        iv_no_training = view.findViewById(R.id.iv_no_training);


        fab.setOnClickListener(e -> {
            Intent intent = new Intent(getActivity(), TrainingPlanActivity.class);
            startActivity(intent);
        });

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        if (rv_training != null) {
            TrainingListAdapter adapter = ((TrainingListAdapter) rv_training.getAdapter());
            adapter.update();
            int count = adapter.getTrainingCount();

            if(count == 0){
                iv_no_training.setVisibility(View.VISIBLE);
            }else{
                iv_no_training.setVisibility(View.INVISIBLE);
            }
        }
    }
}