package com.kel2.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //deklarasi
    TextView password;
    EditText npm, passwd;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // inisiasi
        password = findViewById(R.id.field_pwd);
        npm = findViewById(R.id.field_mail);
        password = findViewById(R.id.field_pwd);
        login = findViewById(R.id.btn_login);

        login.setOnClickListener(view -> {
            //Toast.makeText(MainActivity.this, "Button Login Diklik", Toast.LENGTH_SHORT).show();
            String sUser = npm.getText().toString();
            String sPass = password.getText().toString();

            if (sUser.equals("admin") && sPass.equals("admin123")){
                Toast.makeText(MainActivity.this, "Login Berhasil", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, dashboard.class);
                startActivity(intent);
            }
            else {
                Toast.makeText(MainActivity.this, "Login gagal", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void login(View view){
        Log.d("ini nim/nip", "ini pesan");
        String pass = password.getText().toString();
        Log.d("ini isi pass", pass);
    }

    public void pindahactivity(View view){
        Intent intent = new Intent(MainActivity.this, dashboard.class);
        startActivity(intent);
    }


}