package com.example.listapersonas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


class AdaptadorPersonas extends ArrayAdapter<Persona> {

    AppCompatActivity appCompatActivity;
    Integer[]ImgPersonas;
    private ArrayList<Persona> listapersonas;
    AdaptadorPersonas(AppCompatActivity context, Integer[]ImgPersonas,ArrayList<Persona> listapersonas) {
        super(context, R.layout.persona,listapersonas);
        appCompatActivity = context;
        this.ImgPersonas=ImgPersonas;
        this.listapersonas=listapersonas;
    }
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = appCompatActivity.getLayoutInflater();
        View item = inflater.inflate(R.layout.persona, null,true);
        TextView textView1 = item.findViewById(R.id.tvNombre);
        textView1.setText(listapersonas.get(position).getNombres());
        ImageView imageView1 = item.findViewById(R.id.imvFoto);
        imageView1.setImageResource(ImgPersonas[position]);
        return(item);
    }
}