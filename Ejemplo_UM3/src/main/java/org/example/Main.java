package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan",16);
        Domicilio domicilio = new Domicilio("Aristides", "godoy_cruz",persona);
        persona.setDomicilio(domicilio);
        System.out.println(domicilio);
    }
}