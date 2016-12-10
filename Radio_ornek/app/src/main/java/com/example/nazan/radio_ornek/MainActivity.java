package com.example.nazan.radio_ornek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


//Seçili Radiobutonu Toast ile gösteren kod

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      final RadioButton r1=(RadioButton)findViewById(R.id.radioButton);
        final RadioButton r2=(RadioButton)findViewById(R.id.radioButton2);
        final Button b=(Button) findViewById(R.id.button);



        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r1.isChecked())
                    Toast.makeText(getApplicationContext(),r1.getText().toString(),Toast.LENGTH_LONG).show();
                else if(r2.isChecked())
                    Toast.makeText(getApplicationContext(),r2.getText().toString(),Toast.LENGTH_SHORT).show();

            }
        });

    }
}
