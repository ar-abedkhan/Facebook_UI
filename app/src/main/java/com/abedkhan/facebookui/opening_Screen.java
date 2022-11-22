package com.abedkhan.facebookui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class opening_Screen extends AppCompatActivity {
int count= 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening_screen);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(opening_Screen.this,logein.class);
                startActivity(intent);
                finish();
            }
        },count);

    }
}