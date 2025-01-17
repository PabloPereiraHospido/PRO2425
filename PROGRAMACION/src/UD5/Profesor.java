package UD5;

public class Profesor extends Persona{
    Integer antiguedad;

    public Profesor(String nombre, String apellido, Integer antiguedad) {
        super(nombre, apellido);
        this.antiguedad = antiguedad;
    }

    public Profesor() {
    }
}
