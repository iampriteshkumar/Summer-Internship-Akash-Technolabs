package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etUName,etPassword;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUName = findViewById(R.id.etUName);
        etPassword = findViewById(R.id.etPassword);
        button = findViewById(R.id.button);

        button.setOnClickListener(view -> {
            if (etUName.getText().length()>=8 && etPassword.getText().length()>=8) {
                if (etUName.getText().toString().equals("Administrator") && etPassword.getText().toString().equals("Administrator")) {
                    Toast.makeText(this, "Log in success!", Toast.LENGTH_SHORT).show();
                    String username = etUName.getText().toString();
                    Intent intent = new Intent(MainActivity.this,HomePage.class);
                    intent.putExtra("Username",username);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(this, "Username or Password does not match!", Toast.LENGTH_SHORT).show();
                }
            }
            else if (etUName.getText().length()==0 || etPassword.getText().length()==0){
                Toast.makeText(this, "Username or Password cannot be empty!", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "Username and Password must be greater than or equal to eight characters!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}