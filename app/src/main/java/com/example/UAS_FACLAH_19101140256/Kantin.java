package com.example.UAS_FACLAH_19101140256;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Kantin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kantin);
    }

    public void Khususmhs(View view) {
        startActivity(new Intent(Kantin.this, KhususMahasiswa.class));
    }

    public void Khususdosen(View view) {
        startActivity(new Intent(Kantin.this, KhususDosen.class));
    }

    public void KhususStaff(View view) {
        startActivity(new Intent(Kantin.this, KhususStaff.class));
    }
}