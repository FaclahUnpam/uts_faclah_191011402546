package com.example.UAS_FACLAH_19101140256;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void Kampus(View view) {
        startActivity(new Intent(Home.this, Kampus.class));
    }

    public void Akademik(View view) {
        AkademikAlert akdialog = new AkademikAlert();
        akdialog.show(getSupportFragmentManager(), "Perpustakaan Dialog");

    }

    public void Perpustakaan(View view) {
        PerpustakaanAlert ppdialog = new PerpustakaanAlert();
        ppdialog.show(getSupportFragmentManager(), "Perpustakaan Dialog");
    }

    public void Kantin(View view) {
        startActivity(new Intent(Home.this, Kantin.class));
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder tombolkeluar = new AlertDialog.Builder(Home.this);
        tombolkeluar.setMessage("Anda yakin Ingin Keluar Dari Aplikasi Ini");
        tombolkeluar.setTitle("Keluar dari Aplikasi");
        tombolkeluar.setIcon(R.drawable.alertbox);
        tombolkeluar.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Home.this.finish();
            }
        });
        tombolkeluar.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        tombolkeluar.show();
    }

    public void IG (View view) {
        String url = "https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjO8qTlnvv3AhUASmwGHQS_BCoQFnoECAgQAQ&url=https%3A%2F%2Fwww.instagram.com%2Funiversitas_pamulang%2F%3Fhl%3Did&usg=AOvVaw058GSOVq8BeTtDjNl4hrNO";
        Uri uriurl = Uri.parse((url));
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriurl);
        startActivity(launchBrowser);
    }

    public void FB (View view) {
        String url = "https://id-id.facebook.com/UNPAM.ID/";
        Uri uriurl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriurl);
        startActivity(launchBrowser);

    }

    public void TW (View view) {
        String url = "https://twitter.com/my_unpam";
        Uri uriurl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriurl);
        startActivity(launchBrowser);
    }
}