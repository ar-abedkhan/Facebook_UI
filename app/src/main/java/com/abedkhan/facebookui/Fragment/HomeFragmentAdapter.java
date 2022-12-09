package com.abedkhan.facebookui.Fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class HomeFragmentAdapter extends FragmentPagerAdapter {
    String [] name ={"Home","Friends","Videos","Shop","Notification","Drawermenu"};

    public HomeFragmentAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new FriendrequestFragment();
            case 2:
                return new VideosFragment();
            case 3:
                return new ShoppingFragment();
            case 4:
                return new NotificationFragment();
            case 5:
                return new DrawerMenuFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return name.length;
    }
}
