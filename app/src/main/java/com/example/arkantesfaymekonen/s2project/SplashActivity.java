package com.example.arkantesfaymekonen.s2project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread thread=new Thread() {
            @Override
            public void run() {
                try{
                    sleep(5000);
                    Intent i=new Intent(getApplicationContext(),LoadingActivtiy.class);
                    startActivity(i);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }
}
