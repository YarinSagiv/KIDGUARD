package com.example.kidguard2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);


    }

    public void GoToRegister(View v)
    {
        startActivity(new Intent(MainActivity.this,Register.class));

    }
}