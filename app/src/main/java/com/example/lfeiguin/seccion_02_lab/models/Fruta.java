package com.example.lfeiguin.seccion_02_lab.models;

/**
 * Created by Leila Feiguin on 7/26/2018.
 */

public class Fruta {
    private String nombre;
    private int icono;
    private String ciudad;

    public Fruta() {}

    public Fruta(String nombre, int icono, String ciudad) {
        this.nombre = nombre;
        this.icono = icono;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIcono() {
        return icono;
    }

    public void setIcono(int icono) {
        this.icono = icono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String origin) {
        this.ciudad = ciudad;
    }
}
