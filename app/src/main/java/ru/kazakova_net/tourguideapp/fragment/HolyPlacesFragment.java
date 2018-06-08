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
        attractions.add(new Attraction("Храм Александра Невского", "пл. Александра Невского, 1", R.drawable.al_nevsk, "Белоснежный храм с золотыми куполами реконструирован в 2002 г. (построен в 1894 г.)"));
        attractions.add(new Attraction("Церковь Иконы Божией Матери Всецарица", "микрорайон Южный", R.drawable.vsetcarica, "Расположена при областном онкологическом диспансере"));
        attractions.add(new Attraction("Преображенский храм", "Леоновское ш., 2", R.drawable.preobr, "Храм конца XVIII века, расположен на высоком мысу над маленькой речкой Пехоркой"));
        attractions.add(new Attraction("Храм Михаила Архангела в Никольско-Архангельском", "Черная дорога, 16а", R.drawable.mikhail, "Барокко 18 века"));
        attractions.add(new Attraction("Храм Покрова Пресвятой Богородицы", "Щелковское ш., стр. 133", R.drawable.protection_holy_virgin, "Ампирный храм архитектора Бове был построен в начале XIX века. Закрывался, но был возвращен верующим в 1992 году"));
        attractions.add(new Attraction("Храм Почаевской Иконы Божией Матери", "Разинское ш., 1а", R.drawable.pochayevskaya_icon, "Строящийся храм в районе железнодорожной станции Салтыковская"));
        attractions.add(new Attraction("Церковь Владимира равноапостольного", "пл. Александра Невского, 2", R.drawable.st_vladimir, "Небольшой крестильный храм в кирпичном двухэтажном доме причта при Александро-Невской церкви. Здание увенчано звонницей"));
        attractions.add(new Attraction("Храм Рождества Пресвятой Богородицы в Трубецком", "Трубецкая, 52а", R.drawable.nativity_virgin, "Церковь середины XIX века"));
        
        // Создание адаптера списка
        final AttractionAdapter attractionAdapter = new AttractionAdapter(getActivity(), attractions);
        
        // Получение объекта списка
        ListView listView = rootView.findViewById(R.id.attraction_list);
        
        // Назначение списку адаптера
        listView.setAdapter(attractionAdapter);
        
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "Адрес: " + attractionAdapter.getItem(position).getAddress(), Toast.LENGTH_SHORT).show();
            }
        });
        
        return rootView;
    }
}
