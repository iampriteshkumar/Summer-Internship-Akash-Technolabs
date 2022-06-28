package com.example.add;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etNum01,etNum02;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum01 = findViewById(R.id.etNum01);
        etNum02 = findViewById(R.id.etNum02);
        button = findViewById(R.id.button);

        button.setOnClickListener(view -> {
            String num01 = etNum01.getText().toString();
            String num02 = etNum02.getText().toString();

            int a = Integer.parseInt(num01);
            int b = Integer.parseInt(num02);
            int add = a + b;
            Toast.makeText(this, "The Addition is: "+add, Toast.LENGTH_SHORT).show();
        });
    }
}