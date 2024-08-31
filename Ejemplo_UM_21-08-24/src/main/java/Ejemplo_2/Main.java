package Ejemplo_2;
//polimorfismo es cuando se hereda algo pero se utiliza de forma distinta (Mejorar defición)
public class Main {
    public static void main(String[] args){
        Animal p1 = new Perro("Perro", "Mamifero", "Golden");
        Perro p2 = new Perro("Perro", "Mamifero", "Doberman");
        Oso o1 = new Oso("Panda", "Mamifero", "Bambu");
        System.out.println("Soy un "+p2.getEspecie()+" y");
        p2.comer();
        System.out.println("Soy un "+o1.getEspecie()+ " y");
        o1.comer();
        Condor c1 = new Condor();
        c1.volar();
        c1.comer();
    }

}
