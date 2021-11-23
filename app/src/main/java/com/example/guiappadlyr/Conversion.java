package com.example.guiappadlyr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.Locale;

public class Conversion extends AppCompatActivity {
    EditText input_uang;
    Button rp_usd, rp_yuan, rp_yen;
    TextView hasil_konversi;
    double angka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);
        input_uang = (EditText) findViewById(R.id.etInputMoney);
        rp_usd = (Button) findViewById(R.id.bUsd);
        rp_yuan = (Button) findViewById(R.id.bYuan);
        rp_yen = (Button) findViewById(R.id.bYen);
        hasil_konversi = (TextView) findViewById(R.id.tvConvResult);
    }

    public boolean cek() {
        if (input_uang.getText().toString().isEmpty()) {
            Toast.makeText(this, "Silahkan masukkan jumlah uang terlebih dahulu", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    public void toUsd(View v){
        if (!cek()){

        }

        try{
            angka = Double.parseDouble(input_uang.getText().toString());
        }catch(Exception ex){
            Toast.makeText(this, "Masukkan nominalnya dulu", Toast.LENGTH_SHORT).show();
        }

        double hasil = angka / 14.266;
        hasil_konversi.setText(NumberFormat.getCurrencyInstance(Locale.US).format(hasil));
        Toast.makeText(this, "1 USD = Rp 14.266", Toast.LENGTH_SHORT).show();

    }

    public void toYen(View v){
        if (!cek()){

        }

        try{
            angka = Double.parseDouble(input_uang.getText().toString());
        }catch(Exception ex){
            Toast.makeText(this, "Masukkan nominalnya dulu", Toast.LENGTH_SHORT).show();
        }

        double hasil = angka / 124;
        hasil_konversi.setText(NumberFormat.getCurrencyInstance(Locale.JAPAN).format(hasil));
        Toast.makeText(this, "1 Yen = Rp 124", Toast.LENGTH_SHORT).show();
    }

    public void toYuan(View v){
        if (!cek()){

        }

        try{
            angka = Double.parseDouble(input_uang.getText().toString());
        }catch (Exception ex){
            Toast.makeText(this, "Masukkan nominalnya dulu", Toast.LENGTH_SHORT).show();
        }

        double hasil = angka / 0.00045;
        hasil_konversi.setText(NumberFormat.getCurrencyInstance(Locale.CHINESE).format(hasil));
        Toast.makeText(this, "1 Yuan = Rp 0.00045", Toast.LENGTH_SHORT).show();
    }
}


