package com.jic.cv;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class EklemeActivity extends AppCompatActivity {
    Button yukle;
    TextView pathCV;
    Intent dosya;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekleme);

        pathCV=(TextView)findViewById(R.id.txtPath);
        yukle =(Button)findViewById(R.id.btnYukle);
        yukle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dosya=new Intent(Intent.ACTION_GET_CONTENT);
                dosya.setType("*/*");
                startActivityForResult(dosya,10);

            }
        });
    }

    @SuppressLint("MissingSuperCall")
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        switch (requestCode){
            case 10:
                if(requestCode==RESULT_OK){
                    String p = data.getData().getPath().toString();
                    pathCV.setText(p);
                }
                break;
        }
    }
}
