package UD5;

public class Alumno extends Persona {
    private String clase;

    public Alumno() {
    }

    public Alumno(String alumnos) {
    }


    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
    @Override
    public void trabajar(){
        System.out.println("Soy un estudiante, mi trabajo es estudiar");
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "clase='" + clase + '\'' +
                '}';
    }

    @Override
    public void respirar() {

    }

    @Override
    public void comer() {

    }
}
