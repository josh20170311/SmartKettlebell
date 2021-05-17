package com.josh.smartkettlebell.ui.main.training;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.josh.smartkettlebell.R;
import com.josh.smartkettlebell.db.MyContract;
import com.josh.smartkettlebell.db.MyDBHelper;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TrainingListAdapter extends RecyclerView.Adapter<TrainingListAdapter.ViewHolder> {
    Context context;
    Cursor cursor_training;
    MyDBHelper myDBHelper;
    SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm", Locale.TAIWAN);

    TrainingListAdapter(Context context) {
        this.context = context;
        myDBHelper = new MyDBHelper(context, MyContract.DATABASE_NAME);
        cursor_training = myDBHelper.getTrainingsOfToday();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_training_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        cursor_training.moveToPosition(position);
        long startTime = cursor_training.getLong(cursor_training.getColumnIndex(MyContract.TrainingEntry.COLUMN_DATE));
        long endTime = startTime + 1000 * cursor_training.getLong(cursor_training.getColumnIndex(MyContract.TrainingEntry.COLUMN_DURATION));
        long id = cursor_training.getLong(cursor_training.getColumnIndex(MyContract.TrainingEntry._ID));
        holder.tv_start_time.setText(dateFormat.format(new Date(startTime)));
        holder.tv_end_time.setText(dateFormat.format(new Date(endTime)));
        holder.rv_exerciseList.setLayoutManager(new LinearLayoutManager(context));
        holder.rv_exerciseList.setAdapter(new ExerciseListAdapter(context, id));
    }

    @Override
    public int getItemCount() {
        return cursor_training.getCount();
    }

    public void update() {
        cursor_training = myDBHelper.getTrainingsOfToday();
        notifyDataSetChanged();
    }

    public int getTrainingCount(){
        return cursor_training.getCount();
    }


    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_start_time;
        TextView tv_end_time;
        RecyclerView rv_exerciseList;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_start_time = itemView.findViewById(R.id.tv_training_list_start_time);
            tv_end_time = itemView.findViewById(R.id.tv_training_list_end_time);
            rv_exerciseList = itemView.findViewById(R.id.rv_exercise_list);

        }
    }
}
