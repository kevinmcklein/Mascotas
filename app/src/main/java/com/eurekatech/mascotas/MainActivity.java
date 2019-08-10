package com.eurekatech.mascotas;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
EditText id,nameDueno,edad,peso,nameMascota;

private String nDueno,nMascota, idmasc,edadmasc, pesomasc;
mascotas masc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id=findViewById(R.id.txtidmasc);
        nameDueno=findViewById(R.id.txtdueno);
        edad=findViewById(R.id.txtmascEdad);
        peso=findViewById(R.id.txtpesomasc);
        nameMascota=findViewById(R.id.txtnommascota);

        pasalistado.miarreglo=new ArrayList<>();

    }

    public  void agregar(View v){

        nDueno=nameDueno.getText().toString();
        nMascota=nameMascota.getText().toString();
        idmasc=id.getText().toString();
        edadmasc=edad.getText().toString();
        pesomasc=peso.getText().toString();

            if(verificardatos()){
        masc=new mascotas(idmasc, edadmasc,nMascota,nDueno,pesomasc);
        pasalistado.miarreglo.add(masc);
        mensaje("Datos guardados");
        limpiardatos();
        }

    }
public void listado(View v){
    try{


     Intent intent =new Intent(this,listaActivity.class);

    startActivity(intent);}catch (Exception e){mensaje(e.toString());}
}

    private  void mensaje(String mens){
        Toast me=Toast.makeText(this,mens,Toast.LENGTH_LONG);
        me.show();
    }

    boolean verificardatos(){
       boolean valido=false;
       try{
        if(nDueno.isEmpty()||nMascota.isEmpty()||idmasc.isEmpty()||edadmasc.isEmpty()||pesomasc.isEmpty()){
            mensaje("No puede haber datos en blanco");

            valido=false;
        } else{valido=true;}}catch (Exception e){mensaje(e.toString());}

        return valido;




    }

    void limpiardatos(){
        id.setText("");
        nameDueno.setText("");
        edad.setText("");
        peso.setText("");
        nameMascota.setText("");
    }
}
