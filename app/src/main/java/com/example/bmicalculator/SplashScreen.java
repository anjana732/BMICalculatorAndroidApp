package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        TextView txttittle;
        txttittle=findViewById(R.id.txttittle);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent iHome= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(iHome);
                Animation txt=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
                txttittle.setAnimation(txt);
                finish();

            }
        }, 5000);
    }
}