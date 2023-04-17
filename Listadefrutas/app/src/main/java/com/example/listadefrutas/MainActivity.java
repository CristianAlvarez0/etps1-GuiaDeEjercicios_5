package com.example.listadefrutas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

     ListView listView;
     ArrayList<Fruit> fruits;
     FruitAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);

        fruits = new ArrayList<>();
        fruits.add(new Fruit("Manzana", "La manzana es una fruta dulce y crujiente que viene en varios colores.", R.drawable.apple));
        fruits.add(new Fruit("Plátano", "El plátano es una fruta dulce y suave con una piel amarilla.", R.drawable.banana));
        fruits.add(new Fruit("Cereza", "La cereza es una fruta pequeña y roja con un sabor dulce y ácido.", R.drawable.cherry));
        fruits.add(new Fruit("Uva", "La uva es una fruta pequeña y dulce que crece en racimos.", R.drawable.grape));
        fruits.add(new Fruit("Kiwi", "El kiwi es una fruta pequeña y marrón con una pulpa verde y ácida.", R.drawable.kiwi));
        fruits.add(new Fruit("Limón", "El limón es una fruta cítrica con un sabor ácido y refrescante.", R.drawable.lemon));
        fruits.add(new Fruit("Mango", "El mango es una fruta tropical con una piel verde y pulpa amarilla y dulce.", R.drawable.mango));
        fruits.add(new Fruit("Naranja", "La naranja es una fruta cítrica dulce y jugosa con una piel naranja.", R.drawable.orange));
        fruits.add(new Fruit("Papaya", "La papaya es una fruta tropical dulce y suave con una piel naranja y pulpa rosa.", R.drawable.papaya));
        fruits.add(new Fruit("Pera", "La pera es una fruta dulce y jugosa con una piel marrón y pulpa blanca.", R.drawable.pear));
        fruits.add(new Fruit("Piña", "La piña es una fruta tropical dulce y jugosa con una piel dura y escamosa.", R.drawable.pineapple));
        fruits.add(new Fruit("Frambuesa", "La frambuesa es una fruta pequeña y roja con un sabor dulce y ácido.", R.drawable.raspberry));
        fruits.add(new Fruit("Fresa", "La fresa es una fruta pequeña y roja con un sabor dulce y jugoso.", R.drawable.strawberry));
        fruits.add(new Fruit("Sandía", "La sandía es una fruta grande y jugosa con una piel verde y pulpa roja.", R.drawable.watermelon));
        fruits.add(new Fruit("Sandía", "La sandía es una fruta grande y jugosa con una piel verde y pulpa roja.", R.drawable.guava));
        fruits.add(new Fruit("Sandía", "La sandía es una fruta grande y jugosa con una piel verde y pulpa roja.", R.drawable.oursop));
        fruits.add(new Fruit("Sandía", "La sandía es una fruta grande y jugosa con una piel verde y pulpa roja.", R.drawable.tangerines));
        fruits.add(new Fruit("Sandía", "La sandía es una fruta grande y jugosa con una piel verde y pulpa roja.", R.drawable.inkgrapefruit));
        fruits.add(new Fruit("Sandía", "La sandía es una fruta grande y jugosa con una piel verde y pulpa roja.", R.drawable.assionfruit));
        fruits.add(new Fruit("Sandía", "La sandía es una fruta grande y jugosa con una piel verde y pulpa roja.", R.drawable.guacate));
        fruits.add(new Fruit("Sandía", "La sandía es una fruta grande y jugosa con una piel verde y pulpa roja.", R.drawable.urian));
        fruits.add(new Fruit("Sandía", "La sandía es una fruta grande y jugosa con una piel verde y pulpa roja.", R.drawable.renade));
        fruits.add(new Fruit("Sandía", "La sandía es una fruta grande y jugosa con una piel verde y pulpa roja.", R.drawable.rapefruit));
        fruits.add(new Fruit("Sandía", "La sandía es una fruta grande y jugosa con una piel verde y pulpa roja.", R.drawable.cannon));
        fruits.add(new Fruit("Sandía", "La sandía es una fruta grande y jugosa con una piel verde y pulpa roja.", R.drawable.oco));


        adapter = new FruitAdapter(this, fruits);
        listView.setAdapter(adapter);
    }
}

