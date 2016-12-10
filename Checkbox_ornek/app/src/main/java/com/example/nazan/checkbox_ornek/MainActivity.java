package com.example.nazan.checkbox_ornek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//Seçilen checkbox verilerini toast ile gösteren kod
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final Button b=(Button)findViewById(R.id.button);
        final CheckBox c=(CheckBox)findViewById(R.id.checkBox);
        final CheckBox c1=(CheckBox)findViewById(R.id.checkBox5);
        final CheckBox c2=(CheckBox)findViewById(R.id.checkBox6);
        final CheckBox c3=(CheckBox)findViewById(R.id.checkBox7);
        final CheckBox c4=(CheckBox)findViewById(R.id.checkBox8);

       c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
               if(c.isChecked())
                   Toast.makeText(getApplicationContext(),c.getText().toString(),Toast.LENGTH_LONG).show();
           }
       });
        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean b) {
                if(c1.isChecked())
                    Toast.makeText(getApplicationContext(),buttonview.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean b) {
                if(c2.isChecked())
                    Toast.makeText(getApplicationContext(),buttonview.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        c3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean b) {
                if(c3.isChecked())
                    Toast.makeText(getApplicationContext(),buttonview.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        c4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean b) {
                if(c4.isChecked())
                    Toast.makeText(getApplicationContext(),buttonview.getText(),Toast.LENGTH_SHORT).show();
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String deger="Seçtikleriniz =\n";
                if(c.isChecked())
                    deger+=c.getText().toString();
                if(c1.isChecked())
                    deger+=c1.getText().toString();
                if(c2.isChecked())
                    deger+=c2.getText().toString();
                if(c3.isChecked())
                    deger+=c3.getText().toString();
                if(c4.isChecked())
                    deger+=c4.getText().toString();


                Toast.makeText(getApplicationContext(),deger,Toast.LENGTH_LONG).show();
            }
        });

    }
}
