package com.example.workoutroom.exercises;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.workoutroom.R;

public class ExViewHolder extends RecyclerView.ViewHolder {

    private Button settingsExButton;
    private final TextView tvNameEx;
    private final TextView tvDescriptionEx;
    private final TextView tvTimeEx;
    private final ImageView imageView;

    public ExViewHolder(@NonNull View itemView) {
        super(itemView);
        tvNameEx = itemView.findViewById(R.id.tvNameRow);
        tvDescriptionEx = itemView.findViewById(R.id.tvDescriptionRow);
        tvTimeEx = itemView.findViewById(R.id.tvTimeRow);
        imageView = itemView.findViewById(R.id.imageView);
        settingsExButton = itemView.findViewById(R.id.settingsExButton);
    }

    public void bind(String nameEx, String descriptionEx, int timeEx, Bitmap imageEx) {
        tvNameEx.setText(nameEx);
        tvDescriptionEx.setText(descriptionEx);
        tvTimeEx.setText(timeEx + " Sec");
        imageView.setImageBitmap(imageEx);
        settingsExButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    static ExViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_ex_layout, parent, false);
        return new ExViewHolder(view);
    }

    public void delete(){

    }
}
