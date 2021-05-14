package com.josh.smartkettlebell.ui.main.training.trainingplan;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.josh.smartkettlebell.R;
import com.josh.smartkettlebell.model.Exercise;
import com.josh.smartkettlebell.ui.main.training.trainingplan.addexercise.AddExerciseActivity;

import java.util.LinkedList;

public class ExerciseListAdapter extends RecyclerView.Adapter<ExerciseListAdapter.MyViewHolder> {

    LinkedList<Exercise> itemList;
    ItemTouchHelper touchHelper;
    TrainingPlanActivity trainingPlanActivity;

    ExerciseListAdapter(LinkedList<Exercise> list, ItemTouchHelper touchHelper, TrainingPlanActivity add) {
        itemList = list;
        this.touchHelper = touchHelper;
        this.trainingPlanActivity = add;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_exercise_list, parent, false);

        return new MyViewHolder(view);
    }


    @SuppressLint("ClickableViewAccessibility")
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_action_name.setText(itemList.get(position).getName());
        holder.tv_action_number.setText(String.valueOf(itemList.get(position).getNumber()));
        holder.btn.setOnClickListener(e -> {
            MyViewHolder viewHolder = (MyViewHolder) e.getTag();//找出自己的viewHolder
            int true_position = viewHolder.getAdapterPosition();
            Intent intent = new Intent(trainingPlanActivity, AddExerciseActivity.class);
            intent.putExtra(TrainingPlanActivity.EXTRA_EXERCISE_POSITION, true_position);
            intent.putExtra(TrainingPlanActivity.EXTRA_EXERCISE_NAME, viewHolder.tv_action_name.getText().toString());
            intent.putExtra(TrainingPlanActivity.EXTRA_EXERCISE_NUMBER, viewHolder.tv_action_number.getText().toString());
            intent.putExtra(TrainingPlanActivity.EXTRA_REQUEST_CODE, TrainingPlanActivity.REQUEST_CODE_EDIT_EXERCISE);

            trainingPlanActivity.startActivityForResult(intent, TrainingPlanActivity.REQUEST_CODE_EDIT_EXERCISE);
        });

        holder.iv_drag_handle.setOnTouchListener((View v, MotionEvent e) -> {
            if (e.getActionMasked() == MotionEvent.ACTION_DOWN)
                touchHelper.startDrag(holder);
            return false;
        });

        switch (itemList.get(position).getName()) {
            case "swing":
                holder.iv.setImageResource(R.drawable.swing);
                break;
            case "squat":
                holder.iv.setImageResource(R.drawable.squat);
                break;
            case "deadlift":
                holder.iv.setImageResource(R.drawable.deadlift);
                break;
            case "row":
                holder.iv.setImageResource(R.drawable.row);
                break;
            case "push":
                holder.iv.setImageResource(R.drawable.push);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView iv;
        ImageView iv_drag_handle;
        TextView tv_action_name;
        TextView tv_action_number;
        Button btn;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.iv_exercise_photo);
            tv_action_name = itemView.findViewById(R.id.tv_exercise_name);
            tv_action_number = itemView.findViewById(R.id.tv_exercise_number);
            btn = itemView.findViewById(R.id.btn_exercise_edit);
            iv_drag_handle = itemView.findViewById(R.id.iv_drag_handle);
            btn.setTag(this);//記住自己的viewHolder
        }

    }
}
