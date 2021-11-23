package com.example.guiappadlyr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMoney(View v){
        Intent intent = new Intent(MainActivity.this, Conversion.class);
        startActivity(intent);
    }

    public void showRegister(View v){
        Intent intent = new Intent(MainActivity.this, Register.class);
        startActivity(intent);
    }

    public void showDashboard(View v){
        Intent intent = new Intent(MainActivity.this, Dashboard.class);
        startActivity(intent);
    }
}