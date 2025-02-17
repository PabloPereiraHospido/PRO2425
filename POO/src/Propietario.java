public class Propietario extends Persona {

    protected Vehiculo vehiculo;

    public Propietario() {
    }

    public Propietario(String nombre, String dni, String telefono) {
        super(nombre, dni, telefono);
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
