package Ejemplo_Persona;

public class Persona {
    private String nombre;
    private Domicilio vive; /* Siempre que sea privado tenemos que hacer un getter and setter*/
    private Domicilio reside;
    private Cerebro tiene;

    public Persona(String nombre, String membrana) {
        this.nombre = nombre;
        this.tiene = new Cerebro(membrana);
    }

    public Persona() { /* Este es un constructor vacio y uno con atributos es un constructor sobrecargado*/
    }

    public String getNombre() { /*Es una funcion porque devuelve un resultado*/
        return nombre;
    }

    public void setNombre(String nombre) { /* Es un procedimiento o mentodo porque no devuelve un resultado*/
        this.nombre = nombre;
    }

    public Domicilio getVive() {
        return vive;
    }

    public void setVive(Domicilio vive) {
        this.vive = vive;
    }

    public void agregarDomicilio(Domicilio d) {
        this.reside = d;
    }

    public Cerebro getTiene() {
        return tiene;
    }

    public void setTiene(Cerebro tiene) {
        this.tiene = tiene;
    }

    public void caminar(){
        System.out.println("Estoy Caminando"); /*Para que aparezca se hizo: sout y luego tab*/
    }
}
