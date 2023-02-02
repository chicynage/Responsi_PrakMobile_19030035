package com.example.responsi_19030035;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText jarii,luas, kll1, vlum, kll2;
    Button hitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hitung = ( Button) findViewById(R.id.btn_htg);
        jarii=(EditText) findViewById(R.id.jari);
        luas=(EditText) findViewById(R.id.luas_lk);
        kll1 =(EditText) findViewById(R.id.kll_lk);
        kll2 =(EditText) findViewById(R.id.kll_bl);
        vlum =(EditText) findViewById(R.id.vlm_bl);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double jari = Double.parseDouble(jarii.getText().toString());

                double LUAS = 3.14 * (jari * jari);
                double KELILING = 2* 3.14 * jari;
                double KLLBOLA = 4/3 * 3.14 * (jari * jari);
                double VOLUM = 4/3 * 3.14 * (jari*jari*jari);

                luas.setText("" + LUAS);
                kll1.setText(""+KELILING);
                kll2.setText(""+KLLBOLA);
                vlum.setText(""+VOLUM);
            }
        });
    }
}