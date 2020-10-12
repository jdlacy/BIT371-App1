package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void CredCheck (View view){
        TextView welcome = findViewById(R.id.welcome);
        EditText userkey = findViewById(R.id.Username);
        EditText passkey = findViewById(R.id.Password);
        String userID = userkey.getText().toString().trim();
        String userPass = passkey.getText().toString().trim();

        Log.i("USER ENTRY DETECTED!", "Username entry: " + userID);
        Log.i("USER ENTRY DETECTED!", "Password entry: " + userPass);

        Intent creds = new Intent(getApplicationContext(), UserConfirmationActivity.class);
        creds.putExtra("Username", userID);
        creds.putExtra("Password", userPass);
        startActivity(creds);
    }
}