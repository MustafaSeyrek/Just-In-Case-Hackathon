package com.jic.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Açılış ekranı
        Thread thread = new Thread() {
            public void run() {
                try {
                    sleep(1500);
                    startActivity(new Intent(MainActivity.this,LoginActivity.class));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                   finish();
                }
            }
        };
        thread.start();

    }
}