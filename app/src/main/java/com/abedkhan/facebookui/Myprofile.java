package com.abedkhan.facebookui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.abedkhan.facebookui.databinding.ActivityMyprofileBinding;

import java.util.ArrayList;
import java.util.List;

public class Myprofile extends AppCompatActivity {
ActivityMyprofileBinding binding;
List<Profilestory>profilestories;
List<Postmodel>postmodelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMyprofileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

profilestories=new ArrayList<>();
Storyarray();
ProfileSAdapter profileSAdapter=new ProfileSAdapter(profilestories,Myprofile.this);
binding.profilestoryRecyclerview.setAdapter(profileSAdapter);

postmodelList=new ArrayList<>();
postarraylist();
        Postadapter postadapter=new Postadapter(postmodelList,Myprofile.this);
        binding.postrecyclerview.setAdapter(postadapter);



    }

    private void Storyarray() {


        profilestories.add(new Profilestory("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS9W5wKFJz73EYsMh58kD2Z2UGukbtvx5B-mg&usqp=CAU","+9","Chandranath"));
        profilestories.add(new Profilestory("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ7f0AVeO0ZpL7PfUflnts_75mPZEm36sj4PQ&usqp=CAU","+5","Dhaka"));
        profilestories.add(new Profilestory("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRnZc4nu61fo87fwxBfVNGokRj1TP8t6IrdEQ&usqp=CAU","+9","Chittagong"));
        profilestories.add(new Profilestory("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRsHfXdo_W1l7Jcm0LAi5EmB2oMT3mrfgxmAA&usqp=CAU","+3","Cox bajar"));
        profilestories.add(new Profilestory("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTRJWtKYksMR7gxxGS65hfBeJc97hf0UxwPqg&usqp=CAU","+4","Rangamti"));
        profilestories.add(new Profilestory("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR0Db_rqnoHx4JMQ_C5IbAbrXlohbP8TwQ2Lw&usqp=CAU","+5","Home"));
        profilestories.add(new Profilestory("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ8J1l-rceZJyefqnMdLtIaqX2q72MoEZJJ4Q&usqp=CAU","+5","Friends"));
        profilestories.add(new Profilestory("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGSc-y8_bKQCV9PQy2D1SZkA4Yb4bOewjw3A&usqp=CAU","+1","My day"));
        profilestories.add(new Profilestory("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSPOoZOWOD3oOnaevjLT4VR5-T8jG8uPEvByg&usqp=CAU","+6","Tour"));
        profilestories.add(new Profilestory("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRVfR2dE6NIMeFTPbHNRTKWLXS9G9OYp6zRRg&usqp=CAU","+10","Great time"));
        profilestories.add(new Profilestory("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQRrabli-wbpRCyzD1Wvma9YI4dtUYZ0rNC9FFmbk4pws08F6GZMv1Fj4MeXbmk0bU8GYo&usqp=CAU","+5","Feni town"));

    }


    //post array list
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







}