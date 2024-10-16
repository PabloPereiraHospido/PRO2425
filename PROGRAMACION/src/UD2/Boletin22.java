package UD2;

import java.util.Scanner;

public class Boletin22 {
    public static void main(String[] ars) {
        //ejercicio 1 y 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce un valor entre 0 y 10 (valores)");
        int valores = scanner.nextInt();
        if (valores <= 4) {

            System.out.println("nota correcta,es un suspenso");
        } else {
            if (valores >= 5) {
                System.out.println("nota correcta, estas aprobado");
            } else {
                if (valores >= 11) {
                    System.out.println("el valor introducido no es correcto");
                }
            }
        }
//ejercicio 3

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("introduce un numero");
        int entero = scanner2.nextInt();

        switch (entero) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                System.out.println("es impar");
                break;
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
                System.out.println("Es par");
                break;
            default:
                System.out.println(0);
                break;
        }
        //ejercicio 4
        Scanner scanner3 = new Scanner(System.in);

        // Solicitar la cantidad de unidades compradas
        System.out.print("Ingrese la cantidad de unidades compradas: ");
        int cantidad = scanner3.nextInt();

        // Solicitar el precio del artículo (puede tener decimales)
        System.out.print("Ingrese el precio por unidad del artículo: ");
        double precioUnitario = scanner.nextDouble();

        // Definir el descuento
        double descuento = 0.0;

        // Aplicar el descuento basado en la cantidad
        if (cantidad > 100) {
            descuento = 0.40;
        } else if (cantidad >= 25 && cantidad <= 100) {
            descuento = 0.20;
        } else if (cantidad >= 10 && cantidad <= 24) {
            descuento = 0.10;
        } else {
            descuento = 0.0;
        }

        // Calcular el importe total sin descuento
        double importeTotal = cantidad * precioUnitario;

        // Calcular el descuento total
        double montoDescuento = importeTotal * descuento;

        // Calcular el importe final después de aplicar el descuento
        double importeFinal = importeTotal - montoDescuento;

        // Mostrar el descuento aplicado y el importe final
        System.out.println("El descuento aplicado es: " + (descuento * 100) + "%");
        System.out.println("El importe total sin descuento es: $" + importeTotal);
        System.out.println("El monto del descuento es: $" + montoDescuento);
        System.out.println("El importe final a pagar es: $" + importeFinal);

        //ejercicio 5


    }
}
