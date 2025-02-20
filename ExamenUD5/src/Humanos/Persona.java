package Humanos;

public abstract class Persona {

    protected String nombre;
    protected int edad;
    protected String dni;
    protected String domicilio;

    public Persona() {
    }

    public Persona(String nombre, int edad, String dni, String domicilio) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.domicilio = domicilio;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", domicilio='" + domicilio + '\'' +
                '}';
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
}
