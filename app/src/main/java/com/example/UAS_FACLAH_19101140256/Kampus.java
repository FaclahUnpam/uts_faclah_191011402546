package com.example.UAS_FACLAH_19101140256;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class Kampus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kampus);

        TabLayout tabLayout = findViewById(R.id.tab_kampus);
        TabItem tabAboutUs = findViewById(R.id.tab_abous_us);
        TabItem tabMahasiswaBaru = findViewById(R.id.tab_mahasiswa_baru);
        TabItem tabProgramSarjana = findViewById(R.id.tab_program_sarjana);
        TabItem tabLocation = findViewById(R.id.tab_location);
        final ViewPager viewPager = findViewById(R.id.viewpager);

        PagerAdapter pagerAdapter = new
                PagerAdapter(getSupportFragmentManager(),
                tabLayout.getTabCount());

        viewPager.setAdapter(pagerAdapter);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 1) {
                    AlertDialog.Builder alert = new AlertDialog.Builder(Kampus.this);
                    alert.setMessage("SAAT INI BELUM ADA PENERIMAAN MAHASISWA BARU")
                            .setIcon(R.drawable.warning)
                            .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int i) {
                                    dialog.dismiss();
                                }
                            })
                            .setCancelable(false);
                    alert.show();
                }
            }


            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}