package com.example.zobaer53.portfolioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        WebView webView = findViewById(R.id.webView);
       // webView.getSettings().setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());



        Intent intent = getIntent();
        intent.getIntExtra("appName",0);
        Log.i("Value", String.valueOf(intent.getIntExtra("appName",0)));


        if(  intent.getIntExtra("appName",0) == 1){

            setTitle("Notes App");
            webView.loadUrl("https://github.com/zobaer53/Notes-app");
        }
        if(  intent.getIntExtra("appName",0) == 2){

            setTitle("Memorable Places");
            webView.loadUrl("https://github.com/zobaer53/MemorablePlaces");
        }

        if(  intent.getIntExtra("appName",0) == 3){
            setTitle("Hikers Watch");
            webView.loadUrl("https://github.com/zobaer53/Hikers_Watch");
        }
        if(  intent.getIntExtra("appName",0) == 4){
            setTitle("Weather App");
            webView.loadUrl("https://github.com/zobaer53/WeatherApp");
        }
        if(  intent.getIntExtra("appName",0) == 5){
            setTitle("Guess The Celebrity");
            webView.loadUrl("https://github.com/zobaer53/GuessTheCelebrity");
        }
        if(  intent.getIntExtra("appName",0) == 6){
            setTitle("Brain Trainer");
            webView.loadUrl("https://github.com/zobaer53/BrainTrainer");
        }


        if(  intent.getIntExtra("appName",0) == 7){
            setTitle("Zobaer's LinkeIn profile");
            webView.loadUrl("https://www.linkedin.com/in/zobaer-hossain-27275b194/");
        }

        if(  intent.getIntExtra("appName",0) == 8){
            CookieManager.getInstance().setAcceptCookie(true);
            setTitle("Zobaer's Hackerrank Profile");
            webView.loadUrl("https://www.hackerrank.com/ID20103184");
        }

        if(  intent.getIntExtra("appName",0) == 9){
            setTitle("Zobaer's GitHub Profile");
            webView.loadUrl("https://github.com/zobaer53");
        }

        if(  intent.getIntExtra("appName",0) == 10){
            setTitle("Zobaer's FaceBook Profile");
            webView.loadUrl("https://www.facebook.com/zobaer53");
        }

        if(  intent.getIntExtra("appName",0) == 11){
            setTitle("Zobaer's Insta Profile");
            webView.loadUrl("https://www.instagram.com/_ich_bin_schlecht");
        }
        if(  intent.getIntExtra("appName",0) == 12){
            setTitle("Zobaer's StackOverFlow Profile");
            webView.loadUrl("https://stackoverflow.com/users/13720647/zobaer-hossain");
        }

        if(  intent.getIntExtra("appName",0) == 13){
            setTitle("Zobaer's  Certificate");
            webView.loadUrl("https://www.sololearn.com/Certificate/1068-15909016/jpg/");
        }

        if(  intent.getIntExtra("appName",0) == 14){
            setTitle("Zobaer's  Certificate");
            webView.loadUrl("https://www.hackerrank.com/certificates/541c0fd8b62c");
        }
        if(  intent.getIntExtra("appName",0) == 15){
            setTitle("Zobaer's  Certificate");
            webView.loadUrl("https://codingcompetitions.withgoogle.com/hashcode/certificate/summary/00000000001a006b");
        }
        if(  intent.getIntExtra("appName",0) == 16){
            setTitle("Zobaer's  Certificate");
            webView.loadUrl("https://www.udemy.com/certificate/UC-9137831c-bfdb-45eb-8e56-1c83a42c7250/");
        }






    }
}