package com.example.datapass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        tvName = findViewById(R.id.tvName);
        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        tvName.setText(name);

    }
}