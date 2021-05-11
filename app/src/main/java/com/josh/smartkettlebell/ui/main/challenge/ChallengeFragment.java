package com.josh.smartkettlebell.ui.main.challenge;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.josh.smartkettlebell.R;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

import pl.droidsonroids.gif.GifImageView;

import static android.content.Context.MODE_PRIVATE;


public class ChallengeFragment extends Fragment {
    TextView textView, timeText, challengeText, challengeText2, challengeTimes, challengeTimes2, Set;
    GifImageView gif1, gif2;
    Button gotoChallengeBtn;
    public static String PREFERENCE_NAME_CHALLENGE = "CHALLENGE";
    public static String PREFERENCE_NAME_DATE = "DATE";
    public static String PREFERENCE_KEY_DATE = "date";
    public static String PREFERENCE_KEY_CHALLENGE = "challenge";


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
        challengeText = view.findViewById(R.id.chanllengetext);
        challengeText2 = view.findViewById(R.id.chanllengetext2);
        challengeTimes = view.findViewById(R.id.chanllengetimes);
        challengeTimes2 = view.findViewById(R.id.chanllengetimes2);
        Set = view.findViewById(R.id.set);
        gif1 = view.findViewById(R.id.gif1);
        gif2 = view.findViewById(R.id.gif2);
        gotoChallengeBtn = view.findViewById(R.id.gotochanllengebtn);


        //讀取當天日期
        timeText = view.findViewById(R.id.txt2);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日", Locale.getDefault());
        Date curDate = new Date(System.currentTimeMillis()); // 獲取當前時間
        String today = formatter.format(curDate);

        //建立日期的SharedPreferences
        SharedPreferences timePref = getActivity().getSharedPreferences(PREFERENCE_NAME_DATE, MODE_PRIVATE);
        String date = getActivity().getSharedPreferences(PREFERENCE_KEY_DATE, MODE_PRIVATE)//讀取儲存的日期
                .getString(PREFERENCE_KEY_DATE, "");

//        textView.setText("date="+date);
        timeText.setText(today);


        if (!date.equals(today)) { //是否已換日
            //更新存入的日期
            timePref.edit()
                    .putString("date", today)
                    .apply();


            String dailyChallenge = changeChallenge();//呼叫changeChallenge
            String[] dailyChallenges = dailyChallenge.split(",");
            //儲存今日的挑戰
            SharedPreferences pref = getActivity().getSharedPreferences(PREFERENCE_NAME_CHALLENGE, MODE_PRIVATE);
            pref.edit()
                    .putString(PREFERENCE_KEY_CHALLENGE, dailyChallenge)
                    .apply();
            //顯示今日的挑戰
            challengeText.setText(dailyChallenges[0]);
            challengeText2.setText(dailyChallenges[2]);
            challengeTimes.setText(dailyChallenges[1]);
            challengeTimes2.setText(dailyChallenges[3]);
            Set.setText(dailyChallenges[4]);

            switch (dailyChallenges[0]) {
                case "壺鈴擺盪":
                    gif1.setImageResource(R.drawable.kettlebell_swings);
                    break;
                case "壺鈴硬舉":
                    gif1.setImageResource(R.drawable.kettlebell_deadlift);
                    break;
                case "壺鈴推舉":
                    gif1.setImageResource(R.drawable.kettlebell_press);
                    break;
                case "壺鈴單手划船":
                    gif1.setImageResource(R.drawable.kettlebell_bent_over_row);
                    break;
                case "壺鈴深蹲":
                    gif1.setImageResource(R.drawable.kettlebell_squat);
                    break;
            }

            switch (dailyChallenges[2]) {
                case "壺鈴擺盪":
                    gif2.setImageResource(R.drawable.kettlebell_swings);
                    break;
                case "壺鈴硬舉":
                    gif2.setImageResource(R.drawable.kettlebell_deadlift);
                    break;
                case "壺鈴推舉":
                    gif2.setImageResource(R.drawable.kettlebell_press);
                    break;
                case "壺鈴單手划船":
                    gif2.setImageResource(R.drawable.kettlebell_bent_over_row);
                    break;
                case "壺鈴深蹲":
                    gif2.setImageResource(R.drawable.kettlebell_squat);
                    break;
            }


        } else {
            String dailyChallenge = getActivity().getSharedPreferences(PREFERENCE_KEY_CHALLENGE, MODE_PRIVATE)
                    .getString(PREFERENCE_KEY_CHALLENGE, "");
            String[] dailyChallenges = dailyChallenge.split(",");
            //顯示今日的挑戰
            challengeText.setText(dailyChallenges[0]);
            challengeText2.setText(dailyChallenges[2]);
            challengeTimes.setText(dailyChallenges[1]);
            challengeTimes2.setText(dailyChallenges[3]);
            Set.setText(dailyChallenges[4]);

            //根據今天的挑戰抓GIF
            switch (dailyChallenges[0]) {
                case "壺鈴擺盪":
                    gif1.setImageResource(R.drawable.kettlebell_swings);
                    break;
                case "壺鈴硬舉":
                    gif1.setImageResource(R.drawable.kettlebell_deadlift);
                    break;
                case "壺鈴推舉":
                    gif1.setImageResource(R.drawable.kettlebell_press);
                    break;
                case "壺鈴單手划船":
                    gif1.setImageResource(R.drawable.kettlebell_bent_over_row);
                    break;
                case "壺鈴深蹲":
                    gif1.setImageResource(R.drawable.kettlebell_squat);
                    break;
            }

            switch (dailyChallenges[2]) {
                case "壺鈴擺盪":
                    gif2.setImageResource(R.drawable.kettlebell_swings);
                    break;
                case "壺鈴硬舉":
                    gif2.setImageResource(R.drawable.kettlebell_deadlift);
                    break;
                case "壺鈴推舉":
                    gif2.setImageResource(R.drawable.kettlebell_press);
                    break;
                case "壺鈴單手划船":
                    gif2.setImageResource(R.drawable.kettlebell_bent_over_row);
                    break;
                case "壺鈴深蹲":
                    gif2.setImageResource(R.drawable.kettlebell_squat);
                    break;
            }
        }


        return view;
    }


    public String changeChallenge() {
        StringBuilder challenge = new StringBuilder();
        StringBuilder times = new StringBuilder();
        String ugoki = "";
        int oldnumber = 0;
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
                    times = new StringBuilder("5下");
                    break;
                case 2:
                    times = new StringBuilder("10下");
                    break;
                case 3:
                    times = new StringBuilder("15下");
                    break;
                case 4:
                    times = new StringBuilder("20下");
                    break;
            }
            times.append(",");
            challenge.append(ugoki).append(times);
        }

        int setTimes = random.nextInt(3) + 1;
        challenge.append("共").append(setTimes).append("組");
        return challenge.toString();
    }
}