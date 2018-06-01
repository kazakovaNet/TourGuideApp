package ru.kazakova_net.tourguideapp.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import ru.kazakova_net.tourguideapp.fragment.HolyPlacesFragment;
import ru.kazakova_net.tourguideapp.fragment.RestaurantsFragment;

public class AttractionPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;
    
    public AttractionPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }
    
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantsFragment();
        } else {
            return new HolyPlacesFragment();
        }
    }
    
    @Override
    public int getCount() {
        return 2;
    }
    
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Рестораны";
        } else {
            return "Святые места";
        }
    }
}
