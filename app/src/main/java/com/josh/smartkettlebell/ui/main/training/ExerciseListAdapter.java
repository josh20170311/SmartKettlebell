package com.josh.smartkettlebell.ui.main.training;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.josh.smartkettlebell.R;
import com.josh.smartkettlebell.db.MyContract;
import com.josh.smartkettlebell.db.MyDBHelper;


public class ExerciseListAdapter extends RecyclerView.Adapter<ExerciseListAdapter.ViewHolder> {
    Context context;
    MyDBHelper myDBHelper;
    Cursor cursor_exercise;

    ExerciseListAdapter(Context context, long id) {
        this.context = context;
        myDBHelper = new MyDBHelper(context, MyContract.DATABASE_NAME);
        cursor_exercise = myDBHelper.getRecords(id);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_exercise_list_in_training_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        cursor_exercise.moveToPosition(position);
        String name = cursor_exercise.getString(cursor_exercise.getColumnIndex(MyContract.RecordEntry.COLUMN_EXERCISE_NAME));
        String number = cursor_exercise.getString(cursor_exercise.getColumnIndex(MyContract.RecordEntry.COLUMN_NUMBER));
        holder.tv_name.setText(name);
        holder.tv_number.setText(number);
        setImage(name,holder.iv_mini_photo);
    }

    @Override
    public int getItemCount() {
        return cursor_exercise.getCount();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_name;
        TextView tv_number;
        ImageView iv_mini_photo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name = itemView.findViewById(R.id.tv_exercise_item_name);
            tv_number = itemView.findViewById(R.id.tv_exercise_item_number);
            iv_mini_photo = itemView.findViewById(R.id.iv_exercise_mini_photo);
        }
    }

    void setImage(String name, ImageView iv){
        switch (name){
            case "row":
                iv.setImageResource(R.drawable.row);
                break;
            case "push":
                iv.setImageResource(R.drawable.push);
                break;
            case "deadlift":
                iv.setImageResource(R.drawable.deadlift);
                break;
            case "squat":
                iv.setImageResource(R.drawable.squat);
                break;
            case "swing":
                iv.setImageResource(R.drawable.swing);
                break;
        }
    }

}
