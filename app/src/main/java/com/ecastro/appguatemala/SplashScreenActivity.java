package com.ecastro.appguatemala;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import visual.UI;

public class SplashScreenActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Pantalla completa
        UI.HideUI(this);

        //Ventana temporal
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreenActivity.this,TrashActivity.class);
                startActivity(i);
                finish();
            }
        },SPLASH_TIME_OUT);
    }

    @Override
    protected void onPause(){
        super.onPause();

        //Pantalla completa
        UI.HideUI(this);
    }

    @Override
    protected void onResume(){
        super.onResume();

        //Pantalla completa
        UI.HideUI(this);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
    }
}
