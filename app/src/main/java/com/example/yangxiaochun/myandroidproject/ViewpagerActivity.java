package com.example.yangxiaochun.myandroidproject;

import android.graphics.Color;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.yangxiaochun.myandroidproject.adapter.TestFragmentAdapter;
import com.example.yangxiaochun.myandroidproject.fragment.TestFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangxiaochun
 * @since 10-19-2018
 */
public class ViewpagerActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView tvItemOne;
    private TextView tvItemTwo;
    private TextView tvItemThree;
    private ViewPager viewpager;

    List<Fragment> fragments;

    private TestFragmentAdapter testFragmentAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpagerdemo);
        initView();
        initData();
        initAdapter();
    }

    private void initAdapter() {
        testFragmentAdapter=new TestFragmentAdapter(getSupportFragmentManager(),fragments);
        viewpager.setAdapter(testFragmentAdapter);
        viewpager.setCurrentItem(0);
        tvItemOne.setBackgroundColor(getResources().getColor(R.color.colorAccent));
    }

    private void initData() {
        fragments=new ArrayList<>();
        fragments.add(new TestFragment());
        fragments.add(new TestFragment());
        fragments.add(new TestFragment());

    }

    private void initView() {
        tvItemOne = findViewById(R.id.tv_item_one);
        tvItemTwo = findViewById(R.id.tv_item_two);
        tvItemThree = findViewById(R.id.tv_item_three);
        viewpager = findViewById(R.id.viewpager);

        tvItemOne.setOnClickListener(this);
        tvItemTwo.setOnClickListener(this);
        tvItemThree.setOnClickListener(this);

        viewpager.addOnPageChangeListener(new MyPagerChangeListener());
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv_item_one:{
                viewpager.setCurrentItem(0);
                tvItemOne.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                tvItemTwo.setBackgroundColor(Color.WHITE);
                tvItemThree.setBackgroundColor(Color.WHITE);
            }
            break;
            case R.id.tv_item_two:{
                viewpager.setCurrentItem(1);
                tvItemOne.setBackgroundColor(Color.WHITE);
                tvItemTwo.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                tvItemThree.setBackgroundColor(Color.WHITE);
            }
            break;
            case R.id.tv_item_three:{
                viewpager.setCurrentItem(2);
                tvItemOne.setBackgroundColor(Color.WHITE);
                tvItemTwo.setBackgroundColor(Color.WHITE);
                tvItemThree.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            }
            break;
        }
    }

    class MyPagerChangeListener implements ViewPager.OnPageChangeListener {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {
            switch (i){
                case 0:{
                    viewpager.setCurrentItem(0);
                    tvItemOne.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                    tvItemTwo.setBackgroundColor(Color.WHITE);
                    tvItemThree.setBackgroundColor(Color.WHITE);

                }
                break;
                case 1:{
                    viewpager.setCurrentItem(1);
                    tvItemOne.setBackgroundColor(Color.WHITE);
                    tvItemTwo.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                    tvItemThree.setBackgroundColor(Color.WHITE);
                }
                break;
                case 2:{
                    viewpager.setCurrentItem(2);
                    tvItemOne.setBackgroundColor(Color.WHITE);
                    tvItemTwo.setBackgroundColor(Color.WHITE);
                    tvItemThree.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                }
                break;
            }
        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    }

}

