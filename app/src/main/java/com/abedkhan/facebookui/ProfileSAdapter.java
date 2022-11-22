package com.abedkhan.facebookui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ProfileSAdapter extends RecyclerView.Adapter<ProfileSViewholder> {
    List<Profilestory>profilestories;
    Context context;

    public ProfileSAdapter(List<Profilestory> profilestories, Context context) {
        this.profilestories = profilestories;
        this.context = context;
    }

    @NonNull
    @Override
    public ProfileSViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.profilestory,parent,false);

        return new ProfileSViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileSViewholder holder, int position) {
     Profilestory profilestory=profilestories.get(position);

     holder.count.setText(profilestory.getImagecount());
     holder.title.setText(profilestory.getTitle());

     String pstory=profilestory.getProfilestory();
        Glide.with(context).load(pstory).into(holder.story);
    }

    @Override
    public int getItemCount() {
        return profilestories.size();
    }
}
