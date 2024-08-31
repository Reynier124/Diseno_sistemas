package Ejemplo_dependencias;

public class Profesor {
    private String nombre_profesor;

    public Profesor() {
    }

    public Profesor(String nombre_profesor) {
        this.nombre_profesor = nombre_profesor;
    }

    public String getNombre() {
        return nombre_profesor;
    }

    public void setNombre(String nombre) {
        this.nombre_profesor = nombre;
    }
    //Implica relación de uso
    public void ensenar(Curso curso){
        System.out.println("El profesor "+ nombre_profesor + " enseña en el curso: "+ curso.getNombre());
    }
}
