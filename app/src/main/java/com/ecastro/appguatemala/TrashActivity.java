package com.ecastro.appguatemala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TrashActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trash);

        btnLogin = (Button)findViewById(R.id.botonlogin);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == btnLogin.getId()){
            Intent i = new Intent(TrashActivity.this,LoginActivity.class);
            startActivity(i);
            finish();
        }
    }
}
