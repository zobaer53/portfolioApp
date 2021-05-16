package com.example.zobaer53.portfolioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class ConnectWithMe extends AppCompatActivity {
    LinearLayout layout1,layout2,layout3,layout4,layout5,layout6,layout7,layout8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect_with_me);
        setTitle("Connect With Me ");


        layout1 = findViewById(R.id.phone);
        layout2 = findViewById(R.id.email);

        layout3 = findViewById(R.id.linkedIn);
        layout4 = findViewById(R.id.hackerRank);
        layout5 = findViewById(R.id.gitHub);
        layout6 = findViewById(R.id.faceBook);
        layout7 = findViewById(R.id.instagram);
        layout8 = findViewById(R.id.stackOverFlow);

        layout1.setX(-1000);
        layout2.setX(-1000);
        layout3.setX(-1000);
        layout4.setX(-1000);
        layout5.setX(-1000);
        layout6.setX(-1000);
        layout7.setX(-1000);
        layout8.setX(-1000);

        layout1.animate().translationXBy(1000).setDuration(500);
        layout2.animate().translationXBy(1000).setDuration(700);
        layout3.animate().translationXBy(1000).setDuration(900);
        layout4.animate().translationXBy(1000).setDuration(1100);
        layout5.animate().translationXBy(1000).setDuration(1300);
        layout6.animate().translationXBy(1000).setDuration(1500);
        layout7.animate().translationXBy(1000).setDuration(1700);
        layout8.animate().translationXBy(1000).setDuration(1900);



    }

    public void intent(View view) {

        if(view.getId() == R.id.linkedIn){

            Intent intent = new Intent(this,MainActivity.class);
            intent.putExtra("appName",7);
            startActivity(intent);

        }
        if(view.getId() == R.id.hackerRank){

            Intent intent = new Intent(this,MainActivity.class);
            intent.putExtra("appName",8);
            startActivity(intent);

        }
        if(view.getId() == R.id.gitHub){

            Intent intent = new Intent(this,MainActivity.class);
            intent.putExtra("appName",9);
            startActivity(intent);

        }
        if(view.getId() == R.id.faceBook){

            Intent intent = new Intent(this,MainActivity.class);
            intent.putExtra("appName",10);
            startActivity(intent);

        }
        if(view.getId() == R.id.instagram){

            Intent intent = new Intent(this,MainActivity.class);
            intent.putExtra("appName",11);
            startActivity(intent);

        }
        if(view.getId() == R.id.stackOverFlow){

            Intent intent = new Intent(this,MainActivity.class);
            intent.putExtra("appName",12);
            startActivity(intent);

        }
    }
}