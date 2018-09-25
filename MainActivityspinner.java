package com.example.student.myapplicationspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivityspinner extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
String [] countrynames = {"australia","USA","canada"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityspinner);
        Spinner spin = (Spinner)findViewById(R.id.spinner3);
                spin.setOnItemSelectedListener(this);
        ArrayAdapter aa =new
                ArrayAdapter(this,android.R.layout.simple_spinner_item,countrynames);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(),countrynames[position],
                Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
