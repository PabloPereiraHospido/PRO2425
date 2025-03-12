package UD5;

import java.util.Comparator;

public class Profesor extends Persona {
    Integer antiguedad;

    public Profesor(String nombre, String apellido, Integer antiguedad) {
        super(nombre, apellido);
        this.antiguedad = antiguedad;
    }

    @Override
    public int compareTo(Persona o) {
        return this.getNombre().compareTo(o.getNombre());
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

