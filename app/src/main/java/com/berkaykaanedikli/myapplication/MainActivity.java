package com.berkaykaanedikli.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnasker, btntankci,btnhumbaraci;
    TextView txtMesaj;
    String mesaj = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnasker = findViewById(R.id.btnAsker);
        btntankci = findViewById(R.id.btnTankci);
        btnhumbaraci = findViewById(R.id.btnHumbaraci);
        txtMesaj = findViewById(R.id.txtView);
        Asker asker = new Asker();
        Tankci tankci = new Tankci();
        Humbaraci humbaraci = new Humbaraci();
        btntankci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    mesaj = tankci.AtesEt();
                    txtMesaj.setText(mesaj);
            }
        });
        btnasker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mesaj = asker.AtesEt();
                txtMesaj.setText(mesaj);
            }
        });
        btnhumbaraci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mesaj = humbaraci.AtesEt();
                txtMesaj.setText(mesaj);
            }
        });

    }
}