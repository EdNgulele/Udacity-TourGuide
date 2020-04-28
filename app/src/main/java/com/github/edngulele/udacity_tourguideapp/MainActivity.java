package com.github.edngulele.udacity_tourguideapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.github.edngulele.udacity_tourguideapp.adapter.ViewPagerAdapter;
import com.github.edngulele.udacity_tourguideapp.ui.hotel.HotelFragment;
import com.github.edngulele.udacity_tourguideapp.ui.museum.MuseumFragment;
import com.github.edngulele.udacity_tourguideapp.ui.restaurant.RestaurantFragment;
import com.github.edngulele.udacity_tourguideapp.ui.shopping.ShoppingFragment;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private ViewPagerAdapter viewPagerAdapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new HotelFragment(), getString(R.string.hotel));
        viewPagerAdapter.addFragment(new MuseumFragment(), getString(R.string.museum));
        viewPagerAdapter.addFragment(new RestaurantFragment(), getString(R.string.food));
        viewPagerAdapter.addFragment(new ShoppingFragment(), getString(R.string.shopping));

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
