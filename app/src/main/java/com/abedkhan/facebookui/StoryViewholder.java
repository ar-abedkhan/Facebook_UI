package com.abedkhan.facebookui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import de.hdodenhof.circleimageview.CircleImageView;

public class StoryViewholder extends RecyclerView.ViewHolder {

    ImageView story;
    CircleImageView profileimage;
    TextView profilename;


    public StoryViewholder(@NonNull View itemView) {
        super(itemView);


        story=itemView.findViewById(R.id.storyupload);
        profileimage=itemView.findViewById(R.id.idprofile);
        profilename=itemView.findViewById(R.id.idname);



    }
}
