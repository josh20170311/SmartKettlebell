package com.josh.smartkettlebell.ui.main.challenge;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.josh.smartkettlebell.R;
import com.josh.smartkettlebell.model.Exercise;
import com.josh.smartkettlebell.ui.main.training.trainingplan.training.TrainingActivity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Random;

import pl.droidsonroids.gif.GifImageView;

import static android.content.Context.MODE_PRIVATE;


public class ChallengeFragment extends Fragment {
    public static String PREFERENCE_NAME_CHALLENGE = "CHALLENGE";
    public static String PREFERENCE_KEY_DATE = "date";
    public static String PREFERENCE_KEY_CHALLENGE = "challenge";
    public static String PREFERENCE_KEY_DONE = "done";
    public static int REQUEST_CODE_CHALLENGE = 1000;
    public static int RESULT_CODE_CHALLENGE = 1001;
    TextView  timeText, challengeText, challengeText2, challengeTimes, challengeTimes2, Set;
    GifImageView gif1, gif2;
    Button gotoChallengeBtn;
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
            //更新Preference
            challengePref.edit()
                    .putString(PREFERENCE_KEY_DATE, today)
                    .putString(PREFERENCE_KEY_CHALLENGE, changeChallenge())
                    .putBoolean(PREFERENCE_KEY_DONE,false)
                    .apply();
        }

        String[] dailyChallenges = challengePref.getString(PREFERENCE_KEY_CHALLENGE, "")
                .split(",");
        //顯示今日的挑戰
        challengeText.setText(dailyChallenges[0]);
        challengeText2.setText(dailyChallenges[2]);
        challengeTimes.setText(String.format("%s下", dailyChallenges[1]));
        challengeTimes2.setText(String.format("%s下", dailyChallenges[3]));
        Set.setText(String.format("各%s組", dailyChallenges[4]));

        //根據今天的挑戰抓GIF
        setGif(gif1,dailyChallenges[0]);
        setGif(gif2,dailyChallenges[2]);

        if(challengePref.getBoolean(PREFERENCE_KEY_DONE,false)){
            disableGotoBtn();
            return view;
        }

        gotoChallengeBtn.setOnClickListener(e -> {
            String[] challenges = challengePref.getString(PREFERENCE_KEY_CHALLENGE,null).split(",");
            LinkedList<Exercise> exerciseList = new LinkedList<>();

            for (int i = 0; i < Integer.parseInt(challenges[4]); i++) {
                Exercise exercise1 = new Exercise(challenges[0],Integer.parseInt(challenges[1]));
                Exercise exercise2 = new Exercise(challenges[2],Integer.parseInt(challenges[3]));
                exerciseList.add(exercise1);
                exerciseList.add(exercise2);
            }

            Intent intent = new Intent(getContext(), TrainingActivity.class);
            intent.putExtra(TrainingActivity.EXTRA_LIST,exerciseList);
            intent.putExtra(TrainingActivity.EXTRA_REQUEST_CODE, REQUEST_CODE_CHALLENGE);
            startActivityForResult(intent, REQUEST_CODE_CHALLENGE);

        });


        return view;
    }

    void setGif(GifImageView gif,String dailyChallenge){
        switch (dailyChallenge) {
            case "swing":
                gif.setImageResource(R.drawable.kettlebell_swings);
                break;
            case "deadlift":
                gif.setImageResource(R.drawable.kettlebell_deadlift);
                break;
            case "push":
                gif.setImageResource(R.drawable.kettlebell_press);
                break;
            case "row":
                gif.setImageResource(R.drawable.kettlebell_bent_over_row);
                break;
            case "squat":
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
                    exerciseName = "swing";
                    break;
                case 2:
                    exerciseName = "deadlift";
                    break;
                case 3:
                    exerciseName = "push";
                    break;
                case 4:
                    exerciseName = "row";
                    break;
                case 5:
                    exerciseName = "squat";
                    break;
            }
            exerciseName += ",";

            int rand = random.nextInt(4) + 1;
            switch (rand) {
                case 1:
                    times = "5";
                    break;
                case 2:
                    times = "10";
                    break;
                case 3:
                    times = "15";
                    break;
                case 4:
                    times = "20";
                    break;
            }
            times += ",";
            challengeString.append(exerciseName).append(times);
        }

        int setTimes = random.nextInt(3) + 1;
        challengeString.append(setTimes);
        return challengeString.toString();
    }

    public void disableGotoBtn(){
        gotoChallengeBtn.setText("今日已完成挑戰");
        gotoChallengeBtn.setEnabled(false);
    }
}