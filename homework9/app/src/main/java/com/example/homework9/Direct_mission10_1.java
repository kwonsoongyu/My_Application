package com.example.homework9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Direct_mission10_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.direct_mission10_1);

        final RadioButton rdoSecond = (RadioButton) findViewById(R.id.rdoSecond);

        Button btnNewActivity = (Button)findViewById(R.id.btnNewActivity);
        btnNewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;

                if(rdoSecond.isChecked() == true) intent = new Intent(getApplicationContext(), Direct_mission10_1_second.class);
                else intent = new Intent(getApplicationContext(), Direct_mission10_1_third.class);

                startActivity(intent);
            }
        });
    }
}