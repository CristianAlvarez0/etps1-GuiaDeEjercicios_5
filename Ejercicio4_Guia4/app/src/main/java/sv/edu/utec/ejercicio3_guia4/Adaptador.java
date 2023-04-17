package sv.edu.utec.ejercicio3_guia4;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adaptador extends ArrayAdapter<String>{
    Activity contexto;
    String []persona;
    String []edad;
    String []direccion;
    Integer []ImgPersonas;
    ImageView imgCara;
    TextView tvNombre;

    TextView tvEdad;
    TextView tvDireccion;

    public Adaptador(Activity contexto,String []persona,String []edad, String []direccion, Integer []ImgPersonas){
        super(contexto, R.layout.personas,persona);
        this.contexto=contexto;
        this.persona=persona;
        this.edad=edad;
        this.direccion=direccion;
        this.ImgPersonas=ImgPersonas;

    }
    public View getView(int posicion, View v, ViewGroup parent){
        LayoutInflater inflater = contexto.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.personas, null, true);
        tvNombre=rowView.findViewById(R.id.tvNombre);
        tvEdad=rowView.findViewById(R.id.tvEdad);
        imgCara=rowView.findViewById(R.id.imgPersonas);
        tvDireccion=rowView.findViewById(R.id.tvDireccion);

        tvNombre.setText(persona[posicion]);
        tvEdad.setText(edad[posicion]);
        imgCara.setImageResource(ImgPersonas[posicion]);
        tvDireccion.setText(direccion[posicion]);
        return rowView;
    }
}
