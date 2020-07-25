package com.nail.akb.tubes.sholatkuyy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Sholat_Fardu extends AppCompatActivity {
    /*
    tanggal :25-06-2020
    deskripsi : membuat java class,layout,logo project,mengkoneksikan project ke firebase,menyimpan data dengan firebase
    nim :10117138
    nama :Ilham Nurjaman
    kelas :IF4/AKB
     */

    LinearLayout Shubuh, Dzuhur,Asar,Magrib,Isya;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sholat_fardu);

        back = findViewById(R.id.back);
        Shubuh = findViewById(R.id.shubuh);
        Dzuhur = findViewById(R.id.dzuhur);
        Asar = findViewById(R.id.asar);
        Magrib = findViewById(R.id.magrib);
        Isya = findViewById(R.id.isya);

        //untuk pindah aktiviti
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Sholat_Fardu.this, Menu_Sholat.class);
                startActivity(a);
            }
        });

        Shubuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Sholat_Fardu.this, Shubuh.class);
                startActivity(a);
            }
        });
        Dzuhur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Sholat_Fardu.this, Dzuhur.class);
                startActivity(a);
            }
        });
        Asar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Sholat_Fardu.this, Asar.class);
                startActivity(a);
            }
        });
        Magrib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Sholat_Fardu.this, Magrib.class);
                startActivity(a);
            }
        });
        Isya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Sholat_Fardu.this, Isya.class);
                startActivity(a);
            }
        });
    }

}
