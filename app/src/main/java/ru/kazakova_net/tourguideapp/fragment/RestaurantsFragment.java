package ru.kazakova_net.tourguideapp.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Objects;

import ru.kazakova_net.tourguideapp.R;
import ru.kazakova_net.tourguideapp.adapter.AttractionAdapter;
import ru.kazakova_net.tourguideapp.model.Attraction;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {
    
    
    public RestaurantsFragment() {
        // Required empty public constructor
    }
    
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Getting the root element
        View rootView = inflater.inflate(R.layout.list_attraction, container, false);
    
        // Create a list of attractions
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(getString(R.string.res_name1), getString(R.string.res_address1), R.drawable.la_provance, getString(R.string.res_description1)));
        attractions.add(new Attraction(getString(R.string.res_name2), getString(R.string.res_address2), R.drawable.pizza_roma, getString(R.string.res_description2)));
        attractions.add(new Attraction(getString(R.string.res_name3), getString(R.string.res_address3), R.drawable.food_market, getString(R.string.res_description3)));
        attractions.add(new Attraction(getString(R.string.res_name4), getString(R.string.res_address4), R.drawable.nosorog, getString(R.string.res_description4)));
        attractions.add(new Attraction(getString(R.string.res_name5), getString(R.string.res_address5), R.drawable.raiski_sad, getString(R.string.res_description5)));
        attractions.add(new Attraction(getString(R.string.res_name6), getString(R.string.res_address6), R.drawable.talaver, getString(R.string.res_description6)));
        attractions.add(new Attraction(getString(R.string.res_name7), getString(R.string.res_address7), R.drawable.dodo_pizza, getString(R.string.res_description7)));
    
        // Create a list adapter
        final AttractionAdapter attractionAdapter = new AttractionAdapter(Objects.requireNonNull(getActivity()), attractions);
    
        // Getting a list object
        ListView listView = rootView.findViewById(R.id.attraction_list);
    
        // Assigning an adapter to the list
        listView.setAdapter(attractionAdapter);
    
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), getString(R.string.toast_address) + Objects.requireNonNull(attractionAdapter.getItem(position)).getAddress(), Toast.LENGTH_SHORT).show();
            }
        });
        
        return rootView;
    }
    
}
