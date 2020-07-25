package com.nail.akb.tubes.sholatkuyy;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class Splashscreen extends AppCompatActivity {
   /*
    tanggal :25-06-2020
    deskripsi : membuat java class,layout,logo project,mengkoneksikan project ke firebase,menyimpan data dengan firebase
    nim :10117138
    nama :Ilham Nurjaman
    kelas :IF4/AKB
     */

    private int waktu_loading = 4000;

    //4000=4 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke main activity
                Intent main = new Intent(Splashscreen.this, Login.class);
                startActivity(main);
                finish();

            }
        }, waktu_loading);
    }
}

