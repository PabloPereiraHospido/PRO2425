package Humanos;

public class Autor extends Persona {

    private int numLibros;
    private String libros;

    public Autor() {
    }

    public Autor(String nombre, int edad, String dni, String domicilio, int numLibros, String libros) {
        super(nombre, edad, dni, domicilio);
        this.numLibros = numLibros;
        this.libros = libros;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "libros='" + libros + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", numLibros=" + numLibros +
                '}';
    }

    public int getNumLibros() {
        return numLibros;
    }

    public void setNumLibros(int numLibros) {
        this.numLibros = numLibros;
    }

    public String getLibros() {
        return libros;
    }

    public void setLibros(String libros) {
        this.libros = libros;
    }
}
