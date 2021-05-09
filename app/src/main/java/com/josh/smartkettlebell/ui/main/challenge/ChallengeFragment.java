package com.josh.smartkettlebell.ui.main.challenge;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;

import com.josh.smartkettlebell.R;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import pl.droidsonroids.gif.GifImageView;

import static android.content.Context.MODE_PRIVATE;


public class ChallengeFragment extends Fragment {
    TextView textView, timeText, chanllengeText, chanllengeText2, chanllengeTimes, chanllengeTimes2, Set;
    GifImageView gif1, gif2;
    Button gotochanllengeBtn;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_challenge, container, false);

//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setDisplayHomeAsUpEnabled(true);


        textView = view.findViewById(R.id.txt);
        chanllengeText = view.findViewById(R.id.chanllengetext);
        chanllengeText2 = view.findViewById(R.id.chanllengetext2);
        chanllengeTimes = view.findViewById(R.id.chanllengetimes);
        chanllengeTimes2 = view.findViewById(R.id.chanllengetimes2);
        Set = view.findViewById(R.id.set);
        gif1 = view.findViewById(R.id.gif1);
        gif2 = view.findViewById(R.id.gif2);
        gotochanllengeBtn = view.findViewById(R.id.gotochanllengebtn);


        //讀取當天日期
        timeText = view.findViewById(R.id.txt2);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日");
        Date curDate = new Date(System.currentTimeMillis()); // 獲取當前時間
        String today = formatter.format(curDate);

        //建立日期的SharedPreferences
        SharedPreferences timePref = getActivity().getSharedPreferences("DATE", MODE_PRIVATE);
        String date = getActivity().getSharedPreferences("DATE", MODE_PRIVATE)//讀取儲存的日期
                .getString("date", "");

//        textView.setText("date="+date);
        timeText.setText(today);



        if (!date.equals(today)) { //是否已換日
            //更新存入的日期
            timePref.edit()
                    .putString("date", today)
                    .commit();


            String dailyChanllenge = changeChanllenge();//呼叫changeChanllenge
            String[] dailyChanllenges = dailyChanllenge.split(",");
            //儲存今日的挑戰
            SharedPreferences pref = getActivity().getSharedPreferences("CHANLLENGE", MODE_PRIVATE);
            pref.edit()
                    .putString("chanllenge", dailyChanllenge)
                    .commit();
            //顯示今日的挑戰
            chanllengeText.setText(dailyChanllenges[0]);
            chanllengeText2.setText(dailyChanllenges[2]);
            chanllengeTimes.setText(dailyChanllenges[1]);
            chanllengeTimes2.setText(dailyChanllenges[3]);
            Set.setText(dailyChanllenges[4]);

            if (dailyChanllenges[0].equals("壺鈴擺盪")) {
                gif1.setImageResource(R.drawable.kettlebell_swings);
            } else if (dailyChanllenges[0].equals("壺鈴硬舉")) {
                gif1.setImageResource(R.drawable.kettlebell_deadlift);
            } else if (dailyChanllenges[0].equals("壺鈴推舉")) {
                gif1.setImageResource(R.drawable.kettlebell_press);
            } else if (dailyChanllenges[0].equals("壺鈴單手划船")) {
                gif1.setImageResource(R.drawable.kettlebell_bent_over_row);
            } else if (dailyChanllenges[0].equals("壺鈴深蹲")) {
                gif1.setImageResource(R.drawable.kettlebell_squat);
            }

            if (dailyChanllenges[2].equals("壺鈴擺盪")) {
                gif2.setImageResource(R.drawable.kettlebell_swings);
            } else if (dailyChanllenges[2].equals("壺鈴硬舉")) {
                gif2.setImageResource(R.drawable.kettlebell_deadlift);
            } else if (dailyChanllenges[2].equals("壺鈴推舉")) {
                gif2.setImageResource(R.drawable.kettlebell_press);
            } else if (dailyChanllenges[2].equals("壺鈴單手划船")) {
                gif2.setImageResource(R.drawable.kettlebell_bent_over_row);
            } else if (dailyChanllenges[2].equals("壺鈴深蹲")) {
                gif2.setImageResource(R.drawable.kettlebell_squat);
            }


        } else {
            String dailyChanllenge = getActivity().getSharedPreferences("CHANLLENGE", MODE_PRIVATE)
                    .getString("chanllenge", "");
            String[] dailyChanllenges = dailyChanllenge.split(",");
            //顯示今日的挑戰
            chanllengeText.setText(dailyChanllenges[0]);
            chanllengeText2.setText(dailyChanllenges[2]);
            chanllengeTimes.setText(dailyChanllenges[1]);
            chanllengeTimes2.setText(dailyChanllenges[3]);
            Set.setText(dailyChanllenges[4]);

            //根據今天的挑戰抓GIF
            if (dailyChanllenges[0].equals("壺鈴擺盪")) {
                gif1.setImageResource(R.drawable.kettlebell_swings);
            } else if (dailyChanllenges[0].equals("壺鈴硬舉")) {
                gif1.setImageResource(R.drawable.kettlebell_deadlift);
            } else if (dailyChanllenges[0].equals("壺鈴推舉")) {
                gif1.setImageResource(R.drawable.kettlebell_press);
            } else if (dailyChanllenges[0].equals("壺鈴單手划船")) {
                gif1.setImageResource(R.drawable.kettlebell_bent_over_row);
            } else if (dailyChanllenges[0].equals("壺鈴深蹲")) {
                gif1.setImageResource(R.drawable.kettlebell_squat);
            }

            if (dailyChanllenges[2].equals("壺鈴擺盪")) {
                gif2.setImageResource(R.drawable.kettlebell_swings);
            } else if (dailyChanllenges[2].equals("壺鈴硬舉")) {
                gif2.setImageResource(R.drawable.kettlebell_deadlift);
            } else if (dailyChanllenges[2].equals("壺鈴推舉")) {
                gif2.setImageResource(R.drawable.kettlebell_press);
            } else if (dailyChanllenges[2].equals("壺鈴單手划船")) {
                gif2.setImageResource(R.drawable.kettlebell_bent_over_row);
            } else if (dailyChanllenges[2].equals("壺鈴深蹲")) {
                gif2.setImageResource(R.drawable.kettlebell_squat);
            }
        }



        return view;
    }


    public String changeChanllenge() {
        String chanllenge = "";
        String times = "";
        String ugoki = "";
        int oldnumber = 0;
        String[] chanllenges = new String[2];
        Random random = new Random();
        for (int i = 0; i < 2; i++) {
            int number = random.nextInt(5) + 1;
            //第二個動作不與第一個動作重複
            while (oldnumber == number) {
                number = random.nextInt(5) + 1;
            }
            //儲存上個動作的編號
            oldnumber = number;

            switch (number) {
                case 1:
                    ugoki = "壺鈴擺盪";
                    break;
                case 2:
                    ugoki = "壺鈴硬舉";
                    break;
                case 3:
                    ugoki = "壺鈴推舉";
                    break;
                case 4:
                    ugoki = "壺鈴單手划船";
                    break;
                case 5:
                    ugoki = "壺鈴深蹲";
                    break;
            }
            ugoki = ugoki + ",";

            int rand = random.nextInt(4) + 1;
            switch (rand) {
                case 1:
                    times = "5下";
                    break;
                case 2:
                    times = "10下";
                    break;
                case 3:
                    times = "15下";
                    break;
                case 4:
                    times = "20下";
                    break;
            }
            times = times + ",";
            chanllenge = chanllenge + ugoki + times;
            chanllenges[i] = ugoki;
        }

        int setTimes = random.nextInt(3) + 1;
        chanllenge = chanllenge + "共" + setTimes + "組";
        return chanllenge;
    }
}