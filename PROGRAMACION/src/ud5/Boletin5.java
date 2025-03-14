package ud5;

import ud5.capaNegocio.Articulo;
import ud5.capaNegocio.Cliente;
import ud5.capaNegocio.Factura;

import java.util.Scanner;

public class Boletin5 {
    public static void main(String[] args) {
        System.out.println("Introduce el número de ejercicio:");
        Scanner src = new Scanner(System.in);
        int ejercicios = src.nextInt();
        switch (ejercicios) {
            case 1:
                Cliente mario = new Cliente();
                Articulo nintendoSwitch=new Articulo();
                Factura factura = new Factura("nintendo switch",235);

                mario.setNombre("Mario");
                nintendoSwitch.setPrecio(235);
                nintendoSwitch.getPrecio();
                factura.setDescripcion("dia 17/01/2025");
                break;
            default:
                System.out.println("estoy hasta los cojones del sonarQube");
                break;
        }
    }
}
