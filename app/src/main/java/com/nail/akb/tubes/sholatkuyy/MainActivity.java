package com.nail.akb.tubes.sholatkuyy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button;

    /*
    tanggal :25-06-2020
    deskripsi : membuat java class,layout,logo project,mengkoneksikan project ke firebase,menyimpan data dengan firebase
    nim :10117138
    nama :Ilham Nurjaman
    kelas :IF4/AKB
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, Menu_Sholat.class);

                startActivity(i);
            }
            });
    }
}