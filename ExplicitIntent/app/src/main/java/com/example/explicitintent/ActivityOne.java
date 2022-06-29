package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ActivityOne extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        button = findViewById(R.id.button);

        button.setOnClickListener(view -> {
            Intent intent = new Intent(ActivityOne.this,ActivityTwo.class);
            startActivity(intent);
        });
    }
}