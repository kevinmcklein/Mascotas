package com.eurekatech.mascotas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
String usuario,contrasena;
EditText usu,cont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usu=findViewById(R.id.txtUsuario);
        cont=findViewById(R.id.contrasena);
    }


    public void Entrar(View v){
        usuario=usu.getText().toString();contrasena=cont.getText().toString();
        if(usuario.toLowerCase().equals("admin")&& contrasena.equals("123")){
            Llamaprincipa();
        }else{
        Toast m=    Toast.makeText(this,"Usuario y/o contraseña incorrecta",Toast.LENGTH_SHORT);
        m.setGravity(Gravity.CENTER,0,0);
        m.show();
        }
    }


    private void Llamaprincipa(){

        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public  void salir(View v){
        finish();
    }
}
