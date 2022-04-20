package com.example.homework6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mission_pdf_Md_8 extends AppCompatActivity {

    Button mmenuButton;
    Button mloginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission_pdf_md_8);

        mmenuButton = findViewById(R.id.mmenuButton);
        mloginButton = findViewById(R.id.mloginButton);

        mmenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Mission_pdf_Menu_8.class);
                startActivity(intent);
                finish();
            }
        });

        mloginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Mission_pdf_Login_8.class);
                startActivity(intent);
                finish();
            }
        });
    }
}