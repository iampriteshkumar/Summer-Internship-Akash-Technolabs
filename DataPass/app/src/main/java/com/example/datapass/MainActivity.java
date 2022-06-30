package com.example.datapass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        button = findViewById(R.id.button);

        button.setOnClickListener(view -> {
            String name = etName.getText().toString();
            Intent intent = new Intent(MainActivity.this,ActivityTwo.class);
            intent.putExtra("Name",name);
            startActivity(intent);
        });

    }
}