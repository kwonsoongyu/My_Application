package com.example.homework5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Project5_4 extends AppCompatActivity {
    String text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project54);

        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        Button[] numBtn = new Button[10];
        Integer[] btnID = {
                R.id.btn_0, R.id.btn_1, R.id.btn_2, R.id.btn_3,
                R.id.btn_4, R.id.btn_5, R.id.btn_6,
                R.id.btn_7, R.id.btn_8, R.id.btn_9,
        };

        Button add = findViewById(R.id.Add);
        Button minus = findViewById(R.id.Sub);
        Button mul = findViewById(R.id.Mul);
        Button div = findViewById(R.id.Div);

        TextView result = findViewById(R.id.result);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().length() == 0 || num2.getText().length() == 0){
                    Toast.makeText(Project5_4.this, "숫자를 입력하세요", Toast.LENGTH_SHORT).show();
                }else{
                    text1 = num1.getText().toString();
                    text2 = num2.getText().toString();
                    float tmpRet1 = Float.parseFloat(text1);
                    float tmpRet2 = Float.parseFloat(text2);
                    String ret = Float.toString(tmpRet1+tmpRet2);
                    result.setText(ret);
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().length() == 0 || num2.getText().length() == 0){
                    Toast.makeText(Project5_4.this, "숫자를 입력하세요", Toast.LENGTH_SHORT).show();
                }else{
                    text1 = num1.getText().toString();
                    text2 = num2.getText().toString();
                    float tmpRet1 = Float.parseFloat(text1);
                    float tmpRet2 = Float.parseFloat(text2);
                    String ret = Float.toString(tmpRet1-tmpRet2);
                    result.setText(ret);
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().length() == 0 || num2.getText().length() == 0){
                    Toast.makeText(Project5_4.this, "숫자를 입력하세요", Toast.LENGTH_SHORT).show();
                }else{
                    text1 = num1.getText().toString();
                    text2 = num2.getText().toString();
                    float tmpRet1 = Float.parseFloat(text1);
                    float tmpRet2 = Float.parseFloat(text2);
                    String ret = Float.toString(tmpRet1*tmpRet2);
                    result.setText(ret);
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().length() == 0 || num2.getText().length() == 0){
                    Toast.makeText(Project5_4.this, "숫자를 입력하세요", Toast.LENGTH_SHORT).show();
                }else{
                    if(num1.getText().toString().equals("0")){
                        Toast.makeText(Project5_4.this, "0으로는 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                    }else{
                        text1 = num1.getText().toString();
                        text2 = num2.getText().toString();
                        float tmpRet1 = Float.parseFloat(text1);
                        float tmpRet2 = Float.parseFloat(text2);
                        String ret = Float.toString(tmpRet1/tmpRet2);
                        result.setText(ret);
                    }

                }
            }
        });

        for(int i =0;i<btnID.length;i++){
            numBtn[i] = findViewById(btnID[i]);
        }

        for (int i=0;i<numBtn.length;i++){
            int idx;
            idx = i;
            numBtn[idx].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (num1.isFocused()){
                        text1 = num1.getText().toString();
                        num1.setText(text1+numBtn[idx].getText().toString());
                    }else if(num2.isFocused()){
                        text2 = num2.getText().toString();
                        num2.setText(text2+numBtn[idx].getText().toString());
                    }else {
                        Toast.makeText(Project5_4.this, "먼저 edittext를 선택하세요", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

    }
}