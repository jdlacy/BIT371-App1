package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private final String[] cities = {"Seattle", "Bothell", "Kirkland", "Bellevue", "Lynnwood",
            "Renton", "Redmond", "Spokane", "Vancouver", "Tacoma", "Olympia", "Bellingham",
            "Arlington", "Everett", "Woodinville", "Monroe", "New Castle", "Ballard", "Lacey"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listview_layout, R.id.city, cities);
        ListView lv = findViewById(R.id.theList);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.i("MSG: ", "This is city number " + i + " in the list.");
            }
        });
    }

}