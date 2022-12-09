package com.abedkhan.facebookui.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.abedkhan.facebookui.FriendReqViewholder.FriendReqViewholder;
import com.abedkhan.facebookui.Models.FriendModel;
import com.abedkhan.facebookui.R;
import com.bumptech.glide.Glide;

import java.util.List;

public class FriendReqAdapter extends RecyclerView.Adapter<FriendReqViewholder> {

    List<FriendModel>friendModelList;
    Context context;

    public FriendReqAdapter(List<FriendModel> friendModelList, Context context) {
        this.friendModelList = friendModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public FriendReqViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.friendsdesign,parent,false);

        return new FriendReqViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FriendReqViewholder holder, int position) {

        FriendModel friendModel=friendModelList.get(position);

        holder.delatebtn.setText(friendModel.getDeleteBtn());
        holder.cinfirmbtn.setText(friendModel.getConfirmbtn());
        holder.reqProfilename.setText(friendModel.getReqProName());
        holder.mutualProfileCount.setText(friendModel.getMutualCount());


        Glide.with(context).load(friendModel.getMutualImg()).into(holder.mitualProfileImg);
        Glide.with(context).load(friendModel.getReqProImg()).into(holder.reqProfileImg);







    }

    @Override
    public int getItemCount() {
        return friendModelList.size();
    }
}
