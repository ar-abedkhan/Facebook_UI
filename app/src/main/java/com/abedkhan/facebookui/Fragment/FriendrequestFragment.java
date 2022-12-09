package com.abedkhan.facebookui.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abedkhan.facebookui.Adapters.FriendReqAdapter;
import com.abedkhan.facebookui.Models.FriendModel;
import com.abedkhan.facebookui.R;
import com.abedkhan.facebookui.Storymodel;
import com.abedkhan.facebookui.databinding.FragmentFriendrequestBinding;

import java.util.ArrayList;
import java.util.List;

public class FriendrequestFragment extends Fragment {

    public FriendrequestFragment() {
    }


    FragmentFriendrequestBinding binding;
List<FriendModel>friendModelList;








    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentFriendrequestBinding.inflate(getLayoutInflater(),container,false);
friendModelList=new ArrayList<>();
friendreqData();

        FriendReqAdapter friendReqAdapter=new FriendReqAdapter(friendModelList,requireContext());
        binding.froendReqRecycler.setAdapter(friendReqAdapter);
















        return binding.getRoot();
    }

    private void friendreqData() {

        friendModelList.add(new FriendModel("2 Mutual friends","Confirm","Delete","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS9W5wKFJz73EYsMh58kD2Z2UGukbtvx5B-mg&usqp=CAU","Abed khan","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRnZc4nu61fo87fwxBfVNGokRj1TP8t6IrdEQ&usqp=CAU"));
        friendModelList.add(new FriendModel("22 Mutual friends","Confirm","Delete","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ7f0AVeO0ZpL7PfUflnts_75mPZEm36sj4PQ&usqp=CAU","Abir khan","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGSc-y8_bKQCV9PQy2D1SZkA4Yb4bOewjw3A&usqp=CAU"));
        friendModelList.add(new FriendModel("7 Mutual friends","Confirm","Delete","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRnZc4nu61fo87fwxBfVNGokRj1TP8t6IrdEQ&usqp=CAU","Md khan","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS9W5wKFJz73EYsMh58kD2Z2UGukbtvx5B-mg&usqp=CAU"));
        friendModelList.add(new FriendModel("89 Mutual friends","Confirm","Delete","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRsHfXdo_W1l7Jcm0LAi5EmB2oMT3mrfgxmAA&usqp=CAU","Nazmul khan","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSPOoZOWOD3oOnaevjLT4VR5-T8jG8uPEvByg&usqp=CAU"));
        friendModelList.add(new FriendModel("94 Mutual friends","Confirm","Delete","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTRJWtKYksMR7gxxGS65hfBeJc97hf0UxwPqg&usqp=CAU","Juyel Raj","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ7f0AVeO0ZpL7PfUflnts_75mPZEm36sj4PQ&usqp=CAU"));
        friendModelList.add(new FriendModel("6 Mutual friends","Confirm","Delete","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR0Db_rqnoHx4JMQ_C5IbAbrXlohbP8TwQ2Lw&usqp=CAU","Faria khan","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRVfR2dE6NIMeFTPbHNRTKWLXS9G9OYp6zRRg&usqp=CAU"));
        friendModelList.add(new FriendModel("1 Mutual friends","Confirm","Delete","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ8J1l-rceZJyefqnMdLtIaqX2q72MoEZJJ4Q&usqp=CAU","Farha islam","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQRrabli-wbpRCyzD1Wvma9YI4dtUYZ0rNC9FFmbk4pws08F6GZMv1Fj4MeXbmk0bU8GYo&usqp=CAU"));
        friendModelList.add(new FriendModel("1 Mutual friends","Confirm","Delete","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGSc-y8_bKQCV9PQy2D1SZkA4Yb4bOewjw3A&usqp=CAU","Anabiya Rahman","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ8J1l-rceZJyefqnMdLtIaqX2q72MoEZJJ4Q&usqp=CAU"));
        friendModelList.add(new FriendModel("42 Mutual friends","Confirm","Delete","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSPOoZOWOD3oOnaevjLT4VR5-T8jG8uPEvByg&usqp=CAU","Joy khan","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR0Db_rqnoHx4JMQ_C5IbAbrXlohbP8TwQ2Lw&usqp=CAU"));
        friendModelList.add(new FriendModel("102 Mutual friends","Confirm","Delete","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRVfR2dE6NIMeFTPbHNRTKWLXS9G9OYp6zRRg&usqp=CAU","Bablu Mia","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRsHfXdo_W1l7Jcm0LAi5EmB2oMT3mrfgxmAA&usqp=CAU"));
        friendModelList.add(new FriendModel("3 Mutual friends","Confirm","Delete","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQRrabli-wbpRCyzD1Wvma9YI4dtUYZ0rNC9FFmbk4pws08F6GZMv1Fj4MeXbmk0bU8GYo&usqp=CAU","Md A.k Rahman","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTRJWtKYksMR7gxxGS65hfBeJc97hf0UxwPqg&usqp=CAU"));

    }
}