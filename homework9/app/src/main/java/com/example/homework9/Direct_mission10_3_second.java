package com.example.homework9;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Direct_mission10_3_second extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.direct_mission10_3_second);

        Intent inIntent = getIntent();
        String calc = (inIntent.getStringExtra("Calc"));

        int calValue = 0;
        if (calc.equals("+")) {
            calValue = inIntent.getIntExtra("Num1", 0) + inIntent.getIntExtra("Num2", 0);
        } else if (calc.equals("-")) {
            calValue = inIntent.getIntExtra("Num1", 0) - inIntent.getIntExtra("Num2", 0);
        } else if (calc.equals("*")) {
            calValue = inIntent.getIntExtra("Num1", 0) * inIntent.getIntExtra("Num2", 0);
        } else {
            calValue = inIntent.getIntExtra("Num1", 0) / inIntent.getIntExtra("Num2", 0);
        }

        int retValue = calValue;

        Button btnReturn = findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent outIntent = new Intent(getApplicationContext(), Direct_mission10_3.class);
                outIntent.putExtra("Hap", retValue);
                setResult(RESULT_OK, outIntent);
                finish();
            }
        });
    }
}
