package com.example.nazan.uygulama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ornek extends AppCompatActivity {
//Edittext içerisine girilen sayının tek mi çift mi olduğunu bulan program

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ornek);

         final Button b=(Button)findViewById(R.id.button5);
        final EditText e=(EditText)findViewById(R.id.editText4);
        final TextView t=(TextView)findViewById(R.id.textView);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int a=Integer.parseInt(e.getText().toString());
                 if(a%2==0)
                     t.setText("Sayı çifttir");
                else
                     t.setText("Sayı tek");
            }
        });

    }
}
