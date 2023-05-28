package com.laanaoui.myCalculator;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        new CountDownTimer(4500, 1000) {
            public void onTick(long millisUntilFinished) {

            }
            public void onFinish() {
                Intent intent = new Intent(getApplicationContext(), Calculator.class);
                startActivity(intent);
                finish();
            }
        }.start();
        final ImageView splash = findViewById(R.id.logo);
        // from bottom middle to center middle
        TranslateAnimation animation = new TranslateAnimation(0, 0, 1000, 0);
        animation.setDuration(3000);
        splash.startAnimation(animation);
    }
}