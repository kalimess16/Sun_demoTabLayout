package com.example.tablayout_codetay;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.example.tablayout_codetay.Adapter.MyAdapter;
import com.example.tablayout_codetay.fragment.FirstFragment;
import com.example.tablayout_codetay.fragment.SecondFragment;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity implements SendData{

    private TabLayout mTabLayout;
    ViewPager mViewPager;
    MyAdapter myAdapter;
    private FirstFragment mFirstFragment = new FirstFragment();
    private SecondFragment mSecondFragment = new SecondFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        myAdapter = new MyAdapter(getSupportFragmentManager());
        myAdapter.addFragments(mFirstFragment,"TAB 1");
        myAdapter.addFragments(mSecondFragment,"TAB 2");

        mViewPager.setAdapter(myAdapter);
        mTabLayout.setupWithViewPager(mViewPager);


    }

    private void initView() {
        mTabLayout = findViewById(R.id.tap_demo);
        mViewPager = findViewById(R.id.viewpager_demo);
    }

    @Override
    public void sendText(String str) {
        mSecondFragment.setEditText(str);
    }

    @Override
    public void setButtonNP(int p) {
        p = mViewPager.getCurrentItem();
        switch (p){
            case 1: mViewPager.setCurrentItem(0); break;
            default: mViewPager.setCurrentItem(1);break;
        }
    }
}
