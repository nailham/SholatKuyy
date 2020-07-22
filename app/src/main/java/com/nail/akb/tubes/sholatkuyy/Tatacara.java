package com.nail.akb.tubes.sholatkuyy;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Tatacara extends AppCompatActivity {
    LinearLayout sholat,syarat;
    ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tatacara);

        back = findViewById(R.id.back);
        sholat = findViewById(R.id.sholat);
        syarat = findViewById(R.id.syarat_sholat);

        //untuk pindah aktiviti
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Tatacara.this, Menu_Sholat.class);
                startActivity(a);
            }
        });

        sholat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Tatacara.this, Tatacara_Sholat.class);
                startActivity(a);
            }
        });
        syarat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Tatacara.this, Syarat_Sholat.class);
                startActivity(a);
            }
        });
    }
}

