package UD5;

public class Profesor extends Persona{
    Integer antiguedad;

    public Profesor(String nombre, String apellido, Integer antiguedad) {
        super(nombre, apellido);
        this.antiguedad = antiguedad;
    }

    public Profesor() {
    }

    public Profesor(String profesor) {
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

    @Override
    public void respirar() {

    }

    @Override
    public void comer() {
        System.out.println(RAZA);
    }
}
