package com.idat.farmacias.models;

import java.io.Serializable;

public class Medicamento implements Serializable {
    public String nombre;
    public String descripcion;
    public int image;

    public Medicamento(String nombre, String descripcion, int image) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.image = image;
    }
}
