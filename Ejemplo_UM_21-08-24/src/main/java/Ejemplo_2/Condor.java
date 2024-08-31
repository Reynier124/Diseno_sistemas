package Ejemplo_2;

public class Condor extends Animal implements Aves{

    @Override
    public void comer() {
        System.out.println("Como cadaveres");
    }

    @Override
    public void volar() {
        System.out.println("Soy un condor y vuelo en la montaña");
    }
}
