package com.example.radiobuttoncontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton rbIndia,rbSpain,rbAustralia,rbFrance,rbDenmark;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbIndia = findViewById(R.id.rbIndia);
        rbSpain = findViewById(R.id.rbSpain);
        rbAustralia = findViewById(R.id.rbAustralia);
        rbFrance = findViewById(R.id.rbFrance);
        rbDenmark = findViewById(R.id.rbDenmark);

        button = findViewById(R.id.button);

        button.setOnClickListener(view -> {

            if (rbIndia.isChecked() || rbSpain.isChecked() || rbAustralia.isChecked() || rbFrance.isChecked() || rbDenmark.isChecked() ) {

                if (rbIndia.isChecked()) {
                    Toast.makeText(this, "You selected India!", Toast.LENGTH_SHORT).show();
                }
                if (rbSpain.isChecked()) {
                    Toast.makeText(this, "You selected Spain!", Toast.LENGTH_SHORT).show();
                }
                if (rbAustralia.isChecked()) {
                    Toast.makeText(this, "You selected Australia!", Toast.LENGTH_SHORT).show();
                }
                if (rbFrance.isChecked()) {
                    Toast.makeText(this, "You selected France!", Toast.LENGTH_SHORT).show();
                }
                if (rbDenmark.isChecked()) {
                    Toast.makeText(this, "You selected Denmark!", Toast.LENGTH_SHORT).show();
                }
            }
            else {
                Toast.makeText(this, "Nothing is selected!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}