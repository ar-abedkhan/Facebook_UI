package com.abedkhan.facebookui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.abedkhan.facebookui.Fragment.FriendrequestFragment;
import com.abedkhan.facebookui.Fragment.HomeFragmentAdapter;
import com.abedkhan.facebookui.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
List<Storymodel>storylist;
List<Postmodel>postmodelList;
FragmentManager fragmentManager;
HomeFragmentAdapter homeFragmentAdapter;
RecyclerView storyrecyclerview,postrecyclerview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



//Toolbar toolbar=findViewById(R.id.mytoolbar1);
//setSupportActionBar(toolbar);

fragmentsetup();



    }

    private void fragmentsetup() {

        fragmentManager =getSupportFragmentManager();
        homeFragmentAdapter =new HomeFragmentAdapter(fragmentManager,101);
        binding.viewpager.setAdapter(homeFragmentAdapter);

        binding.tablayout.setupWithViewPager(binding.viewpager);

        binding.tablayout.getTabAt(0).setIcon(R.drawable.ic_baseline_home_24);
        binding.tablayout.getTabAt(1).setIcon(R.drawable.ic_baseline_people_outline_24);
        binding.tablayout.getTabAt(2).setIcon(R.drawable.ic_baseline_ondemand_video_24);
        binding.tablayout.getTabAt(3).setIcon(R.drawable.ic_baseline_storefront_24);
        binding.tablayout.getTabAt(4).setIcon(R.drawable.ic_baseline_notifications_none_24);
        binding.tablayout.getTabAt(5).setIcon(R.drawable.user);





    }


    //post array list


}