import java.util.List;

public class Concesionario {

    Empleado empleado;
    private String nombre;
    private String direccion;
    Empleado gerente;

    public Concesionario() {
    }

    public Concesionario(Empleado empleado, String nombre, String direccion, Empleado gerente) {
        this.empleado = empleado;
        this.nombre = nombre;
        this.direccion = direccion;
        this.gerente = gerente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Empleado getGerente() {
        return gerente;
    }

    public void setGerente(Empleado gerente) {
        this.gerente = gerente;
    }

    public String mostrarInformacion() {
        return "Concesionario{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", gerente='" + gerente + '\'' +
                '}';
    }
}
