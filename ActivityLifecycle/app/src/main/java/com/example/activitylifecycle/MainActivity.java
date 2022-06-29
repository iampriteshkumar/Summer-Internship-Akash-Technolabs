package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TAG","->01 onCreate called");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG","->02 onStart called");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG","->03 onResume called");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG","->04 onPause called");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG","->05 onStop called");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TAG","->06 onRestart called");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG","->07 onDestroy called");
    }
}



/*
    Application Launched on Screen:
     01 onCreate called
     02 onStart called
     03 onResume called

    Application in the Background:
     04 onPause called
     05 onStop called

    Back to Application from Background to Screen:
     06 onRestart called
     02 onStart called
     03 onResume called

    Application Closed:
     04 onPause called
     05 onStop called
     07 onDestroy called

     */