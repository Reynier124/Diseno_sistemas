package org.example;

import java.util.ArrayList;

public class Libreria {
    private String nombre;
    //Ejemplo con array estatico
    //private Libro libros = new Libro[3];
    private ArrayList<Libro> libros = new ArrayList<>();

    public Libreria() {
    }

    public Libreria(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //getter and setter de un array estatico
    /*public Libro getLibros(int i) {
        return libro[i];
    }

    public void setLibros(int i, Libro libro) {
        this.libros[i] = libros;
    }*/

    public Libro getLibros(int i) {
        return libros.get(i);
    }

    public void setLibros(Libro libro) {
        this.libros.add(libro);
    }
}

