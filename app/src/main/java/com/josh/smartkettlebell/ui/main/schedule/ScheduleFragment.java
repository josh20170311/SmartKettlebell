package com.josh.smartkettlebell.ui.main.schedule;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.josh.smartkettlebell.R;

import java.util.ArrayList;

public class ScheduleFragment extends Fragment {


    FloatingActionButton fab;
    ListView lv_event;
    SwipeRefreshLayout swipeRefreshLayout;
    public static ArrayList<String> eventList = new ArrayList<>();
    public static int PERMISSION_REQUEST_CODE_CALENDER = 10001;
    String TAG = "myTag";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_schedule, container, false);


        fab = view.findViewById(R.id.fab);
        lv_event = view.findViewById(R.id.list);
        swipeRefreshLayout = view.findViewById(R.id.swiperefresh);


        if(hasPermission(getContext(), Manifest.permission.READ_CALENDAR)&&hasPermission(getContext(),Manifest.permission.WRITE_CALENDAR))
        {
            readEvent();
        }else{
            ActivityCompat.requestPermissions(getActivity(),
                    new String[]{Manifest.permission.READ_CALENDAR,
                            Manifest.permission.WRITE_CALENDAR},
                    PERMISSION_REQUEST_CODE_CALENDER);
        }



        fab.setOnClickListener(v -> {

            Intent intent = new Intent(getContext(), EventsAdderDialogActivity.class);
            startActivity(intent);

        });
        swipeRefreshLayout.setOnRefreshListener(() -> {
            swipeRefreshLayout.setRefreshing(false);
            readEvent();
        });

        return view;
    }



    private boolean hasPermission(Context context, String permission){
        return ContextCompat.checkSelfPermission(context,permission) == PackageManager.PERMISSION_GRANTED;
    }
    public void readEvent(){
        eventList = EventsAdderUtility.readCalendarEvent(getContext());
        ArrayAdapter<String> aa = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_2,android.R.id.text1, eventList){
            @Override
            public View getView(int pos, View convert,@NonNull ViewGroup group) {
                View v = super.getView(pos,convert,group);
                TextView t1 = v.findViewById(android.R.id.text1);
                TextView t2 = v.findViewById(android.R.id.text2);
                if(!getItem(pos).contains(" ")){
                    t1.setText("N/A");
                    t2.setText("N/A");
                    return v;
                }
                t1.setText(getItem(pos).substring(0,getItem(pos).indexOf(" ")));
                t2.setText(getItem(pos).substring(getItem(pos).indexOf(" ")+1));
                return v;
            }
        };
        lv_event.setAdapter(aa);
    }
}