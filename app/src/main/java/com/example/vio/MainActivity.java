package com.example.vio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String tag = "Life cycle step:";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag,"onCreate");
    }
    public void onStart(){
        super.onStart();
        Log.d(tag,"onStart");
    }
    public void onrestart(){
        super.onRestart();
    }
}