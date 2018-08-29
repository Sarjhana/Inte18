package com.example.sarjhu.inte18;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity2 extends AppCompatActivity {
private static int SPLASH_TIME_OUT=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent MainActivityIntent= new Intent(SplashActivity2.this,MainActivity.class);
                startActivity(MainActivityIntent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
