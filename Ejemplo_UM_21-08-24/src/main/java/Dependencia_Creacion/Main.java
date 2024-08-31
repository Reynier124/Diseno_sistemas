package Dependencia_Creacion;

public class Main {
    public static void main(String[] args){
        Fabrica f1 = new Fabrica();
        Motor m1 = new Motor("V1");
        Auto a1 =f1.fabricarAuto(m1);
    }
}
