package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class RegistrationActivity extends AppCompatActivity {

    EditText etUName,etEmail,etPhone,etPassword,etHobbies;
    RadioGroup rgGender;
    RadioButton radioButton;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        etUName = findViewById(R.id.etUName);
        etEmail = findViewById(R.id.etEmail);
        etPhone = findViewById(R.id.etPhone);
        etPassword = findViewById(R.id.etPassword);
        etHobbies = findViewById(R.id.etHobbies);
        rgGender = findViewById(R.id.rgGender);
        button = findViewById(R.id.button);

        button.setOnClickListener(view -> {
            String name = etUName.getText().toString();
            String email = etEmail.getText().toString();
            String phone = etPhone.getText().toString();
            String password = etPassword.getText().toString();
            String hobbies = etHobbies.getText().toString();
            int selected = rgGender.getCheckedRadioButtonId();
            radioButton = findViewById(selected);
            String gender = radioButton.getText().toString();

            Intent intent = new Intent(RegistrationActivity.this,DataActivity.class);
            intent.putExtra("Name",name);
            intent.putExtra("Email",email);
            intent.putExtra("Phone",phone);
            intent.putExtra("Password",password);
            intent.putExtra("Gender",gender);
            intent.putExtra("Hobbies",hobbies);

            startActivity(intent);
        });


    }
}