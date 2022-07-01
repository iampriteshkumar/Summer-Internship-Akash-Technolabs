package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {

    TextView tvUName,tvEmail,tvPhone,tvPassword,tvGenderSel,tvHobbiesSel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        tvUName = findViewById(R.id.tvUName);
        tvEmail = findViewById(R.id.tvEmail);
        tvPhone = findViewById(R.id.tvPhone);
        tvPassword = findViewById(R.id.tvPassword);
        tvGenderSel = findViewById(R.id.tvGenderSel);
        tvHobbiesSel = findViewById(R.id.tvHobbiesSel);

        Intent intent = getIntent();

        String name = intent.getStringExtra("Name");
        tvUName.setText(name);
        String email = intent.getStringExtra("Email");
        tvEmail.setText(email);
        String phone = intent.getStringExtra("Phone");
        tvPhone.setText(phone);
        String password = intent.getStringExtra("Password");
        tvPassword.setText(password);
        String hobbies = intent.getStringExtra("Hobbies");
        tvHobbiesSel.setText(hobbies);
        String gender = intent.getStringExtra("Gender");
        tvGenderSel.setText(gender);

    }
}