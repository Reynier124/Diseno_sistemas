package Ejemplo_2;

public class Perro extends Animal {
    private String raza;

    public Perro() {
    }

    public Perro(String especie, String categoria, String raza) {
        super(especie, categoria);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void comer() {
        System.out.println("Yo como carne");
    }
}
