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
public class RestaurantsFragment extends Fragment {
    
    
    public RestaurantsFragment() {
        // Required empty public constructor
    }
    
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Получение корневого элемента
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);
        
        // Создание списка достопримечательностей
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction("Ля Прованс", "ул. Площадь славы, 1", R.drawable.la_provance, "Семейный ресторан французской кухни"));
        attractions.add(new Attraction("Pizza Roma", "ш. Энтузиастов, 29", R.drawable.pizza_roma, "Ресторан авторской итальянской кухни"));
        attractions.add(new Attraction("Food Market", "ул. Свердлова, 3", R.drawable.food_market, "Очень приятное место для небольших посиделок, чтоб зарядиться энергией вкусного кофе и выпечки"));
        attractions.add(new Attraction("Кафе Носорог", "ул. Вокзальная, 2А", R.drawable.nosorog, "Крафтовое пиво на высоком уровне"));
        attractions.add(new Attraction("Райский сад", "ул. Текстильщиков, 1А", R.drawable.raiski_sad, "Кафе в кавказском стиле, хороший шашлык"));
        attractions.add(new Attraction("Кафе-Хинкальная \"ТалавеР\"", "Энтузиастов ш., 7В", R.drawable.talaver, "Грузинская кухня"));
        attractions.add(new Attraction("Додо Пицца", "пр-т Ленина, 23/5", R.drawable.dodo_pizza, "Сеть пиццерий"));
        
        // Создание адаптера списка
        AttractionAdapter attractionAdapter = new AttractionAdapter(getActivity(), attractions);
        
        // Получение объекта списка
        ListView listView = rootView.findViewById(R.id.attraction_list);
        
        // Назначение списку адаптера
        listView.setAdapter(attractionAdapter);
        
        return rootView;
    }
    
}
