package com.example.shubhamgulati.confluence;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager vp = findViewById(R.id.vp);
        vp.setAdapter(new MyPageAdapter(getSupportFragmentManager()));
        TabLayout tabLayout = findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(vp);
    }
    class MyPageAdapter extends FragmentPagerAdapter{

        public MyPageAdapter(FragmentManager fm) {
            super(fm);
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "About Amity";
                case 1:
                    return "Confluence";
                case 2:
                    return "This App";
            }
            return "";
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0: return new FragmentA();
                case 1: return new FragmentB();
                case 2: return new FragmentC();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}
