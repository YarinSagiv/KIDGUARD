package com.example.kidguard2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void ONclickRegister (View v)
    {
        String message="";
        final EditText emailValidate = (EditText)findViewById(R.id.email_id);
        String email = emailValidate.getText().toString().trim();
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        //check if the email is validate
        if (!email.matches(emailPattern))
        {
            message=message+"Invalid email address\n";
        }

        //check if the phone number is less then 10 characters
        final EditText phoneValidate = (EditText)findViewById(R.id.phone_id);
        String phone = emailValidate.getText().toString().trim();
        if(phone.length()<10)
        {
            message=message+"Invalid phone number\n";
        }

        Toast.makeText(getApplicationContext(),message, Toast.LENGTH_SHORT).show();

    }
}