package com.josh.smartkettlebell.ui.main.schedule;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.josh.smartkettlebell.R;

/*
    已搬運至 ScheduleFragment

 */
public class EventsAdderMainActivity extends AppCompatActivity {

    /*
    FloatingActionButton fab;
    ListView lv;
    SwipeRefreshLayout srl;
    public static ArrayList<String> ev = new ArrayList<String>();
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_schedule);
        /*
        fab = findViewById(R.id.fab);
        lv = findViewById(R.id.list);
        srl = findViewById(R.id.swiperefresh);


        if(hasPermission(this, Manifest.permission.READ_CALENDAR)&&hasPermission(this,Manifest.permission.WRITE_CALENDAR))
        {
            readEvent();
        }else{
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.READ_CALENDAR,Manifest.permission.WRITE_CALENDAR},101);
        }



        fab.setOnClickListener(v -> {

            Intent intent = new Intent(getApplicationContext(), EventsAdderDialogActivity.class);
            startActivity(intent);

        });
        srl.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                srl.setRefreshing(false);
                recreate();
            }
        });
*/
    }
    /*
    private boolean hasPermission(Context context,String permission){
        return ContextCompat.checkSelfPermission(context,permission) == PackageManager.PERMISSION_GRANTED;
    }
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,@NonNull int[] grantResults){
        if(requestCode == 101){
            if(grantResults.length > 0 && grantResults[0]==PackageManager.PERMISSION_GRANTED && grantResults[1]==PackageManager.PERMISSION_GRANTED){
                readEvent();
            }else{
                Toast.makeText(this,"Permission denied",Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void readEvent(){
        ev = EventsAdderUtility.readCalendarEvent(this);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,ev){
            @Override
            public View getView(int pos, View convert, ViewGroup group) {
                View v = super.getView(pos,convert,group);
                TextView t1 = v.findViewById(android.R.id.text1);
                TextView t2 = v.findViewById(android.R.id.text2);
                t1.setText(getItem(pos).substring(0,getItem(pos).indexOf(" ")));
                t2.setText(getItem(pos).substring(getItem(pos).indexOf(" ")+1));
                return v;
            }
        };
        lv.setAdapter(aa);
    }

*/
}

