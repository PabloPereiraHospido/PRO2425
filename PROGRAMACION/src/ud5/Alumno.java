package ud5;


/**
 * @author perhospab
 * @summary ejercicio code
 */

public class Alumno extends Persona {
    private String clase;

    public Alumno() {
    }

    public Alumno(String alumnos) { //method is empty
    }

    @Override
    public int compareTo(Persona o) {
        return 0;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    @Override
    public void trabajar() {
        System.out.println("Soy un estudiante, mi trabajo es estudiar");
    }

    @Override
    public String toString() {
        return "Alumno{"
                +
                "clase='" + clase + '\''
                +
                '}';
    }

    @Override
    public void respirar() {//method is empty

    }

    @Override
    public void comer() { //method is empty

    }


}
