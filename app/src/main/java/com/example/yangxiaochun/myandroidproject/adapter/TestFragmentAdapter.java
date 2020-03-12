package com.example.yangxiaochun.myandroidproject.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * @author yangxiaochun
 * @since 10-19-2018
 */
public class TestFragmentAdapter extends FragmentStatePagerAdapter {
    private FragmentManager fragmentManager;
    private List<Fragment> fragments;
    public TestFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    public TestFragmentAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        fragmentManager=fm;
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int i) {
        return fragments.get(i);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
