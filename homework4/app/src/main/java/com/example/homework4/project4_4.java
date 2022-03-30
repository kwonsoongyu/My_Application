package com.example.homework4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class project4_4 extends AppCompatActivity {
    TextView text1,text2;
    Switch swiAgree;
    RadioGroup rGroup1;
    RadioButton rdoDog, rdoCat, rdoRabbit;
    Button btnOK,End,Start;
    ImageView imgAndroid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.project4_4);
        setTitle("좋아하는 안드로이드 사진 보기");

        text1 = (TextView) findViewById(R.id.Text1);
        swiAgree = (Switch) findViewById(R.id.SwiAgree);
        text2 = (TextView) findViewById(R.id.Text2);
        rGroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
        rdoDog = (RadioButton) findViewById(R.id.Rdo1);
        rdoCat = (RadioButton) findViewById(R.id.Rdo2);
        rdoRabbit = (RadioButton) findViewById(R.id.Rdo3);
        imgAndroid = (ImageView) findViewById(R.id.Imgandroid);
        End = (Button) findViewById(R.id.end);
        Start = (Button) findViewById(R.id.init);

        swiAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(android.view.View.VISIBLE);
                    imgAndroid.setVisibility(android.view.View.VISIBLE);
                }
                else{
                    text2.setVisibility(android.view.View.INVISIBLE);
                    rGroup1.setVisibility(android.view.View.INVISIBLE);
                    imgAndroid.setVisibility(android.view.View.INVISIBLE);
                }
            }
        });
        rGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
               switch(i){
                   case R.id.Rdo1:
                       imgAndroid.setImageResource(R.drawable.android1);
                       break;
                   case R.id.Rdo2:
                       imgAndroid.setImageResource(R.drawable.android2);
                       break;
                   case R.id.Rdo3:
                       imgAndroid.setImageResource(R.drawable.android3);
                       break;
               }
            }
        });
        End.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                swiAgree.toggle();
                rGroup1.clearCheck();
            }
        });
    }
}