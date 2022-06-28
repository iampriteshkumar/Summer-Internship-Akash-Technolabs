package com.example.outtextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    TextView tvName;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = findViewById(R.id.etName);
        tvName = findViewById(R.id.tvName);
        button = findViewById(R.id.button);

        button.setOnClickListener(view -> {
            String name = etName.getText().toString();
            tvName.setText(name);
        });
    }
}