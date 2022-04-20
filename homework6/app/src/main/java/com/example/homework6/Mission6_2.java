package com.example.homework6;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class Mission6_2 extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission6_2);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabDog = tabHost.newTabSpec("dog").setIndicator("강아지");
        tabDog.setContent(R.id.dog);
        tabHost.addTab(tabDog);

        TabHost.TabSpec tabCat = tabHost.newTabSpec("cat").setIndicator("고양이");
        tabCat.setContent(R.id.cat);
        tabHost.addTab(tabCat);

        TabHost.TabSpec tabRabbit = tabHost.newTabSpec("rab").setIndicator("토끼");
        tabRabbit.setContent(R.id.rabbit);
        tabHost.addTab(tabRabbit);

        TabHost.TabSpec tabHorse = tabHost.newTabSpec("lion").setIndicator("사자");
        tabHorse.setContent(R.id.horse);
        tabHost.addTab(tabHorse);

        tabHost.setCurrentTab(0);
    }
}