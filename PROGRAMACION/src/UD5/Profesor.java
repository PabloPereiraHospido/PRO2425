package UD5;

public class Profesor extends Persona{
    Integer antiguedad;

    public Profesor(String nombre, String apellido, Integer antiguedad) {
        super(nombre, apellido);
        this.antiguedad = antiguedad;
    }

    public Profesor() {
    }
    @Override
    public void trabajar(){
        System.out.println("Soy un profesor, mi tabajo es enseñar");
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "antiguedad=" + antiguedad +
                '}';
    }
}
