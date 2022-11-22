package com.abedkhan.facebookui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProfileSViewholder extends RecyclerView.ViewHolder {

    TextView count,title;
    ImageView story;
    public ProfileSViewholder(@NonNull View itemView) {
        super(itemView);
        count=itemView.findViewById(R.id.totalimage);
        title=itemView.findViewById(R.id.storytitle);
        story=itemView.findViewById(R.id.profilestory);
    }
}
