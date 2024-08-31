package Ejemplo_2;

public abstract class Animal {
    private String especie;
    private String categoria;

    public Animal() {
    }

    public Animal(String especie, String categoria) {
        this.especie = especie;
        this.categoria = categoria;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public abstract void comer();
}
