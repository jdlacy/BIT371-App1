package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class UserConfirmationActivity extends AppCompatActivity {

    private String IDyes = "isThisHow";
    private String passYes = "ThisWorks?";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_confirmation);

        TextView message = findViewById(R.id.textView);
        String userID = getIntent().getStringExtra("Username");
        String userPass = getIntent().getStringExtra("Password");

        if (IDyes.equals(userID) && (passYes.equals(userPass))) {
            Log.i("SUCCESS", "user ID and password accepted");
            message.setText("Welcome " + userID + "!");
        }
        else
        {
            Log.i("FAILURE", "credentials do not match record");
            message.setText("Username/Password combination is wrong");
        }
    }
}