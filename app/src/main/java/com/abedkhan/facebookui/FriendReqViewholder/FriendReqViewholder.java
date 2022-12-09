package com.abedkhan.facebookui.FriendReqViewholder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;

import com.abedkhan.facebookui.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class FriendReqViewholder extends RecyclerView.ViewHolder {
    public CircleImageView reqProfileImg,mitualProfileImg;
    public TextView reqProfilename,mutualProfileCount;
    public AppCompatButton cinfirmbtn,delatebtn;


    public FriendReqViewholder(@NonNull View itemView) {
       super(itemView);

       mitualProfileImg=itemView.findViewById(R.id.mutualfdimg);
       reqProfileImg=itemView.findViewById(R.id.requestpersonimage);
       reqProfilename=itemView.findViewById(R.id.requestpersonname);
       mutualProfileCount=itemView.findViewById(R.id.mutualfd);
       cinfirmbtn=itemView.findViewById(R.id.confirm_button);
       delatebtn=itemView.findViewById(R.id.delate_button);





    }
}
