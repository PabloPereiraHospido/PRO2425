package UD3;

import java.time.YearMonth;
import java.util.Scanner;
import java.lang.Exception;

public class Boletin3 {

    private static int ejercicio1(int mes, int anho) {
        try {
            YearMonth y = YearMonth.of(anho, mes);
            int dias = y.lengthOfMonth();
            return dias;
        } catch (Exception e) {
            System.out.println("Error: Mes o año invalido ");
        }
        return 0;
    }

    private static void determinarTipoTriangulo(Scanner src) {

        System.out.print("Introduce la longitud del primer lado: ");
        double lado1 = src.nextDouble();

        System.out.print("Introduce la longitud del segundo lado: ");
        double lado2 = src.nextDouble();

        System.out.print("Introduce la longitud del tercer lado: ");
        double lado3 = src.nextDouble();
        try {
            if ((lado1 + lado2 > lado3) &&
                    (lado1 + lado3 > lado2) &&
                    (lado2 + lado3 > lado1)) {

                if (lado1 == lado2 && lado2 == lado3) {
                    System.out.println("El triángulo es equilátero.");
                } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                    System.out.println("El triángulo es isósceles.");
                } else {
                    System.out.println("El triángulo es escaleno.");
                }
            } else {
                System.out.println("Las longitudes no forman un triángulo.");
            }
        } catch (Exception e) {
            System.out.println("Error: Longitud de lado invalida ");
        }
    }
    public static void main(String[] args) {

        System.out.println("Introduce el número de ejercicio:");
        Scanner src = new Scanner(System.in);
        int ejercicios = src.nextInt();
        switch (ejercicios) {
            case 1:
                System.out.println("Introduce el mes en formato numérico:");
                int mes = src.nextInt();
                System.out.println("Introduce el año:");
                int anho = src.nextInt();
                int dias = ejercicio1(mes, anho);
                System.out.println("El mes " + mes + " del año " + anho + " tiene " + dias + " días.");
                break;
            case 2:

                try {
                    System.out.print("Introduce una fecha en formato dd/mm/aaaa: ");
                    Scanner in = new Scanner(System.in);
                    String fecha = in.nextLine();
                    String[] partes = fecha.split("/");
                    int dia = Integer.parseInt(partes[0]);
                    int mes1 = Integer.parseInt(partes[1]);
                    int anho1 = Integer.parseInt(partes[2]);
                    int diasEnMes = ejercicio1(mes1, anho1);

                    if (diasEnMes > 0 && dia >= 1 && dia <= diasEnMes) {
                        System.out.println("La fecha es válida.");
                    } else {
                        System.out.println("La fecha es inválida.");
                    }
                } catch (Exception e) {
                    System.out.println("Formato de fecha incorrecto.");
                }
                break;
            case 3:
                determinarTipoTriangulo(src);
                break;
            default:
                System.out.println("El número de ejercicio es incorrecto.");
                break;
        }
    }
}

