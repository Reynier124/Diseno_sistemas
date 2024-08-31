import Ejemplo_Persona.Domicilio;
import Ejemplo_Persona.Persona;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Persona p1=new Persona("Pepito", "mem1"); /*En la memoria estatica se guarda el codigo y la dinamica van a estar los objetos*/
        System.out.println("Soy "+p1.getNombre()+"y tengo cerebro con membrana "+ p1.getTiene().getMembrana()); /*Esto es una concatenación*/
        p1.caminar();
        Domicilio d1 = new Domicilio("Aristides Villanueva",212);
        p1.setVive(d1);
        System.out.println("Vivo en "+p1.getVive().getCalle()+" "+p1.getVive().getNumero());
    }
}
