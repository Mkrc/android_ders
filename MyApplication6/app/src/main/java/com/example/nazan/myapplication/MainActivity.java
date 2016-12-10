package com.example.nazan.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
final Button b=(Button)findViewById(R.id.button);
        final EditText ad=(EditText)findViewById(R.id.editText);
        final EditText sifre=(EditText)findViewById(R.id.editText2);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((ad.getText().toString().equals("abc"))&&(sifre.getText().toString().equals("123"))) {
                    Intent intocan = new Intent(MainActivity.this, Yeni_sinif.class);
                    startActivity(intocan);
                }
                else
                    Toast.makeText(getApplicationContext(),"Yanlıs giris", Toast.LENGTH_LONG).show();
            }
        });




    }
}
