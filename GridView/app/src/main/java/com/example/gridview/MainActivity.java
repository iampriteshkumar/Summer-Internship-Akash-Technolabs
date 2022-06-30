package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    String[] items = {"JavaScript","Python","Java","C++","PHP","Swift","Ruby","C#","Objective-C","SQL","Ada","Go","Perl","C","PostScript","Rexx","Scala","LaTeX","XML"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);
        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,items);
        gridView.setAdapter(arrayAdapter);
        gridView.setOnItemClickListener((adapterView, view, i, l) -> Toast.makeText(getApplicationContext(),items[i], Toast.LENGTH_SHORT).show());
    }
}