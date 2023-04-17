package com.example.listapersonas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    private ArrayList<Persona> listapersonas;
    ListView lv1;
    Integer[]ImgPersonas={
            R.drawable.ana,
            R.drawable.carlos,
            R.drawable.fernanda,
            R.drawable.gustavo,
            R.drawable.jose,
            R.drawable.juan,
            R.drawable.karla,
            R.drawable.luis,
            R.drawable.maria,
            R.drawable.marta,
            R.drawable.pedro,
            R.drawable.silvia
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listapersonas=new ArrayList<Persona>();
        listapersonas.add(new Persona("ana",'f'));
        listapersonas.add(new Persona("carlos",'m'));
        listapersonas.add(new Persona("fernanda",'f'));
        listapersonas.add(new Persona("gustavo",'m'));
        listapersonas.add(new Persona("jose",'m'));
        listapersonas.add(new Persona("Juan", 'm'));
        listapersonas.add(new Persona("karla",'f'));
        listapersonas.add(new Persona("luis",'m'));
        listapersonas.add(new Persona("maria",'f'));
        listapersonas.add(new Persona("marta",'f'));
        listapersonas.add(new Persona("pedro",'m'));
        listapersonas.add(new Persona("silvia",'f'));

        AdaptadorPersonas adaptador = new AdaptadorPersonas(this,ImgPersonas,listapersonas);
        lv1 = findViewById(R.id.lsvPersonas);
        lv1.setAdapter(adaptador);
    }

}