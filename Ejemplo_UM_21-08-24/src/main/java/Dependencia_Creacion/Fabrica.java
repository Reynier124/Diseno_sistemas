package Dependencia_Creacion;

public class Fabrica {
    private Motor motor;
    private Auto auto;

    public Auto fabricarAuto(Motor motor){
        Auto a = new Auto(motor);
        System.out.println("Se fabrico el auto con motor " + motor.getTipo());
        return a;}
}
