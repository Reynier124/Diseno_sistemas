package Dependencia_Creacion;

public class Auto {
    private Motor motor;

    public Auto() {
    }

    public Auto(Motor motor) {
        this.motor = motor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
