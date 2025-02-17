public class Main {
    public static void main(String[] args) {

        Coche leon = new Coche();
        leon.setNumeroPuertas(5);
        leon.setMarca("Seat");
        leon.setModelo("Leon");
        leon.setPrecio(10.000);
        leon.setMotor(new Motor(110, "gasolina"));

        System.out.println(leon.mostrarInformacion());

        Propietario nabil = new Propietario("nabil", "12345678", "12345");

        leon.setPropietario(nabil);
        Vehiculo vehiculo = new Moto();

    }
}