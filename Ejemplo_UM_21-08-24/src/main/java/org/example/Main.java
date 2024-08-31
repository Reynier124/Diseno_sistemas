package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Libro lib1 = new Libro("Harry potter","J.K Rowling");
        Libro lib2 = new Libro("100 de soledad", "Jorge");
        Libro lib3 = new Libro("1984", "George Orwell");
        Libreria libreria1 = new Libreria("Yenny");
        libreria1.setLibros(lib1);
        libreria1.setLibros(lib2);
        libreria1.setLibros(lib3);
        System.out.println("La libreria "+ libreria1.getNombre() + " tiene los libros ");
        for (int i = 0; i < 3; i++) {
            System.out.println(libreria1.getLibros(i).getTitulo());
        }
    }
}