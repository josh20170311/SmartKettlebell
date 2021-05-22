package com.josh.smartkettlebell.ui.main.data;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.appbar.MaterialToolbar;
import com.josh.smartkettlebell.R;
import com.josh.smartkettlebell.ui.main.training.TrainingListAdapter;


public class HistoryFragment_2 extends Fragment {
    CalendarView cv_calendar;
    RecyclerView rv_data;
    MaterialToolbar toolbar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_history_2, container, false);


        rv_data = view.findViewById(R.id.rv_data_list);
        rv_data.setAdapter(new TrainingListAdapter(getContext()));
        rv_data.setLayoutManager(new LinearLayoutManager(getContext()){
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        });

        cv_calendar = view.findViewById(R.id.cv_calendar);
        cv_calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                update(year, month, dayOfMonth);
            }
        });


        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        update();
    }

    void update(int year, int month , int dayOfMonth){
        ((TrainingListAdapter)rv_data.getAdapter()).update(year,month,dayOfMonth);
    }
    void update(){

        ((TrainingListAdapter)rv_data.getAdapter()).update();
    }
}