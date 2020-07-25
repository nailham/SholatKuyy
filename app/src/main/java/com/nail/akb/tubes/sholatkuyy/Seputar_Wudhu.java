package com.nail.akb.tubes.sholatkuyy;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Seputar_Wudhu extends AppCompatActivity {
    /*
    tanggal :25-06-2020
    deskripsi : membuat java class,layout,logo project,mengkoneksikan project ke firebase,menyimpan data dengan firebase
    nim :10117138
    nama :Ilham Nurjaman
    kelas :IF4/AKB
     */

    LinearLayout wudhu,fardu,cara,batal;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seputar_wudhu);

        back = findViewById(R.id.back);
        wudhu = findViewById(R.id.syarat_wudhu);
        fardu = findViewById(R.id.fardu_wudhu);
        cara = findViewById(R.id.cara_wudhu);
        batal = findViewById(R.id.batal_wudhu);

        //untuk pindah aktiviti
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Seputar_Wudhu.this, Menu_Sholat.class);
                startActivity(a);
            }
        });

        wudhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Seputar_Wudhu.this, Syarat_Wudhu.class);
                startActivity(a);
            }
        });

        fardu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Seputar_Wudhu.this, Fardu_Wudhu.class);
                startActivity(a);
            }
        });

        cara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Seputar_Wudhu.this, Cara_Wudhu.class);
                startActivity(a);
            }
        });

        batal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Seputar_Wudhu.this, Batal_Wudhu.class);
                startActivity(a);
            }
        });
    }
}

