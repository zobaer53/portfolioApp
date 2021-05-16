package com.example.zobaer53.portfolioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MySkills extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_skills);
        setTitle("My Skills");
        TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11,textView12,textView13,textView14,textView15,textView16;

        textView1 = findViewById(R.id.java);
        textView2 = findViewById(R.id.cPlus);
        textView3 = findViewById(R.id.oop);
        textView4 = findViewById(R.id.gitHub);
        textView5 = findViewById(R.id.jSoup);
        textView6 = findViewById(R.id.api);
        textView7 = findViewById(R.id.thread);
        textView8 = findViewById(R.id.nativeJ);
        textView9 = findViewById(R.id.responsiveUi);
        textView10 = findViewById(R.id.mvvm);
        textView11 = findViewById(R.id.sql);
        textView12 = findViewById(R.id.firebase);
        textView13 = findViewById(R.id.aws);
        textView14 = findViewById(R.id.problemSolving);
        textView15 = findViewById(R.id.communication);
        textView16 = findViewById(R.id.teamwork);


        textView1.setX(-1000);
        textView2.setX(-1000);
        textView3.setX(-1000);
        textView4.setX(-1000);
        textView5.setX(-1000);
        textView6.setX(-1000);
        textView7.setX(-1000);
        textView8.setX(-1000);
        textView9.setX(-1000);
        textView10.setX(-1000);
        textView11.setX(-1000);
        textView12.setX(-1000);
        textView13.setX(-1000);
        textView14.setX(-1000);
        textView15.setX(-1000);
        textView16.setX(-1000);


        textView1.animate().translationXBy(1000).setDuration(500);
        textView2.animate().translationXBy(1000).setDuration(600);
        textView3.animate().translationXBy(1000).setDuration(700);
        textView4.animate().translationXBy(1000).setDuration(800);
        textView5.animate().translationXBy(1000).setDuration(900);
        textView6.animate().translationXBy(1000).setDuration(1000);
        textView7.animate().translationXBy(1000).setDuration(1100);
        textView8.animate().translationXBy(1000).setDuration(1200);
        textView9.animate().translationXBy(1000).setDuration(1300);
        textView10.animate().translationXBy(1000).setDuration(1400);
        textView11.animate().translationXBy(1000).setDuration(1500);
        textView12.animate().translationXBy(1000).setDuration(1600);
        textView13.animate().translationXBy(1000).setDuration(1700);
        textView14.animate().translationXBy(1000).setDuration(1800);
        textView15.animate().translationXBy(1000).setDuration(1900);
        textView16.animate().translationXBy(1000).setDuration(2000);

    }
}