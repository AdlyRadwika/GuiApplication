package com.example.guiappadlyr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void openRegis(View v){

        Intent intent = new Intent(Dashboard.this, Register.class);
        startActivity(intent);

    }

    public void openMoney(View v){

        Intent intent = new Intent(Dashboard.this, Conversion.class);
        startActivity(intent);

    }

    public void backtoMain(View v){

        Intent intent = new Intent(Dashboard.this, MainActivity.class);
        startActivity(intent);

    }
}