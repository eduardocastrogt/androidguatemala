package com.ecastro.appguatemala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import  visual.UI;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

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
    protected void onStart(){
        super.onStart();

        //Pantalla completa
        UI.HideUI(this);
    }

    @Override
    protected void onStop(){
        super.onStop();

        //Pantalla completa
        UI.HideUI(this);
    }

    @Override
    protected void onRestart(){
        super.onRestart();

        //Pantalla completa
        UI.HideUI(this);
    }
}
