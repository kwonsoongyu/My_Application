package com.example.homework6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mission_pdf_custom_8 extends AppCompatActivity {

    Button cmenuButton;
    Button cloginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission_pdf_custom_8);

        cmenuButton = findViewById(R.id.cmenuButton);
        cloginButton = findViewById(R.id.cloginButton);

        cmenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Mission_pdf_Menu_8.class);
                startActivity(intent);
                finish();
            }
        });

        cloginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Mission_pdf_Login_8.class);
                startActivity(intent);
                finish();
            }
        });
    }
}