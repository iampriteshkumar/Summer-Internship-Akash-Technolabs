package com.example.checkboxcontrol;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cbCupcake,cbDonut,cbEclair,cbFroyo,cbGingerbread;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbCupcake = findViewById(R.id.cbCupcake);
        cbDonut = findViewById(R.id.cbDonut);
        cbEclair = findViewById(R.id.cbEclair);
        cbFroyo = findViewById(R.id.cbFroyo);
        cbGingerbread = findViewById(R.id.cbGingerbread);

        button = findViewById(R.id.button);

        button.setOnClickListener(view -> {
           String result = "You selected:";
            if (cbCupcake.isChecked()){
                result += "\nCupcake";
            }
            if (cbDonut.isChecked()){
                result += "\nDonut";
            }
            if (cbEclair.isChecked()){
                result += "\nEclair";
            }
            if (cbFroyo.isChecked()){
                result += "\nFroyo";
            }
            if (cbGingerbread.isChecked()){
                result += "\nGingerbread";
            }
            if (result.equals("You selected:")){
                result = "Nothing is selected!";
            }
            Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        });
    }
}