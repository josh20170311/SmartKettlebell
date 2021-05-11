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
    TextView  timeText, challengeText, challengeText2, challengeTimes, challengeTimes2, Set;
    GifImageView gif1, gif2;
    Button gotoChallengeBtn;
    public static String PREFERENCE_NAME_CHALLENGE = "CHALLENGE";
    public static String PREFERENCE_KEY_DATE = "date";
    public static String PREFERENCE_KEY_CHALLENGE = "challenge";
    SharedPreferences challengePref;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_challenge, container, false);

        challengeText = view.findViewById(R.id.challengetext);
        challengeText2 = view.findViewById(R.id.challengetext2);
        challengeTimes = view.findViewById(R.id.challengetimes);
        challengeTimes2 = view.findViewById(R.id.challengetimes2);
        Set = view.findViewById(R.id.set);
        gif1 = view.findViewById(R.id.gif1);
        gif2 = view.findViewById(R.id.gif2);
        gotoChallengeBtn = view.findViewById(R.id.gotochallengebtn);


        //讀取當天日期
        timeText = view.findViewById(R.id.txt2);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日", Locale.getDefault());
        Date curDate = new Date(); // 獲取當前時間
        String today = formatter.format(curDate);

        //建立SharedPreferences
        challengePref = getActivity().getSharedPreferences(PREFERENCE_NAME_CHALLENGE, MODE_PRIVATE);
        String date = challengePref.getString(PREFERENCE_KEY_DATE, "");//讀取儲存的日期
        timeText.setText(today);
        //是否已換日
        if (!date.equals(today)) {
            //更新存入的日期
            challengePref.edit()
                    .putString(PREFERENCE_KEY_DATE, today)
                    .apply();

            //儲存今日的挑戰
            challengePref.edit()
                    .putString(PREFERENCE_KEY_CHALLENGE, changeChallenge())
                    .apply();
        }

        String[] dailyChallenges = challengePref.getString(PREFERENCE_KEY_CHALLENGE, "")
                .split(",");
        //顯示今日的挑戰
        challengeText.setText(dailyChallenges[0]);
        challengeText2.setText(dailyChallenges[2]);
        challengeTimes.setText(dailyChallenges[1]);
        challengeTimes2.setText(dailyChallenges[3]);
        Set.setText(dailyChallenges[4]);

        //根據今天的挑戰抓GIF
        setGif(gif1,dailyChallenges[0]);
        setGif(gif2,dailyChallenges[2]);

        return view;
    }

    void setGif(GifImageView gif,String dailyChallenge){
        switch (dailyChallenge) {
            case "壺鈴擺盪":
                gif.setImageResource(R.drawable.kettlebell_swings);
                break;
            case "壺鈴硬舉":
                gif.setImageResource(R.drawable.kettlebell_deadlift);
                break;
            case "壺鈴推舉":
                gif.setImageResource(R.drawable.kettlebell_press);
                break;
            case "壺鈴單手划船":
                gif.setImageResource(R.drawable.kettlebell_bent_over_row);
                break;
            case "壺鈴深蹲":
                gif.setImageResource(R.drawable.kettlebell_squat);
                break;
        }
    }

    public String changeChallenge() {
        StringBuilder challengeString = new StringBuilder();
        String times = "";
        String exerciseName = "";
        int oldNumber = 0;
        Random random = new Random();
        for (int i = 0; i < 2; i++) {
            int number = random.nextInt(5) + 1;
            //第二個動作不與第一個動作重複
            while (oldNumber == number) {
                number = random.nextInt(5) + 1;
            }
            //儲存上個動作的編號
            oldNumber = number;

            switch (number) {
                case 1:
                    exerciseName = "壺鈴擺盪";
                    break;
                case 2:
                    exerciseName = "壺鈴硬舉";
                    break;
                case 3:
                    exerciseName = "壺鈴推舉";
                    break;
                case 4:
                    exerciseName = "壺鈴單手划船";
                    break;
                case 5:
                    exerciseName = "壺鈴深蹲";
                    break;
            }
            exerciseName += ",";

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
            times += ",";
            challengeString.append(exerciseName).append(times);
        }

        int setTimes = random.nextInt(3) + 1;
        challengeString.append("共").append(setTimes).append("組");
        return challengeString.toString();
    }
}