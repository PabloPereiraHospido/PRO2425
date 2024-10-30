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


        System.out.print("Ingrese la cantidad de unidades compradas: ");
        int cantidad = scanner3.nextInt();


        System.out.print("Ingrese el precio por unidad del artículo: ");
        double precioUnitario = scanner.nextDouble();


        double descuento = 0.0;


        if (cantidad > 100) {
            descuento = 0.40;
        } else if (cantidad >= 25 && cantidad <= 100) {
            descuento = 0.20;
        } else if (cantidad >= 10 && cantidad <= 24) {
            descuento = 0.10;
        } else {
            descuento = 0.0;
        }  scanner3.close();


        double importeTotal = cantidad * precioUnitario;


        double montoDescuento = importeTotal * descuento;

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
        //ejercicio 10

        Scanner scanner5 = new Scanner(System.in);


        System.out.print("Ingresa un año: ");
        int anio = scanner.nextInt();

        boolean esBisiesto = false;

        if (anio % 4 == 0) {
            if (anio % 100 == 0) {
                if (anio % 400 == 0) {
                    esBisiesto = true; // Múltiplo de 400, es bisiesto
                }
            } else {
                esBisiesto = true; // Múltiplo de 4, pero no de 100, es bisiesto
            }
        }


        if (esBisiesto) {
            System.out.println(ano + " es un año bisiesto.");
        } else {
            System.out.println(ano + " no es un año bisiesto.");
        } Scanner scanner4 = new Scanner(System.in);


        System.out.print("Ingresa un año: ");
        int ano1 = scanner.nextInt();


        boolean esBisiesto1 = false;

        if (ano1 % 4 == 0) {
            if (ano1 % 100 == 0) {
                if (ano1 % 400 == 0) {
                    esBisiesto1 = true; // Múltiplo de 400, es bisiesto
                }
            } else {
                esBisiesto1 = true; // Múltiplo de 4, pero no de 100, es bisiesto
            }
        }

        // Mostrar el resultado
        if (esBisiesto1) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }


        //ejercicio 11

        Scanner scanner6 = new Scanner(System.in);


        System.out.print("Ingresa el primer número: ");
        int num1 = scanner6.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner6.nextInt();
        System.out.print("Ingresa el tercer número: ");
        int num3 = scanner6.nextInt();


        int mayor;
        if (num1 > num2 && num1 > num3) {
            mayor = num1;
        } else if (num2 > num1 && num2 > num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        System.out.println("El mayor número es: " + mayor);

       //ejercicio 12

        Scanner scanner8 = new Scanner(System.in);


        System.out.print("Ingresa la distancia recorrida en km: ");
        double kmRecorridos = scanner8.nextDouble();


        double totalFactura = 30.0;


        if (kmRecorridos <= 300) {

            totalFactura = 30.0;
        } else if (kmRecorridos <= 1000) {

            totalFactura += (kmRecorridos - 300) * 0.20;
        } else {

            totalFactura += (1000 - 300) * 0.20; // Para los primeros 700 km (de 300 a 1000)
            totalFactura += (kmRecorridos - 1000) * 0.15; // Para los km mayores de 1000
        }


        System.out.println("El total de la factura es: " + totalFactura + "€");

        //ejercicio 13

        Scanner scanner9 = new Scanner(System.in);


        System.out.print("Ingresa el número de serie del producto: ");
        int numeroSerie = scanner9.nextInt();


        boolean esDefectuoso = (numeroSerie >= 14681 && numeroSerie <= 15681) ||
                (numeroSerie >= 70001 && numeroSerie <= 79999) ||
                (numeroSerie >= 88888 && numeroSerie <= 111111);


        if (esDefectuoso) {
            System.out.println("El producto con número de serie " + numeroSerie + " es defectuoso.");
        } else {
            System.out.println("El producto con número de serie " + numeroSerie + " NO es defectuoso.");
        }

        //ejercicio 14

        Scanner scanner0 = new Scanner(System.in);


        System.out.print("Ingresa la primera puntuación: ");
        int punt1 = scanner0.nextInt();
        System.out.print("Ingresa la segunda puntuación: ");
        int punt2 = scanner0.nextInt();
        System.out.print("Ingresa la tercera puntuación: ");
        int punt3 = scanner0.nextInt();
        System.out.print("Ingresa la cuarta puntuación: ");
        int punt4 = scanner0.nextInt();


        double media = (punt1 + punt2 + punt3 + punt4) / 4.0;


        char nota;
        if (media >= 90 && media <= 100) {
            nota = 'A';
        } else if (media >= 80 && media <= 89) {
            nota = 'B';
        } else if (media >= 70 && media <= 79) {
            nota = 'C';
        } else if (media >= 60 && media <= 69) {
            nota = 'D';
        } else {
            nota = 'E';
        }


        System.out.println("La media de las puntuaciones es: " + media);
        System.out.println("La nota es: " + nota);

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