package com.example.zobaer53.portfolioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class About_Me extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about__me);
        setTitle("Education and Certificates");
    }

    public void certificatelink(View view) {
        if(view.getId() == R.id.javaSolo){

            Intent intent = new Intent(this,MainActivity.class);
            intent.putExtra("appName",13);
            startActivity(intent);

        }
        if(view.getId() == R.id.javaHR){

            Intent intent = new Intent(this,MainActivity.class);
            intent.putExtra("appName",14);
            startActivity(intent);

        }
        if(view.getId() == R.id.hasgCode){

            Intent intent = new Intent(this,MainActivity.class);
            intent.putExtra("appName",15);
            startActivity(intent);

        }
        if(view.getId() == R.id.android){

            Intent intent = new Intent(this,MainActivity.class);
            intent.putExtra("appName",16);
            startActivity(intent);

        }
    }
}