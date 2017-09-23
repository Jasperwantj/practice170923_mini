package com.example.practice170916frament_viewpager_tablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by 万天娇 on 2017/9/22.
 */

public class MyAdapter extends FragmentPagerAdapter {
    private ArrayList<String> titileList;
    private ArrayList<Fragment> fragmenArraytList;

    public MyAdapter(FragmentManager fm, ArrayList<String> titleList, ArrayList<Fragment> fragmentArrayList) {
        super(fm);
        this.titileList = titleList;
        this.fragmenArraytList = fragmentArrayList;
    }

    public Fragment getItem(int position){
        return fragmenArraytList.get(position);
    }

    @Override
    public int getCount() {
        return fragmenArraytList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }
    public  CharSequence getPageTitle(int position){
        return titileList.get(position);
    }

}