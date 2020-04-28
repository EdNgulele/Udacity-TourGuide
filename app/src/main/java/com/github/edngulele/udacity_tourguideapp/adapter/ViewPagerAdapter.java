package com.github.edngulele.udacity_tourguideapp.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    //List of fragments
    private final ArrayList<Fragment> fragments = new ArrayList<>();

    //List of Titles
    private final ArrayList<String> fragmentsTitle = new ArrayList<>();

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentsTitle.get(position);
    }

    //Adds fragment and its title
    public void addFragment(Fragment fragment, String title) {
        fragments.add(fragment);
        fragmentsTitle.add(title);
    }
}
