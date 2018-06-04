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
public class PlacesFragment extends Fragment {
    
    
    public PlacesFragment() {
        // Required empty public constructor
    }
    
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Получение корневого элемента
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);
        
        // Создание списка достопримечательностей
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction("Памятник дворнику", "пр-т. Ленина, 45", R.drawable.street_cleaner, "Необычный памятник на центральной улице города"));
        attractions.add(new Attraction("Фонтан \"Глыба\"", "ул. Советская, 5/8", R.drawable.rock_fountain, "На некотором расстоянии производит впечатление висящего в воздухе камня, из которого вниз падает поток воды"));
        attractions.add(new Attraction("Памятник павшим воинам-землякам", "площадь Славы", R.drawable.soldiers_brothers, "Памятник в виде стеллы с \"вечным огнем\""));
        attractions.add(new Attraction("Могила Майкла Лунна", "с. Никольское-Трубецкое", R.drawable.grave_m_lunn, "Могила англичанина, одного из основателей города"));
        attractions.add(new Attraction("Памяти жертв политических репресий", "пр-т. Ленина, 6", R.drawable.victims_repression, "Памятник в честь 147 жителей Балашихи, осужденных по политическим мотивам"));
        attractions.add(new Attraction("Мост влюбленных", "микр-н Балашиха-2", R.drawable.lovers_bridge, "Мост между Балашихой-2 и Новым Светом"));
        
        // Создание адаптера списка
        AttractionAdapter attractionAdapter = new AttractionAdapter(getActivity(), attractions);
        
        // Получение объекта списка
        ListView listView = rootView.findViewById(R.id.attraction_list);
        
        // Назначение списку адаптера
        listView.setAdapter(attractionAdapter);
        
        return rootView;
    }
    
}
