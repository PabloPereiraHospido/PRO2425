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
            }  scanner.close();
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
        } scanner2.close();
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
        }  scanner3.close();

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
        int salario;
        salario = 100;

        //ejercicio 8
        int meses;
        meses = 1;
        switch (meses) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("tiene 31 dias");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("tiene 30 dias");
                break;

            case 2:
                System.out.println("tiene 28 dias");
                break;
        }
        //ejercicio 9
        int ano, aa, bb, cc, d, e, f;
        ano = 12;
        aa = 0;
        bb = 1;
        cc = 4;
        d = 6;
        e = 11;
        f = 31;

        if (aa == ano % 19) {

        } else if (bb == ano % 4) {

        } else if (cc == ano % 7) {

        } else if (d == (19 * aa + 24) % 30) {

        } else if (e == (2 * bb + 4 * cc + 6 * d + 5) % 7) {

        } else if (f == (22 + d + e)) {

        }

        //ejercicio 15
        int a, b, c;
        a = 0;
        b = 2;
        c = 1;

        if (a == 0) {

            System.out.println("Solucion = " + ((double) (-c / b)));
        } else {
            double x1, x2;
            int discriminante = b * b - 4 * a * c;
            if (discriminante >= 0) {
                x1 = (-b + Math.sqrt(discriminante) / (2 * a));
                x2 = (-b - Math.sqrt(discriminante) / (2 * a));
            } else {
                double parteReal;
                parteReal = -b / (2 * a);
                x1 = Math.sqrt(discriminante * -1) / 2 * a;
                x2 = x1 * -1;
                System.out.println(parteReal);
                System.out.println(x1);
                System.out.println(x2);
            }

        }
    }
}