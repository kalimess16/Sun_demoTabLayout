package com.example.tablayout_codetay.Adapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends FragmentStatePagerAdapter {

    private List<String> titles = new ArrayList<>();
    private List<Fragment> mFragments = new ArrayList<>();


    public MyAdapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return titles.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

    public void addFragments(Fragment fragment, String titles){
        mFragments.add(fragment);
        this.titles.add(titles);
    }
}
