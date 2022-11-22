package com.abedkhan.facebookui.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abedkhan.facebookui.Myprofile;
import com.abedkhan.facebookui.Postadapter;
import com.abedkhan.facebookui.Postmodel;
import com.abedkhan.facebookui.R;
import com.abedkhan.facebookui.StoryAdapter;
import com.abedkhan.facebookui.Storymodel;
import com.abedkhan.facebookui.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    public HomeFragment() {

    }
    FragmentHomeBinding binding;
    List<Storymodel> storylist;
    List<Postmodel>postmodelList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentHomeBinding.inflate(getLayoutInflater(),container,false);



storylist=new ArrayList<>();
postmodelList=new ArrayList<>();

storyarraydata();
postarraylist();

StoryAdapter storyAdapter=new StoryAdapter(storylist,requireActivity());
binding.storyRecyclerview.setAdapter(storyAdapter);

Postadapter postadapter=new Postadapter(postmodelList,requireActivity());
binding.postrecyclerview.setAdapter(postadapter);


        binding.profile.setOnClickListener(view -> {
            startActivity(new Intent(requireActivity(),Myprofile.class));
        });




        return binding.getRoot();

    }

    private void postarraylist() {


        postmodelList.add(new Postmodel("This is a caption.as a test","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS9W5wKFJz73EYsMh58kD2Z2UGukbtvx5B-mg&usqp=CAU","Abed khan","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRnZc4nu61fo87fwxBfVNGokRj1TP8t6IrdEQ&usqp=CAU"));
        postmodelList.add(new Postmodel("What's a queen without her king? Historically speaking, more powerful.\n","https://images.unsplash.com/photo-1628563694622-5a76957fd09c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8aW5zdGFncmFtJTIwcHJvZmlsZXxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60","Zeeshan Majumder","https://images.unsplash.com/photo-1628563694622-5a76957fd09c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8aW5zdGFncmFtJTIwcHJvZmlsZXxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60"));
        postmodelList.add(new Postmodel("","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ7f0AVeO0ZpL7PfUflnts_75mPZEm36sj4PQ&usqp=CAU","Abir khan","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGSc-y8_bKQCV9PQy2D1SZkA4Yb4bOewjw3A&usqp=CAU"));
        postmodelList.add(new Postmodel("Want to work with these awesome people, working on a lot of awesome things? We're hiring! Click the link in our bio to see our current openings.","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRnZc4nu61fo87fwxBfVNGokRj1TP8t6IrdEQ&usqp=CAU","Md khan","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS9W5wKFJz73EYsMh58kD2Z2UGukbtvx5B-mg&usqp=CAU"));
        postmodelList.add(new Postmodel("Friends are like stars, constantly coming and going, but the ones that stay burn as bright as the sun","","Nazmul khan","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSPOoZOWOD3oOnaevjLT4VR5-T8jG8uPEvByg&usqp=CAU"));
        postmodelList.add(new Postmodel("presents our latest product — made with love just for you. ❤️ Link in bio to learn more.","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTRJWtKYksMR7gxxGS65hfBeJc97hf0UxwPqg&usqp=CAU","Juyel Raj","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ7f0AVeO0ZpL7PfUflnts_75mPZEm36sj4PQ&usqp=CAU"));
        postmodelList.add(new Postmodel("presents our latest product — made with love just for you. ❤️ Link in bio to learn more.","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR0Db_rqnoHx4JMQ_C5IbAbrXlohbP8TwQ2Lw&usqp=CAU","Faria khan","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRVfR2dE6NIMeFTPbHNRTKWLXS9G9OYp6zRRg&usqp=CAU"));
        postmodelList.add(new Postmodel("","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ8J1l-rceZJyefqnMdLtIaqX2q72MoEZJJ4Q&usqp=CAU","Farha islam","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQRrabli-wbpRCyzD1Wvma9YI4dtUYZ0rNC9FFmbk4pws08F6GZMv1Fj4MeXbmk0bU8GYo&usqp=CAU"));
        postmodelList.add(new Postmodel("সবার সাথে তাল মিলিয়ে\n" +
                "চলা আমার পক্ষে সম্ভব নয়।\n" +
                "কারন আমি মানুষ\n" +
                "তবলা নই।","","Anabiya Rahman","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ8J1l-rceZJyefqnMdLtIaqX2q72MoEZJJ4Q&usqp=CAU"));
        postmodelList.add(new Postmodel("","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSPOoZOWOD3oOnaevjLT4VR5-T8jG8uPEvByg&usqp=CAU","Joy khan","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR0Db_rqnoHx4JMQ_C5IbAbrXlohbP8TwQ2Lw&usqp=CAU"));
        postmodelList.add(new Postmodel("","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRVfR2dE6NIMeFTPbHNRTKWLXS9G9OYp6zRRg&usqp=CAU","Bablu Mia","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRsHfXdo_W1l7Jcm0LAi5EmB2oMT3mrfgxmAA&usqp=CAU"));
        postmodelList.add(new Postmodel("","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQRrabli-wbpRCyzD1Wvma9YI4dtUYZ0rNC9FFmbk4pws08F6GZMv1Fj4MeXbmk0bU8GYo&usqp=CAU","Md A.k Rahman","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTRJWtKYksMR7gxxGS65hfBeJc97hf0UxwPqg&usqp=CAU"));
        postmodelList.add(new Postmodel("তুমি বদলে গেলে পরিস্থিতি দায়ী।\n" +
                "আর আমি বদলালে অবিশ্বাসী…!","","Md A.k Rahman","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTRJWtKYksMR7gxxGS65hfBeJc97hf0UxwPqg&usqp=CAU"));
        postmodelList.add(new Postmodel("","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRnZc4nu61fo87fwxBfVNGokRj1TP8t6IrdEQ&usqp=CAU","Md khan","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS9W5wKFJz73EYsMh58kD2Z2UGukbtvx5B-mg&usqp=CAU"));
        postmodelList.add(new Postmodel("","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRsHfXdo_W1l7Jcm0LAi5EmB2oMT3mrfgxmAA&usqp=CAU","Nazmul khan","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSPOoZOWOD3oOnaevjLT4VR5-T8jG8uPEvByg&usqp=CAU"));
        postmodelList.add(new Postmodel("Laughing at random things. Partying ‘til the sunrise. There’s no one else I’d want by my side. Love ya!","","Juyel Raj","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRVfR2dE6NIMeFTPbHNRTKWLXS9G9OYp6zRRg&usqp=CAU"));
        postmodelList.add(new Postmodel("presents our latest product — made with love just for you. ❤️ Link in bio to learn more.","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTRJWtKYksMR7gxxGS65hfBeJc97hf0UxwPqg&usqp=CAU","Juyel Raj","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ7f0AVeO0ZpL7PfUflnts_75mPZEm36sj4PQ&usqp=CAU"));
        postmodelList.add(new Postmodel("presents our latest product — made with love just for you. ❤️ Link in bio to learn more.","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR0Db_rqnoHx4JMQ_C5IbAbrXlohbP8TwQ2Lw&usqp=CAU","Faria khan","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRVfR2dE6NIMeFTPbHNRTKWLXS9G9OYp6zRRg&usqp=CAU"));
        postmodelList.add(new Postmodel("","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ8J1l-rceZJyefqnMdLtIaqX2q72MoEZJJ4Q&usqp=CAU","Farha islam","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQRrabli-wbpRCyzD1Wvma9YI4dtUYZ0rNC9FFmbk4pws08F6GZMv1Fj4MeXbmk0bU8GYo&usqp=CAU"));
        postmodelList.add(new Postmodel("সবার সাথে তাল মিলিয়ে\n" +
                "চলা আমার পক্ষে সম্ভব নয়।\n" +
                "কারন আমি মানুষ\n" +
                "তবলা নই।","","Anabiya Rahman","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ8J1l-rceZJyefqnMdLtIaqX2q72MoEZJJ4Q&usqp=CAU"));
        postmodelList.add(new Postmodel("","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSPOoZOWOD3oOnaevjLT4VR5-T8jG8uPEvByg&usqp=CAU","Joy khan","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR0Db_rqnoHx4JMQ_C5IbAbrXlohbP8TwQ2Lw&usqp=CAU"));
        postmodelList.add(new Postmodel("","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRVfR2dE6NIMeFTPbHNRTKWLXS9G9OYp6zRRg&usqp=CAU","Bablu Mia","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRsHfXdo_W1l7Jcm0LAi5EmB2oMT3mrfgxmAA&usqp=CAU"));
        postmodelList.add(new Postmodel("","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQRrabli-wbpRCyzD1Wvma9YI4dtUYZ0rNC9FFmbk4pws08F6GZMv1Fj4MeXbmk0bU8GYo&usqp=CAU","Md A.k Rahman","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTRJWtKYksMR7gxxGS65hfBeJc97hf0UxwPqg&usqp=CAU"));

    }


    private void storyarraydata() {

        storylist.add(new Storymodel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS9W5wKFJz73EYsMh58kD2Z2UGukbtvx5B-mg&usqp=CAU","Abed khan","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRnZc4nu61fo87fwxBfVNGokRj1TP8t6IrdEQ&usqp=CAU"));
        storylist.add(new Storymodel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ7f0AVeO0ZpL7PfUflnts_75mPZEm36sj4PQ&usqp=CAU","Abir khan","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGSc-y8_bKQCV9PQy2D1SZkA4Yb4bOewjw3A&usqp=CAU"));
        storylist.add(new Storymodel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRnZc4nu61fo87fwxBfVNGokRj1TP8t6IrdEQ&usqp=CAU","Md khan","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS9W5wKFJz73EYsMh58kD2Z2UGukbtvx5B-mg&usqp=CAU"));
        storylist.add(new Storymodel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRsHfXdo_W1l7Jcm0LAi5EmB2oMT3mrfgxmAA&usqp=CAU","Nazmul khan","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSPOoZOWOD3oOnaevjLT4VR5-T8jG8uPEvByg&usqp=CAU"));
        storylist.add(new Storymodel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTRJWtKYksMR7gxxGS65hfBeJc97hf0UxwPqg&usqp=CAU","Juyel Raj","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ7f0AVeO0ZpL7PfUflnts_75mPZEm36sj4PQ&usqp=CAU"));
        storylist.add(new Storymodel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR0Db_rqnoHx4JMQ_C5IbAbrXlohbP8TwQ2Lw&usqp=CAU","Faria khan","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRVfR2dE6NIMeFTPbHNRTKWLXS9G9OYp6zRRg&usqp=CAU"));
        storylist.add(new Storymodel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ8J1l-rceZJyefqnMdLtIaqX2q72MoEZJJ4Q&usqp=CAU","Farha islam","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQRrabli-wbpRCyzD1Wvma9YI4dtUYZ0rNC9FFmbk4pws08F6GZMv1Fj4MeXbmk0bU8GYo&usqp=CAU"));
        storylist.add(new Storymodel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGSc-y8_bKQCV9PQy2D1SZkA4Yb4bOewjw3A&usqp=CAU","Anabiya Rahman","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ8J1l-rceZJyefqnMdLtIaqX2q72MoEZJJ4Q&usqp=CAU"));
        storylist.add(new Storymodel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSPOoZOWOD3oOnaevjLT4VR5-T8jG8uPEvByg&usqp=CAU","Joy khan","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR0Db_rqnoHx4JMQ_C5IbAbrXlohbP8TwQ2Lw&usqp=CAU"));
        storylist.add(new Storymodel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRVfR2dE6NIMeFTPbHNRTKWLXS9G9OYp6zRRg&usqp=CAU","Bablu Mia","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRsHfXdo_W1l7Jcm0LAi5EmB2oMT3mrfgxmAA&usqp=CAU"));
        storylist.add(new Storymodel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQRrabli-wbpRCyzD1Wvma9YI4dtUYZ0rNC9FFmbk4pws08F6GZMv1Fj4MeXbmk0bU8GYo&usqp=CAU","Md A.k Rahman","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTRJWtKYksMR7gxxGS65hfBeJc97hf0UxwPqg&usqp=CAU"));




    }
}