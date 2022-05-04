package com.example.homework9;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class mission10_1_second extends Activity {
    private Button btnReturn;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mission10_1_second);

        init();
        initLr();
    }
    public void init(){
        btnReturn = findViewById(R.id.btnReturn);
    }

    public void initLr(){
        btnReturn.setOnClickListener(v -> {
            finish();
        });
    }
}
