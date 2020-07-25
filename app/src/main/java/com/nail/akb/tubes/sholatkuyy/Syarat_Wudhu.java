package com.nail.akb.tubes.sholatkuyy;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Syarat_Wudhu  extends AppCompatActivity {
    /*
    tanggal :25-06-2020
    deskripsi : membuat java class,layout,logo project,mengkoneksikan project ke firebase,menyimpan data dengan firebase
    nim :10117138
    nama :Ilham Nurjaman
    kelas :IF4/AKB
     */

    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syarat_wudhu);
        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent a = new Intent(Syarat_Wudhu.this, Seputar_Wudhu.class);
                startActivity(a);
            }
        });
    }
}