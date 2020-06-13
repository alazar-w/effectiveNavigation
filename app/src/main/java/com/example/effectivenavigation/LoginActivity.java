package com.example.effectivenavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "LoginActivity";

    //widgets
    private Button mLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Log.d(TAG, "onCreate: started.");
        mLogin = findViewById(R.id.btn_login);

        mLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_login){
            Log.d(TAG, "onClick: loggin in the user");
            Intent intent = new Intent(LoginActivity.this,MainActivity.class);
            startActivity(intent);
            //setting a good animation when the new activity gets launched
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            //this will remove the Login activity from the activity stack asoon as the other activity from the intent starts
            finish();
        }

    }
}
