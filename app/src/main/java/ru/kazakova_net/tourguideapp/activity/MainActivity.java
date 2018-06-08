package ru.kazakova_net.tourguideapp.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

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
