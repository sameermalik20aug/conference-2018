package com.example.shubhamgulati.confluence;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button nButton;
    ViewPager vp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vp = findViewById(R.id.vp);
        vp.setAdapter(new MyPageAdapter(getSupportFragmentManager()));
        TabLayout tabLayout = findViewById(R.id.tabDots);
        tabLayout.setupWithViewPager(vp);
        nButton = findViewById(R.id.Next);
//        nButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                vp.setCurrentItem(1);
//            }
//        });

            }
    class MyPageAdapter extends FragmentPagerAdapter{

        public MyPageAdapter(FragmentManager fm) {
            super(fm);
        }


        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0: return new FragmentA();
                case 1: return new FragmentC();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 2;
        }
    }
}
