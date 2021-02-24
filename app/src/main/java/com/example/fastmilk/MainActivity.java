package com.example.fastmilk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button Masuk;
    Button Daftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Masuk = (Button)findViewById(R.id.btn_masuk);
        Masuk.setOnClickListener(this);
        //Daftar = (Button)findViewById(R.id.btn_daftar);
        //Daftar.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_masuk:
                Intent explicit = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(explicit);
                break;
            //case R.id.btn_daftar:
            //Intent explicit = new Intent(MainActivity.this, DaftarActivity.class);
            //startActivity(explicit);
            //break;
            default:
                break;
        }
    }
}