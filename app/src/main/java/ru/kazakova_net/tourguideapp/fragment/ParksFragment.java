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
public class ParksFragment extends Fragment {
    
    
    public ParksFragment() {
        // Required empty public constructor
    }
    
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Получение корневого элемента
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);
        
        // Создание списка достопримечательностей
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction("Парк Пехорка", "ул. Парковая, вл. 4", R.drawable.pehorka, "Центральный парк города. Начата реконструкция в 2017 г."));
        attractions.add(new Attraction("Озерный лесопарк", "г. Балашиха", R.drawable.ozernyi_lesopark, "Парк культуры и отдыха"));
        attractions.add(new Attraction("Лисья Гора", "Леоновское ш., 1", R.drawable.lisya_gora, "Зона катания на горных лыжах и сноубордах"));
        attractions.add(new Attraction("Усадьба Горенки", "Энтузиастов ш., 6", R.drawable.gorenki, "В начале 18 века Горенки принадлежали князьям Долгоруким"));
        attractions.add(new Attraction("Усадьба Пехра-Яковлевское", "Леоновское ш., 2", R.drawable.pekhra_yakovlevskoe, "Усадьба князей Голицыных"));
        attractions.add(new Attraction("Парк Аллея Славы", "мкрн. Железнодорожный, ул. Советская, 18", R.drawable.alleya_slavy, "Парк культуры и отдыха"));
        attractions.add(new Attraction("Картинная галерея городского округа", "пр-т Ленина, 10", R.drawable.art_gallery, "В коллекции около 400 предметов 1930-2013 года живописи советского и постсоветского периода"));
        
        // Создание адаптера списка
        AttractionAdapter attractionAdapter = new AttractionAdapter(getActivity(), attractions);
        
        // Получение объекта списка
        ListView listView = rootView.findViewById(R.id.attraction_list);
        
        // Назначение списку адаптера
        listView.setAdapter(attractionAdapter);
        
        return rootView;
    }
    
}
