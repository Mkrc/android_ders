package com.example.nazan.yeni_ornek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    final Spinner s=(Spinner)findViewById(R.id.spinner);
        final Button b=(Button)findViewById(R.id.button);
        final Spinner s1=(Spinner)findViewById(R.id.spinner2);
        ArrayAdapter adt=ArrayAdapter.createFromResource(this,R.array.Iller,android.R.layout.simple_spinner_item);
        adt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adt);

        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String secilen=s.getItemAtPosition(i).toString();
                if(secilen.equals("Isparta"))
                {
                    ArrayAdapter ad1=ArrayAdapter.createFromResource(MainActivity.this,R.array.ilce_isparta,android.R.layout.simple_spinner_item);
                    ad1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    s1.setAdapter(ad1);
                }  else if (secilen.equals("Burdur")) {

                    ArrayAdapter ad2=ArrayAdapter.createFromResource(MainActivity.this,R.array.ilce_burdur,android.R.layout.simple_spinner_item);
                    ad2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    s1.setAdapter(ad2);
    }
     }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
}
