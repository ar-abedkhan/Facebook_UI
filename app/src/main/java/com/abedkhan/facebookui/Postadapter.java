package com.abedkhan.facebookui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;


public class Postadapter extends RecyclerView.Adapter<PostViewholder> {
    List<Postmodel> postlist;
    Context context;

    public Postadapter(List<Postmodel> postlist, Context context) {
        this.postlist = postlist;
        this.context = context;
    }

    @NonNull
    @Override
    public PostViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.postdesign,parent,false);

        return new PostViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewholder holder, int position) {

        Postmodel postmodel=postlist.get(position);


        holder.profilename.setText(postmodel.idname);
        holder.caption.setText(postmodel.caption);

        String postup=postmodel.getPostupload();
        Glide.with(context).load(postup).into(holder.post);

        String profilepic=postmodel.getProfileimage();
        Glide.with(context).load(profilepic).into(holder.profileimage);








    }

    @Override
    public int getItemCount() {
        return postlist.size();
    }
}
