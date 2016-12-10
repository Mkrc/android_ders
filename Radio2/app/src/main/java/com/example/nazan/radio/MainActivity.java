package com.example.nazan.radio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//Radiobutton Radiogroup kullanýmý ile telefon modu ayarlama
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final RadioButton sessiz=(RadioButton) findViewById(R.id.radioButton);
        final RadioButton titre=(RadioButton) findViewById(R.id.radioButton2);
        final RadioButton melodi=(RadioButton) findViewById(R.id.radioButton3);
        final Button b=(Button)findViewById(R.id.button);
        RadioGroup rg=(RadioGroup)findViewById(R.id.radioGroup);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(sessiz.isChecked())
                    Toast.makeText(getApplicationContext(),sessiz.getText().toString(),Toast.LENGTH_SHORT).show();
                else if(titre.isChecked())
                    Toast.makeText(getApplicationContext(),titre.getText().toString(),Toast.LENGTH_SHORT).show();
                else if(melodi.isChecked())
                    Toast.makeText(getApplicationContext(),melodi.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });



        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sessiz.isChecked())
                    Toast.makeText(getApplicationContext(),sessiz.getText().toString(),Toast.LENGTH_SHORT).show();
                else if(titre.isChecked())
                    Toast.makeText(getApplicationContext(),titre.getText().toString(),Toast.LENGTH_SHORT).show();
                else if(melodi.isChecked())
                    Toast.makeText(getApplicationContext(),melodi.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}
