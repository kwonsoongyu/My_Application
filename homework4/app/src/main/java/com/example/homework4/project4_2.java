package com.example.homework4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class project4_2 extends AppCompatActivity {
    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnRest;
    TextView textResult;
    String num1,num2;
    Double result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.project4_2);

        setTitle("초간단 계산기");
        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);
        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnDiv = (Button) findViewById(R.id.BtnDiv);
        btnMul = (Button) findViewById(R.id.BtnMul);
        btnSub = (Button) findViewById(R.id.BtnSub);
        btnRest = (Button) findViewById(R.id.BtnRest);
        textResult = (TextView) findViewById(R.id.TextResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.trim().equals("") || num2.trim().equals(""))
                {
                    Toast.makeText(getApplicationContext(),"텍스트 값을 입력하세요",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    result = Double.parseDouble(num1) + Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.trim().equals("") || num2.trim().equals(""))
                {
                    Toast.makeText(getApplicationContext(),"텍스트 값을 입력하세요",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    result = Double.parseDouble(num1) - Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.trim().equals("") || num2.trim().equals(""))
                {
                    Toast.makeText(getApplicationContext(),"텍스트 값을 입력하세요",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    result = Double.parseDouble(num1) * Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num2.trim().equals("0"))
                {
                    Toast.makeText(getApplicationContext(),"분모를 입력하세요",Toast.LENGTH_SHORT).show();
                }
                else if(num1.trim().equals("") || num2.trim().equals(""))
                {
                    Toast.makeText(getApplicationContext(),"텍스트 값을 입력하세요",Toast.LENGTH_SHORT).show();
                }
                else {
                    result = Double.parseDouble(num1) / Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });
        btnRest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.trim().equals("") || num2.trim().equals(""))
                {
                    Toast.makeText(getApplicationContext(),"텍스트 값을 입력하세요",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    result = Double.parseDouble(num1) % Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });
    }
}