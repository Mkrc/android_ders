package com.example.nazan.myapplication_12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button b=(Button)findViewById(R.id.button);
        final EditText kadi=(EditText)findViewById(R.id.editText2) ;
        final EditText sifre=(EditText)findViewById(R.id.editText3) ;
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(kadi.getText().toString().equals("abc") && (sifre.getText().toString().equals("123"))) {
                    Intent sayfa = new Intent(MainActivity.this, Yeni.class);
                    startActivity(sayfa);
                }else
                    Toast.makeText(getApplicationContext(),"Giriş Başarısız",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
