package com.example.homework5;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Project5_3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project53);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(baseLayout,params);

        EditText edt = new EditText(this);
        baseLayout.addView(edt);

        Button btn = new Button(this);
        btn.setText("버튼입니다");
        btn.setBackgroundColor(Color.YELLOW);
        btn.setLayoutParams(new LinearLayout.LayoutParams(500,200));
        baseLayout.addView(btn);

        TextView TV = new TextView(this);
        TV.setTextSize(30);
        TV.setTextColor(Color.BLACK);
        baseLayout.addView(TV);

        TextView TV2 = new TextView(this);
        TV2.setTextSize(20);
        TV2.setTextColor(Color.BLUE);
        TV2.setText("2018038035 권순규");
        baseLayout.addView(TV2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String word = edt.getText().toString();
                TV.setText(word);
            }
        });
    }
}