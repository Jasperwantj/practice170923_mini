package com.example.practice170916frament_viewpager_tablayout;

//import android.support.design.widget.TabLayout;
import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.addPrintersActivity;
import static android.R.attr.breadCrumbShortTitle;
import static android.R.attr.factor;
import static android.R.attr.fragment;
import static android.R.attr.targetName;
import static android.os.Build.VERSION_CODES.M;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private Fragment1 fragment1 = new Fragment1();
    private Fragment2 fragment2 = new Fragment2();
    private Fragment3 fragment3 = new Fragment3();
    private Fragment4 fragment4 = new Fragment4();


    private com.example.practice170916frament_viewpager_tablayout.MyAdapter adapter;

    private ArrayList<String> titleList = new ArrayList<String>(){{
        add("新生导航");
        add("二手资讯");
        add("校园云打印");
        add("课外生活");
    }};

    private ArrayList<Fragment> fragmentArrayList = new ArrayList<Fragment>(){{
        add(fragment1);
        add(fragment2);
        add(fragment3);
        add(fragment4);
    }};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        tabLayout = (TabLayout)findViewById(R.id.tab_main_activity);
        viewPager = (ViewPager)findViewById(R.id.viewpager);
        setSupportActionBar(toolbar);

        adapter = new MyAdapter(getSupportFragmentManager(),titleList,fragmentArrayList);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager,true);
       // tabLayout.setTabsFromPagerAdapter(adapter);

    }



}

