package sv.edu.utec.ejercicio3_guia4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String [] personas={"Maria Perez","Juan Castillo","Lucia Hernandez","Luis Castro", "Karen Renderos"};
    String [] edad={"Edad: 25","Edad: 24", "Edad: 26", "Edad: 25","Edad: 23"};
    String [] direccion={"Apopa","San Marcos", "Soyapango", "Mejicanos", "Ilopango"};
    ListView lvstPersonas;
    Integer []ImgPers= {
            R.drawable.maria,
            R.drawable.juan,
            R.drawable.lucia,
            R.drawable.luis,
            R.drawable.karen,

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Adaptador adaptador = new Adaptador(this,personas, edad, direccion,ImgPers);
        lvstPersonas = findViewById(R.id.lstListaPersonas);
        lvstPersonas.setAdapter(adaptador);
    }
}