package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity3 extends AppCompatActivity {
    Button button1;
    Button hp;
    RadioGroup rg;
    ImageView imageView_01;
    EditText edittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        imageView_01 = (ImageView) findViewById(R.id.eleven1);
        imageView_01.setImageResource(R.drawable.eleven1);
        rg = findViewById(R.id.radioGroup);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch(checkedId){
                    case R.id.eleven:
                        imageView_01.setImageResource(R.drawable.eleven1);
                        break;
                    case R.id.twelve:
                        imageView_01.setImageResource(R.drawable.twelve1);
                        break;

                }
            }
        });
        edittext = (EditText) findViewById(R.id.sample_EditText);
        button1 = (Button) findViewById(R.id.word);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),edittext.getText(),
                        Toast.LENGTH_SHORT).show();
            }

        });
        hp = (Button)findViewById(R.id.homepage);
        hp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent urlintent = new Intent(Intent.ACTION_VIEW, Uri.parse(""+edittext.getText()));
                startActivity(urlintent);
            }
        });
    }
}