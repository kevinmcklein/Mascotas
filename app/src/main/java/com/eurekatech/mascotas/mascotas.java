package com.eurekatech.mascotas;



public class mascotas {
    private String id, edad;

  private   String nombreMascota,nombreDueno;
 private    String peso;


    public mascotas(String id, String edad, String nombreMascota, String nombreDueno, String peso) {
        this.id = id;
        this.edad = edad;
        this.nombreMascota = nombreMascota;
        this.nombreDueno = nombreDueno;
        this.peso = peso;
    }

    public String getId() {
        return id;
    }

    public String getEdad() {
        return edad;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public String getPeso() {
        return peso;
    }
}



