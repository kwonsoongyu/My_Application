package com.example.homework9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class mission10_1 extends AppCompatActivity {
    private Button btnNewActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mission10_1);

        init();
        initLr();
    }
    public void init(){
        btnNewActivity = findViewById(R.id.btnNewActivity);
    }

    public void initLr(){
        btnNewActivity.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), mission10_1_second.class);
            startActivity(intent);
        });
    }
}