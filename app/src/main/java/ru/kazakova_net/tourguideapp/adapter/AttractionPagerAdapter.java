package ru.kazakova_net.tourguideapp.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import ru.kazakova_net.tourguideapp.R;
import ru.kazakova_net.tourguideapp.fragment.HolyPlacesFragment;
import ru.kazakova_net.tourguideapp.fragment.ParksFragment;
import ru.kazakova_net.tourguideapp.fragment.PlacesFragment;
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
        return 4;
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
