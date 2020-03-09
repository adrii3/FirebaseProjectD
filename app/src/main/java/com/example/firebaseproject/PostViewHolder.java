package com.example.firebaseproject;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class PostViewHolder extends RecyclerView.ViewHolder{
    ImageView authorPhotoImageView;
    TextView authorTextView, contentTextView;

    PostViewHolder(@NonNull View itemView) {
        super(itemView);

        authorPhotoImageView = itemView.findViewById(R.id.authorPhotoImageView);
        authorTextView = itemView.findViewById(R.id.authorTextView);
        contentTextView = itemView.findViewById(R.id.contentTextView);
    }
}