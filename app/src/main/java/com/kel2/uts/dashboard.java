package com.kel2.uts;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.cardview.widget.CardView;

public class dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        CardView card_layanan1 = findViewById(R.id.pindahkls1);
        CardView card_layanan2 = findViewById(R.id.pindahkls2);
        CardView card_layanan3 = findViewById(R.id.pindahkls3);
        CardView card_layanan4 = findViewById(R.id.pindahkls4);

        card_layanan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Buat Intent untuk pindah ke activity yang diinginkan (misalnya, LayananActivity)
                Intent intent1 = new Intent(getApplicationContext(), layanan.class);
                startActivity(intent1);
            }
        });

        card_layanan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Buat Intent untuk pindah ke activity yang diinginkan (misalnya, LayananActivity)
                Intent intent2 = new Intent(getApplicationContext(), lokasi.class);
                startActivity(intent2);
            }
        });

        card_layanan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Buat Intent untuk pindah ke activity yang diinginkan (misalnya, LayananActivity)
                Intent intent3 = new Intent(getApplicationContext(), kontak.class);
                startActivity(intent3);
            }
        });

        card_layanan4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Buat Intent untuk pindah ke activity yang diinginkan (misalnya, LayananActivity)
                Intent intent4 = new Intent(getApplicationContext(), ask.class);
                startActivity(intent4);
            }
        });
    }
}