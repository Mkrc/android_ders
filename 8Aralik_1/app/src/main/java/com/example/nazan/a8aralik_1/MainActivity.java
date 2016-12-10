package com.example.nazan.a8aralik_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner s=(Spinner)findViewById(R.id.spinner);
        final EditText ad=(EditText)findViewById(R.id.editText) ;
        final EditText soyad=(EditText)findViewById(R.id.editText2);
        final Button b=(Button)findViewById(R.id.button);

        ArrayAdapter adt=ArrayAdapter.createFromResource(this,R.array.Sehir,android.R.layout.simple_spinner_item);
        adt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adt);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Ad = "+ad.getText().toString()+" \nSoyad = "+soyad.getText().toString()+" \nSehir = "+s.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }
        });


    }
}
