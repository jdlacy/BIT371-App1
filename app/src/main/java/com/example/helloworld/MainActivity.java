package com.example.helloworld;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doThatThing(View view) {
        Log.i("Info", "Hey there, Sailor.");
        TextView tv = findViewById(R.id.TextView);
        tv.setText("Hello, Android!");
    }
}