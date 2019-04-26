package com.ecastro.appguatemala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Map;

import  visual.UI;

public class LoginActivity extends AppCompatActivity {

    private String URLline = "https://appguatemala.herokuapp.com/user/userlogin";
    private EditText user;
    private EditText pass;
    private Button btnStart;
    public static String firstName, hobby;
    customfonts.MyTextView_Roboto_Regular btn_;
    ImageView btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Pantalla completa
        UI.HideUI(this);

        //Asignando los controles
        user = (EditText)findViewById(R.id.txtUser);
        pass = (EditText)findViewById(R.id.txtEmail);
        btn_ = findViewById(R.id.btnLogin);

        btn_.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                loginUser();
            }
        });

        btnBack = findViewById(R.id.arrowBack);
        btnBack.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, TrashActivity.class);
                startActivity(i);
                finish();
            }
        });
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

    //Función para el login
    private void loginUser(){

        final String username = user.getText().toString().trim();
        final String password = pass.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, URLline,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        //Toast.makeText(LoginActivity.this,response,Toast.LENGTH_LONG).show();
                        parseData(response);

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(LoginActivity.this,error.toString(),Toast.LENGTH_LONG).show();
                    }
                }){
            @Override
            protected Map<String,String> getParams(){
                Map<String,String> params = new HashMap<String, String>();
                params.put("email",username);
                params.put("password",password);
                return params;
            }

        };

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

    public void parseData(String response) {
        try {
            JSONObject jsonObject = new JSONObject(response);
            ///JSONObject jsonObject =response.getJSONObject("message");
            if (/*jsonObject.getString("issetUser") != null*/ jsonObject.getString("message").equals("true")) {
                /*
                JSONArray dataArray = jsonObject.getJSONArray(jsonObject.names().toString());
                for (int i = 0; i < dataArray.length(); i++) {

                    JSONObject dataobj = dataArray.getJSONObject(i);
                    firstName = dataobj.getString("name");
                    hobby = dataobj.getString("lastname");
                    Toast.makeText(LoginActivity.this,"Yo soy el parserData", Toast.LENGTH_LONG).show();
                }*/
                Toast.makeText(LoginActivity.this,"¡Bienvenido aventurero!", Toast.LENGTH_LONG).show();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
