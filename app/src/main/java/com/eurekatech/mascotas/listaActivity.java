package com.eurekatech.mascotas;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;



public class listaActivity extends AppCompatActivity{


ListView milistview;
    ListadoMascota adapatador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        milistview=findViewById(R.id.lvLista);
        try{

        adapatador=new ListadoMascota(this);


       milistview = findViewById(R.id.lvLista);

            LayoutInflater inflater = getLayoutInflater();
            ViewGroup header = (ViewGroup)inflater.inflate(R.layout.header, milistview, false);
            milistview.addHeaderView(header, null, false);

        milistview.setAdapter(adapatador);}catch (Exception e){mensaje(e.toString());
        }
    }

    private  void mensaje(String mens){
        Toast me=Toast.makeText(this,mens,Toast.LENGTH_LONG);
        me.show();
    }

}
