package com.ecastro.appguatemala;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import adapter.TabAdapter;

public class HomeActivity extends AppCompatActivity {

    ViewPager viewPager1;
    TabLayout tabLayout1;
    TabAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        List<String> list = new ArrayList<String>();
        list.add("WOMEN ");
        list.add("KID ");
        list.add("PRODUCT");

        tabLayout1 = findViewById(R.id.tablayout1);

        viewPager1 = findViewById(R.id.viewpager1);

//        setCustomFontAndStyle(tabLayout1, 0);
        tabLayout1.setTabGravity(TabLayout.GRAVITY_FILL);


        tabLayout1.addTab(tabLayout1.newTab().setText("CULTURA"));
        tabLayout1.addTab(tabLayout1.newTab().setText("TRADICIONES"));
        tabLayout1.addTab(tabLayout1.newTab().setText("TURISMO"));
    }
}
