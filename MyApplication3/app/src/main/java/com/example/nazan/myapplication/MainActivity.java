package com.example.nazan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//Edit içerisinden alýnan ad soyadý ve spinner içinden alýnan ili toast ile gösteren kod
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner s=(Spinner) findViewById(R.id.spinner);
        final EditText t=(EditText) findViewById(R.id.editText);
        final EditText t2=(EditText) findViewById(R.id.editText2);
        final Button b=(Button)findViewById(R.id.button);
        ArrayAdapter adt=ArrayAdapter.createFromResource(getApplicationContext(),R.array.gunler,android.R.layout.simple_spinner_item);
        adt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adt);

        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
              String secilen=s.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(),"Ad = "+t.getText().toString()+"\nsoyad = "+t2.getText().toString()+"\ncinsiyet= "+secilen.toString(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

b.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Toast.makeText(getApplicationContext(),"Ad = "+t.getText().toString()+"\nsoyad = "+t2.getText().toString()+"\ncinsiyet= "+s.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();
    }
});
    }
}
