package com.abedkhan.facebookui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class StoryAdapter extends RecyclerView.Adapter<StoryViewholder> {
    List<Storymodel>storylist;
    Context context;

    public StoryAdapter(List<Storymodel> storylist, Context context) {
        this.storylist = storylist;
        this.context = context;
    }

    @NonNull
    @Override
    public StoryViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view =LayoutInflater.from(context).inflate(R.layout.storydesign,parent,false);

        return new StoryViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoryViewholder holder, int position) {

    Storymodel storymodel=storylist.get(position);


      holder.profilename.setText(storymodel.getIdname());


      String upstory =storymodel.getStoryupload();
      String profileimg =storymodel.getImage();

        Glide.with(context).load(upstory).into(holder.story);

        Glide.with(context).load(profileimg).into(holder.profileimage);
    }

    @Override
    public int getItemCount() {
        return storylist.size();
    }
}
