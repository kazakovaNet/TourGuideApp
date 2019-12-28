package ru.kazakova_net.tourguideapp.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import ru.kazakova_net.tourguideapp.R;
import ru.kazakova_net.tourguideapp.adapter.AttractionPagerAdapter;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
        
        ViewPager attractionViewPager = findViewById(R.id.attractionViewPager);
        
        AttractionPagerAdapter attractionPagerAdapter = new AttractionPagerAdapter(MainActivity.this, getSupportFragmentManager());
        
        attractionViewPager.setAdapter(attractionPagerAdapter);
        
        TabLayout attractionTabs = findViewById(R.id.attractionTabs);
        attractionTabs.setupWithViewPager(attractionViewPager);
    }
}
