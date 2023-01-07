package com.improve10x.focustimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        Handler handler = new Handler();
        handler.postDelayed(
                () -> {
                    Toast.makeText(this, "Welcome to Pomodoro app!", Toast.LENGTH_SHORT).show();
                }, 3000
        );
    }
}