package ru.kazakova_net.tourguideapp.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.Objects;

import ru.kazakova_net.tourguideapp.R;
import ru.kazakova_net.tourguideapp.adapter.AttractionAdapter;
import ru.kazakova_net.tourguideapp.model.Attraction;

/**
 * A simple {@link Fragment} subclass.
 */
public class HolyPlacesFragment extends Fragment {
    
    
    public HolyPlacesFragment() {
        // Required empty public constructor
    }
    
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Getting the root element
        View rootView = inflater.inflate(R.layout.list_attraction, container, false);
        
        // Create a list of attractions
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(getString(R.string.hp_name1), getString(R.string.hp_address1), R.drawable.al_nevsk, getString(R.string.hp_description1)));
        attractions.add(new Attraction(getString(R.string.hp_name2), getString(R.string.hp_address2), R.drawable.vsetcarica, getString(R.string.hp_description2)));
        attractions.add(new Attraction(getString(R.string.hp_name3), getString(R.string.hp_address3), R.drawable.preobr, getString(R.string.hp_description3)));
        attractions.add(new Attraction(getString(R.string.hp_name4), getString(R.string.hp_address4), R.drawable.mikhail, getString(R.string.hp_description4)));
        attractions.add(new Attraction(getString(R.string.hp_name5), getString(R.string.hp_address5), R.drawable.protection_holy_virgin, getString(R.string.hp_description5)));
        attractions.add(new Attraction(getString(R.string.hp_name6), getString(R.string.hp_address6), R.drawable.pochayevskaya_icon, getString(R.string.hp_description6)));
        attractions.add(new Attraction(getString(R.string.hp_name7), getString(R.string.hp_address7), R.drawable.st_vladimir, getString(R.string.hp_description7)));
        attractions.add(new Attraction(getString(R.string.hp_name8), getString(R.string.hp_address8), R.drawable.nativity_virgin, getString(R.string.hp_description8)));
        
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
