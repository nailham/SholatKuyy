package com.nail.akb.tubes.sholatkuyy;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Doa extends AppCompatActivity {
    LinearLayout Qunut,Ilmu,Ortu,Selamat,Masuk,Keluar;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa);

        back = findViewById(R.id.back);
        Qunut = findViewById(R.id.qunut);
        Ilmu = findViewById(R.id.ilmu);
        Ortu = findViewById(R.id.ortu);
        Selamat = findViewById(R.id.selamat);
        Masuk = findViewById(R.id.masuk);
        Keluar = findViewById(R.id.keluar);
        //untuk pindah aktiviti
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Doa.this, Menu_Sholat.class);
                startActivity(a);
            }
        });

        Qunut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Doa.this, Doa_Qunut.class);
                startActivity(a);
            }
        });

        Ilmu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Doa.this, Doa_minta_ilmu.class);
                startActivity(a);
            }
        });

        Ortu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Doa.this, Doa_Ortu.class);
                startActivity(a);
            }
        });

        Selamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Doa.this, Doa_Selamat.class);
                startActivity(a);
            }
        });

        Masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Doa.this, Masuk_Masjid.class);
                startActivity(a);
            }
        });

        Keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Doa.this, Keluar_Masjid.class);
                startActivity(a);
            }
        });
    }
}

