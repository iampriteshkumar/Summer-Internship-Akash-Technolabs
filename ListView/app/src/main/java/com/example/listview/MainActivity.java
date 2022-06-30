package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lvItems;
    String[] items = {"JavaScript","Python","Java","C++","PHP","Swift","Ruby","C#","Objective-C","SQL","Ada","Go","Perl","C","PostScript","Rexx","Scala","LaTeX","XML"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvItems = findViewById(R.id.lvItems);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        lvItems.setAdapter(arrayAdapter);

        lvItems.setOnItemClickListener((adapterView, view, i, l) -> Toast.makeText(getApplicationContext(),items[i], Toast.LENGTH_SHORT).show());

    }
}
