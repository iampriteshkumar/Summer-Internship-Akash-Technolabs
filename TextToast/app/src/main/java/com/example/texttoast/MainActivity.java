package com.example.texttoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etText = findViewById(R.id.etText);
        button = findViewById(R.id.button);

        button.setOnClickListener(view -> {
            String text = etText.getText().toString();
            Toast.makeText(MainActivity.this, "You Entered: "+text, Toast.LENGTH_SHORT).show();
        });
    }
}