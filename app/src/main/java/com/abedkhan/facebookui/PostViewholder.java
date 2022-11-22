package com.abedkhan.facebookui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import de.hdodenhof.circleimageview.CircleImageView;

public class PostViewholder extends RecyclerView.ViewHolder {

    ImageView post;
    CircleImageView profileimage;
    TextView profilename,caption;


    public PostViewholder(@NonNull View itemView) {
        super(itemView);


        post=itemView.findViewById(R.id.postimg);
        profileimage=itemView.findViewById(R.id.profilepic);
        profilename=itemView.findViewById(R.id.profilename);
        caption=itemView.findViewById(R.id.caption_text);


    }
}
