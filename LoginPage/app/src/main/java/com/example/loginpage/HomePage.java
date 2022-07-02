package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {

    TextView tvUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        tvUsername = findViewById(R.id.tvUsername);

        Intent intent = getIntent();
        String username = intent.getStringExtra("Username");
        tvUsername.setText(username);
    }
}