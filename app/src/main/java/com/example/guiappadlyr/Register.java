package com.example.guiappadlyr;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Register extends AppCompatActivity {

    Button bSimpan;
    EditText eNpm,eNama,eTempatlahir;
    TextView tHasil;
    RadioGroup rGender;
    Spinner sKelas, sAgama;

    private DatePickerDialog datePickerDialog;
    private SimpleDateFormat dateFormatter;
    private TextView tvDateResult;
    private EditText btDatePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        bSimpan = (Button) findViewById(R.id.bSave);
        eNpm = (EditText) findViewById(R.id.etNpm);
        eNama = (EditText) findViewById(R.id.etNama);
        eTempatlahir = (EditText) findViewById(R.id.etTempatLahir);
        tHasil = (TextView) findViewById(R.id.tvHasil);
        rGender = (RadioGroup) findViewById(R.id.rgGender);
        sKelas = (Spinner) findViewById(R.id.sKelas);
        sAgama = (Spinner) findViewById(R.id.sAgama);

        dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        tvDateResult = (TextView) findViewById(R.id.etTanggalLahir);
        btDatePicker = (EditText) findViewById(R.id.etTanggalLahir);
    }

    public void doSave(View v){

        String inputNpm = String.valueOf(eNpm.getText().toString());
        String inputNama = String.valueOf(eNama.getText().toString());
        String inputTempatlahir = String.valueOf(eTempatlahir.getText().toString());
        String inputOtomatis = String.valueOf(tvDateResult.getText().toString());

        int gender = rGender.getCheckedRadioButtonId();
        RadioButton jk = (RadioButton) findViewById(gender);
        String inputGender = String.valueOf(jk.getText().toString());

        tHasil.setText("\n" + "NPM\t\t\t\t\t\t\t\t\t\t\t: " + inputNpm + "\n" +
                "Nama\t\t\t\t\t\t\t\t\t\t\t: " + inputNama + "\n" +
                "Jenis Kelamin\t\t\t\t\t\t\t\t\t\t\t: " + inputGender + "\n" +
                "Kelas\t\t\t\t\t\t\t\t\t\t\t: " + sKelas.getSelectedItem().toString() + "\n" +
                "Agama\t\t\t\t\t\t\t\t\t\t\t: " + sAgama.getSelectedItem().toString() + "\n" +
                "Tempat Lahir\t\t\t\t\t\t\t\t\t\t\t: " + inputTempatlahir + "\n" +
                "Tanggal Lahir\t\t\t\t\t\t\t\t\t\t\t: " + inputOtomatis + "\n");

    }

    public void showDateDialog(){

        Calendar newCalender = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, (view, year, monthOfYear, dayOfMonth) -> {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                tvDateResult.setText(dateFormatter.format(newDate.getTime()));
        }, newCalender.get(Calendar.YEAR), newCalender.get(Calendar.MONTH), newCalender.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();

    }

    public void showDate(View v){
        showDateDialog();
    }
}