package com.example.nazan.ikispinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

final Spinner s=(Spinner)findViewById(R.id.spinner);
        final Spinner s1=(Spinner)findViewById(R.id.spinner2);

        ArrayAdapter adt=ArrayAdapter.createFromResource(this,R.array.a,android.R.layout.simple_spinner_item);
        adt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adt);

        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String secilen=s.getItemAtPosition(i).toString();
                if(secilen.equals("Isparta")){
                    ArrayAdapter adt1=ArrayAdapter.createFromResource(MainActivity.this,R.array.b,android.R.layout.simple_spinner_item);
                    adt1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    s1.setAdapter(adt1);

               }else if(secilen.equals("Burdur")){
                    ArrayAdapter adt2=ArrayAdapter.createFromResource(MainActivity.this,R.array.c,android.R.layout.simple_spinner_item);
                    adt2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    s1.setAdapter(adt2);


                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
