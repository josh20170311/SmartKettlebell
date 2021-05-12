package com.josh.smartkettlebell.ui.main.training;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.josh.smartkettlebell.R;
import com.josh.smartkettlebell.db.MyContract;
import com.josh.smartkettlebell.ui.main.training.trainingplan.TrainingPlanActivity;
import com.josh.smartkettlebell.ui.main.training.trainingplan.training.TrainingActivity;

import static com.josh.smartkettlebell.ui.main.MainActivity.TAG;

public class TrainingFragment extends Fragment {
    RecyclerView rv_training;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_training, container, false);
        FloatingActionButton fab = view.findViewById(R.id.fab_add_excercise);
        view.findViewById(R.id.btn_test).setOnClickListener(e ->
                startActivity(new Intent(getContext(), TrainingActivity.class)));

        rv_training = view.findViewById(R.id.rv_training_list);
        rv_training.setLayoutManager(new LinearLayoutManager(getContext()));
        rv_training.setAdapter(new TrainingListAdapter(getContext()));


        fab.setOnClickListener(e -> {
            Intent intent = new Intent(getActivity(), TrainingPlanActivity.class);
            startActivity(intent);
        });

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        if(rv_training != null){
            ((TrainingListAdapter)rv_training.getAdapter()).update();
        }
    }
}