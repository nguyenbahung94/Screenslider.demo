package com.example.android.screensliderdemo;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    ViewPagerAdapter adapter;
    Button button;
    int dem = 0;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.btn_sayhello);
        textView = (TextView) findViewById(R.id.Tv_hienthi);

        viewPager = (ViewPager) findViewById(R.id.view_pager);
        adapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(adapter);
    }
}