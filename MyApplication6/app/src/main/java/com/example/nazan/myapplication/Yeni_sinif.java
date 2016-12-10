package com.example.nazan.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by Nazan on 5.12.2016.
 */

public class Yeni_sinif extends Activity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yeni_sinif);
        final Spinner s=(Spinner) findViewById(R.id.spinner3);
        final EditText ed=(EditText)findViewById(R.id.editText3);
        final EditText ed1=(EditText)findViewById(R.id.editText4);
        final Button b=(Button) findViewById(R.id.button2);

        ArrayAdapter adt=ArrayAdapter.createFromResource(this,R.array.Cinsiyet,android.R.layout.simple_spinner_item);
        adt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adt);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((ed.getText().toString().equals(""))&&(ed1.getText().toString().equals(""))){
                    Toast.makeText(getApplicationContext(),"Doldur",Toast.LENGTH_LONG).show();
                  }
                else {
                    Toast.makeText(getApplicationContext(), "Ad = " + ed.getText().toString() + "\nSoyad = " + ed1.getText().toString() + "\nCinsiyet = " + s.getSelectedItem().toString(), Toast.LENGTH_LONG).show();
                    Intent yeni=new Intent(Yeni_sinif.this,Islem.class);
                    startActivity(yeni);
                } }
        });
    }
}
