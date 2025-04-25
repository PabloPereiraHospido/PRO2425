package entesSintientes;

public class Estudiante extends Persona { // herencia debido a que estudiante implementa metodos ya definidos en persona
    private String nombre;
    private String apellido;
    private Integer fechaNacimiento;
    private enum etapaMadurez{infantil,pavo,adulto}
    private String centroEducativo;
    private String casa;




    public Estudiante() {
    }

    public Estudiante(String nombre, String apellidos, String fechaNacimiento, String nombre1, String apellido, Integer fechaNacimiento1, String centroEducativo, String casa) {
        super(nombre, apellidos, fechaNacimiento);
        this.nombre = nombre1;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento1;
        this.centroEducativo = centroEducativo;
        this.casa = casa;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String getFechaNacimiento() {
        return String.valueOf(fechaNacimiento);
    }

    public void setFechaNacimiento(Integer fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCentroEducativo() {
        return centroEducativo;
    }

    public void setCentroEducativo(String centroEducativo) {
        this.centroEducativo = centroEducativo;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    @Override
    public String toString() {
        return "entesSintientes.Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", centroEducativo='" + centroEducativo + '\'' +
                ", casa='" + casa + '\'' +
                '}';
    }
}
