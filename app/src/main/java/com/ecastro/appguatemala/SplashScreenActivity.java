package com.ecastro.appguatemala;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import visual.UI;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Pantalla completa
        UI.HideUI(this);
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
