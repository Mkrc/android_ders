package com.example.nazan.myapplication12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String []fakulte={"bir","iki"};
        final Spinner s=(Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> ad= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,fakulte);
        s.setAdapter(ad);
    }
}
