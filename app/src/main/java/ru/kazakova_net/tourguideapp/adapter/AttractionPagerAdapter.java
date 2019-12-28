package ru.kazakova_net.tourguideapp.adapter;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import ru.kazakova_net.tourguideapp.R;
import ru.kazakova_net.tourguideapp.fragment.HolyPlacesFragment;
import ru.kazakova_net.tourguideapp.fragment.ParksFragment;
import ru.kazakova_net.tourguideapp.fragment.PlacesFragment;
import ru.kazakova_net.tourguideapp.fragment.RestaurantsFragment;

public class AttractionPagerAdapter extends FragmentPagerAdapter {
    private static final int MAX_TABS = 4;
    private Context mContext;
    
    public AttractionPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }
    
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PlacesFragment();
        } else if (position == 1) {
            return new HolyPlacesFragment();
        } else if (position == 2) {
            return new ParksFragment();
        } else {
            return new RestaurantsFragment();
        }
    }
    
    @Override
    public int getCount() {
        return MAX_TABS;
    }
    
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.monument);
        } else if (position == 1) {
            return mContext.getString(R.string.temples_and_churches);
        } else if (position == 2) {
            return mContext.getString(R.string.parks_and_homesteads);
        } else {
            return mContext.getString(R.string.restaurants_and_cafes);
        }
    }
}
