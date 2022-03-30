package com.example.homework4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class project4_5 extends AppCompatActivity {
    ImageView Imageview1,Imageview2;
    Button btn;
    boolean i = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.project4_5);

        Imageview1 = (ImageView) findViewById(R.id.imageview1);
        Imageview2 = (ImageView) findViewById(R.id.imageview2);
        btn = (Button) findViewById(R.id.button1);

        Imageview1.setImageResource(R.drawable.cat);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i==true){
                    Imageview2.setVisibility(android.view.View.VISIBLE);
                    Imageview2.setImageResource(R.drawable.rabbit);
                    Imageview1.setVisibility(View.INVISIBLE);
                    i = false;
                }
                else{
                    Imageview1.setVisibility(View.VISIBLE);
                    Imageview1.setImageResource(R.drawable.cat);
                    Imageview2.setVisibility(View.INVISIBLE);
                    i = true;
                }
            }
        });
    }
}