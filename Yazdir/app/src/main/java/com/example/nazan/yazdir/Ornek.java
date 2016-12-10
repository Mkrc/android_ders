package com.example.nazan.yazdir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Ornek extends AppCompatActivity {


//EditText icine girilen taban ve üsse göre hesap yapan program

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ornek);
        final Button b=(Button)findViewById(R.id.button2);
        final TextView t=(TextView) findViewById(R.id.textView2);
        final EditText e=(EditText) findViewById(R.id.editText);
        final EditText e1=(EditText) findViewById(R.id.editText2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=Integer.parseInt(e.getText().toString());
                int b=Integer.parseInt(e1.getText().toString());
                int sonuc=1;
                for(int i=1;i<=b;i++)
                    sonuc*=a;
                t.setText(String.valueOf(sonuc));
            }
        });

    }}
