package com.josh.smartkettlebell.ui.main.data;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.josh.smartkettlebell.R;

/*
        已搬運至 DataFragment
 */
public class SearchMainActivity extends AppCompatActivity {

//    int len = 3;//陣列長度

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_data);
//
//        final String movement[][] = {{"深蹲","15"}, {"硬舉","20"},{"擺盪","0"}};//movement and times in array
//        LinearLayout l1 = findViewById(R.id.linear1);
//        LinearLayout l2 = findViewById(R.id.linear2);//l1 in left side and l2 in right side
//
//        Button bt = findViewById(R.id.button);
//
//        TextView[] tvl = new TextView[len];
//        TextView[] tvr = new TextView[len];//tvl mean textview left and tvr mean textview right
//        final String[] mv = new String[len];//動作陣列
//        final String[] times = new String[len];//次數陣列
//
//        /*用迴圈跑陣列+Textview*/
//        for (int i = 0; i < len; i++) {
//            tvl[i] = new TextView(this);
//            tvr[i] = new TextView(this);
//            tvl[i].setText(movement[i][0]);
//            tvr[i].setText(movement[i][1]);
//
//            tvl[i].setTextSize(30);
//            tvr[i].setTextSize(30);
//            tvl[i].setPadding(0, 50, 0, 50);
//            tvr[i].setPadding(0, 50, 0, 50);
//            tvr[i].setGravity(Gravity.RIGHT);
//
//            mv[i] = tvl[i].getText().toString();
//            times[i] = tvr[i].getText().toString();
//
//            l1.addView(tvl[i]);
//            l2.addView(tvr[i]);
//        }
//        /*Button Click*/
//        bt.setOnClickListener(new Button.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                EditText et = findViewById(R.id.editText);
//                String txt = et.getText().toString();
//                for(int i = 0;i<len;i++){
//                    if(txt.equals(mv[i])){
//                        Toast.makeText(getBaseContext(),mv[i]+" 總共做了 "+times[i]+"次",Toast.LENGTH_SHORT).show();
//                        break;
//                    }
//                    else if(txt.equals("")){
//                        Toast.makeText(getBaseContext(),"請輸入動作",Toast.LENGTH_SHORT).show();
//                    }
//                }
//            }
//        });
    }
}
