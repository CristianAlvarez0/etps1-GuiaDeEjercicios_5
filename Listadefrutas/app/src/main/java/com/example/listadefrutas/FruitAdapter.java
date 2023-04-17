package com.example.listadefrutas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.listadefrutas.Fruit;

import java.util.ArrayList;

public class FruitAdapter extends ArrayAdapter<Fruit> {

    public FruitAdapter(Context context, ArrayList<Fruit> fruits) {
        super(context, 0, fruits);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_fruit, parent, false);
        }

        Fruit fruit = getItem(position);

        ImageView imageView = convertView.findViewById(R.id.image_view);
        imageView.setImageResource(fruit.getImageResourceId());

        TextView nameTextView = convertView.findViewById(R.id.name_text_view);
        nameTextView.setText(fruit.getName());

        TextView descriptionTextView = convertView.findViewById(R.id.description_text_view);
        descriptionTextView.setText(fruit.getDescription());

        return convertView;
    }
}
