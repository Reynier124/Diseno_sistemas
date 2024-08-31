package Ejemplo_2;

public class Gaviota extends Animal implements Aves {

    @Override
    public void comer() {
        System.out.println("Como peces");
    }

    @Override
    public void volar() {
        System.out.println("Soy una gaviota y vuelo en el mar");
    }
}
