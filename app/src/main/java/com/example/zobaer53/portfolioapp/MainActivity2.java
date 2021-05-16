package com.example.zobaer53.portfolioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView1,textView2,textView11,textView12,textView13,textView14;
    ImageView profileImage;
    GridLayout gridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        profileImage = findViewById(R.id.profileImage);
        textView1 = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        gridLayout = findViewById(R.id.gridLayout2);

        textView11 = findViewById(R.id.aboutMetextView);
        textView12 = findViewById(R.id.projectTextView);
        textView13 = findViewById(R.id.skillTextView);
        textView14 = findViewById(R.id.connectTextView);



profileImage.setX(-1000);
textView1.setX(-1000);
textView2.setX(-1000);

        textView11.setX(-1000);
        textView12.setX(-1000);
        textView13.setX(-1000);
        textView14.setX(-1000);


        profileImage.animate().translationXBy(1000).rotation(1800).setDuration(2000);
        textView1.animate().translationXBy(1000).setDuration(500);
        textView2.animate().translationXBy(1000).setDuration(700);


        textView11.animate().translationXBy(1000).setDuration(900);
        textView12.animate().translationXBy(1000).setDuration(1100);
        textView13.animate().translationXBy(1000).setDuration(1300);
        textView14.animate().translationXBy(1000).setDuration(1500);
    }

    public void intent(View view) {


        if(view.getId()==R.id.aboutMetextView){
            Intent intent = new Intent(this,About_Me.class);
            startActivity(intent);

        }
        if(view.getId()==R.id.projectTextView){
            Intent intent = new Intent(this,Projects.class);
            startActivity(intent);

        }
        if(view.getId()==R.id.skillTextView){
            Intent intent = new Intent(this,MySkills.class);
            startActivity(intent);

        }
        if(view.getId()==R.id.connectTextView){
            Intent intent = new Intent(this,ConnectWithMe.class);
            startActivity(intent);

        }

    }
}