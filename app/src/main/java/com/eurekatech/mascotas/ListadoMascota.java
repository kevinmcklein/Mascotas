package com.eurekatech.mascotas;



import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import android.widget.TextView;
import android.widget.Toast;


public class ListadoMascota extends ArrayAdapter<mascotas> {

    AppCompatActivity appCompatActivity;


    ListadoMascota(AppCompatActivity context) {
        super(context, R.layout.layout, pasalistado.miarreglo);
        appCompatActivity = context;

    }


    public View getView(int position, View convertView, ViewGroup parent) {




           LayoutInflater inflater = appCompatActivity.getLayoutInflater();

           View item = inflater.inflate(R.layout.layout, null);
        try {

           TextView id, Nmasc, Peso, Edad, Dueno;
           id = item.findViewById(R.id.txtidmasc);
           id.setText(pasalistado.miarreglo.get(position).getId());

           Nmasc = item.findViewById(R.id.mscNombre);
           Nmasc.setText(pasalistado.miarreglo.get(position).getNombreMascota());

           Peso = item.findViewById(R.id.txtpesomasc);
           Peso.setText(pasalistado.miarreglo.get(position).getPeso());

           Edad = item.findViewById(R.id.txtEdadMascotalay);
           Edad.setText(pasalistado.miarreglo.get(position).getEdad());

           Dueno = item.findViewById(R.id.txtdueno);
           Dueno.setText(pasalistado.miarreglo.get(position).getNombreDueno());
       }catch (Exception e){
           Toast.makeText(appCompatActivity,e.toString(),Toast.LENGTH_LONG).show(); }

        return(item);
    }

}
