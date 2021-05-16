package com.example.zobaer53.portfolioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Projects extends AppCompatActivity {
    LinearLayout layout1,layout2,layout3,layout4,layout5,layout6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);
        setTitle("Projects");

        TextView textView = findViewById(R.id.textView3);

        layout1 = findViewById(R.id.noteApp);
        layout2 = findViewById(R.id.memorablePlaces);
        layout3 = findViewById(R.id.hikersWatch);
        layout4 = findViewById(R.id.weatherApp);
        layout5 = findViewById(R.id.guessTheCelebrity);
        layout6 = findViewById(R.id.brainTrainer);

        textView.setX(-1000);

        layout1.setX(-1000);
        layout2.setX(-1000);
        layout3.setX(-1000);
        layout4.setX(-1000);
        layout5.setX(-1000);
        layout6.setX(-1000);


        textView.animate().translationXBy(1000).setDuration(500);

        layout1.animate().translationXBy(1000).setDuration(500);
        layout2.animate().translationXBy(1000).setDuration(700);
        layout3.animate().translationXBy(1000).setDuration(900);
        layout4.animate().translationXBy(1000).setDuration(1100);
        layout5.animate().translationXBy(1000).setDuration(1300);
        layout6.animate().translationXBy(1000).setDuration(1500);

    }

    public void intent(View view) {
        if(view.getId() == R.id.noteApp){

            Intent intent = new Intent(this,MainActivity.class);
            intent.putExtra("appName",1);
            startActivity(intent);
        }

        if(view.getId() == R.id.memorablePlaces){

            Intent intent = new Intent(this,MainActivity.class);
            intent.putExtra("appName",2);
            startActivity(intent);
        }

        if(view.getId() == R.id.hikersWatch){

            Intent intent = new Intent(this,MainActivity.class);
            intent.putExtra("appName",3);
            startActivity(intent);
        }
        if(view.getId() == R.id.weatherApp){

            Intent intent = new Intent(this,MainActivity.class);
            intent.putExtra("appName",4);
            startActivity(intent);
        }
        if(view.getId() == R.id.guessTheCelebrity){

            Intent intent = new Intent(this,MainActivity.class);
            intent.putExtra("appName",5);
            startActivity(intent);
        }
        if(view.getId() == R.id.brainTrainer){

            Intent intent = new Intent(this,MainActivity.class);
            intent.putExtra("appName",6);
            startActivity(intent);
        }

    }
}