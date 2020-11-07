package com.jic.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText kullaniciAdi, sifre;
    Button giris;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        kullaniciAdi = (EditText)findViewById(R.id.editKullaniciAdi);
        sifre = (EditText)findViewById(R.id.editSifre);
        giris = (Button)findViewById(R.id.btnGiris);
        giris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kullaniciAdi.getText().toString().equals("guns") && sifre.getText().toString().equals("hack")){
                    Intent intent = new Intent(LoginActivity.this,MainActivity2.class);
                    startActivity(intent);
                }
                else if(!kullaniciAdi.getText().toString().equals("guns") && !sifre.getText().toString().equals("hack")){
                    Toast.makeText(LoginActivity.this,"Kullanıcı Adı veya Şifre Yanlış!",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}