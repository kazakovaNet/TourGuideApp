package ru.kazakova_net.tourguideapp.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

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
        // Получение корневого элемента
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);
        
        // Создание списка достопримечательностей
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction("Церковь Александра Невского", "пл. Александра Невского, 1", R.drawable.al_nevsk, "Построена в 1894 г."));
        attractions.add(new Attraction("Церковь Иконы Божией Матери Всецарица", "микрорайон Южный", R.drawable.vsetcarica, "Расположена при областном онкологическом диспансере"));
        attractions.add(new Attraction("Преображенский храм", "Леоновское ш., 2", R.drawable.preobr, "Расположена в с. Пехра-Яковлевское"));
        attractions.add(new Attraction("Храм Михаила Архангела в Никольско-Архангельском", "Черная дорога, 16а", R.drawable.mikhail, "Барокко 18 века"));

        // Создание адаптера списка
        AttractionAdapter attractionAdapter = new AttractionAdapter(getActivity(), attractions);
        
        // Получение объекта списка
        ListView listView = rootView.findViewById(R.id.attraction_list);
        
        // Назначение списку адаптера
        listView.setAdapter(attractionAdapter);
        
        return rootView;
    }
}
