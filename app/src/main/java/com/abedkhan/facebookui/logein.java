package com.abedkhan.facebookui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.abedkhan.facebookui.databinding.ActivityLogeinBinding;

public class logein extends AppCompatActivity {
ActivityLogeinBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityLogeinBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());




        binding.logeinButton.setOnClickListener(view -> {
if (binding.mailORnumber.equals("")&& binding.pass.equals("")){

    binding.logeinButton.setClickable(false);
}else {
    Intent logeinintent =new Intent(logein.this,MainActivity.class);
    startActivity(logeinintent);
}


        });

        binding.mailORnumber.setOnClickListener(view -> {
            binding.img.setVisibility(View.VISIBLE);
            binding.cover.setVisibility(View.GONE);
            binding.language.setVisibility(View.GONE);
            binding.or.setVisibility(View.GONE);
            binding.forgetPassbutton.setVisibility(View.GONE);
            binding.createnewaccountButton.setVisibility(View.GONE);
        });










    }
}