package Ejemplo_dependencias;

public class Main {
    public static void main(String[] args){
        Curso c1 = new Curso("Estadistica");
        Profesor p1 = new Profesor("Ruben");
        p1.ensenar(c1);
    }
}
