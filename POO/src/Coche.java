public class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche() {
    }

    public Coche(String marca, String modelo, String matricula, double precio, Motor motor, Propietario propietario, int numeroPuertas) {
        super(marca, modelo, matricula, precio, motor, propietario);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
}
