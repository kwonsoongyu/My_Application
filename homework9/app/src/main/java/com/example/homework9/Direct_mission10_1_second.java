package com.example.homework9;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Direct_mission10_1_second extends Activity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.direct_mission10_1_second);

        Button btnReturn = (Button)findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
