package ru.kazakova_net.tourguideapp.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import ru.kazakova_net.tourguideapp.R;
import ru.kazakova_net.tourguideapp.model.Attraction;

public class AttractionAdapter extends ArrayAdapter<Attraction> {
    /**
     * Кастомный конструктор {@link AttractionAdapter}
     *
     * @param context     контекст
     * @param attractions список объектов
     */
    public AttractionAdapter(@NonNull Activity context, @NonNull ArrayList<Attraction> attractions) {
        super(context, 0, attractions);
    }
    
    /**
     * Возвращает объект {@link View} для отображения данных о достопримечательности в указанной позиции в наборе объектов
     *
     * @param position    позиция в наборе данных
     * @param convertView переработанный {@link View} для заполнения
     * @param parent      родительский объект {@link ViewGroup}, используемый для поиска
     * @return View для указанной позиции
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // A new View object is formed from xml in case it is impossible to use the available
        View listItemView = convertView;
        
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_attraction, parent, false);
        }
        
        // Obtaining an Attraction object located at a specified position in a set of objects
        Attraction attraction = getItem(position);
        
        // Getting the TextView
        TextView attractionNameTextView = listItemView.findViewById(R.id.attraction_name_text_view);
        TextView attractionDescriptionTextView = listItemView.findViewById(R.id.attraction_description_text_view);
        
        // Getting the ImageView
        ImageView attractionImageView = listItemView.findViewById(R.id.attraction_image_view);
        
        // Getting property sights and setting values for widgets
        if (attraction != null) {
            attractionNameTextView.setText(attraction.getName());
            attractionDescriptionTextView.setText(attraction.getDescription());
            
            attractionImageView.setImageResource(attraction.getObjectImageResourceId());
            attractionImageView.setVisibility(View.VISIBLE);
        }
        
        // Returning a list item with a filled in content
        return listItemView;
    }
}
