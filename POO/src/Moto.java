public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto() {
    }

    public Moto(String marca, String modelo, String matricula, double precio, Motor motor, Propietario propietario, int cilindrada) {
        super(marca, modelo, matricula, precio, motor, propietario);
        this.cilindrada = cilindrada;
    }


    @Override
    public String mostrarInformacion() {

        return super.mostrarInformacion()+ cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
