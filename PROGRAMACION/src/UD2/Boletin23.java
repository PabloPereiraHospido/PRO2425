package UD2;

import java.util.Scanner;

public class Boletin23 {
    public static void main(String[] args) {
        System.out.println("introduce numero de ejercicio : ");
        Scanner src = new Scanner(System.in);
        int ejercicio = src.nextInt();
        switch (ejercicio) {

            case 1:
                ejercicio1(src);
                break;
            case 2:
                ejercicio2(src);
                break;
            case 3:
                ejercicio3(src);
                break;
            case 4:
                ejercicio4(src);
                break;

            case 5:
                ejercicio5(src);
                break;

            case 6:
                ejercicio6(src);
                break;

            case 7:
                ejercicio7(src);
                break;
            case 8:
                ejercicio8(src);
                break;
            case 9:
                ejercicio9(src);
                break;
            case 10:
                ejercicio10(src);
                break;
            case 11:
                ejercicio11(src);
                break;
            default:
                System.out.println("el numero de ejercicio es incorrecto! ");
                break;


        }
    }

    private static void ejercicio1(Scanner src) {
        int suma = 0;

        for (int n = 1; n <= 100; n++) {
            suma += n;
        }
        System.out.println("La suma de los números del 1 al 100 es: " + suma);

    }

    private static void ejercicio2(Scanner src) {

        double suma1 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            double numero = src.nextDouble();
            suma1 += numero;
        }

        double media = suma1 / 5;

        System.out.println("La media de los cinco números es: " + media);

        src.close();
    }

    private static void ejercicio3(Scanner src) {

        System.out.print("¿Cuántos números desea introducir? ");
        int cantidadNumeros = src.nextInt();
        double suma3 = 0;

        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            double numero = src.nextDouble();
            suma3 += numero;
        }

        double media3 = suma3 / cantidadNumeros;

        System.out.println("La media de los " + cantidadNumeros + " números es: " + media3);
    }

    private static void ejercicio4(Scanner src) {

        System.out.print("Ingrese el primer número: ");
        int num1 = src.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = src.nextInt();
        int sumaPares = 0;

        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
            if (i % 2 == 0) {
                sumaPares += i;
            }
        }

        System.out.println("La suma de los números pares entre " + num1 + " y " + num2 + " es: " + sumaPares);
    }

    private static void ejercicio5(Scanner src) {

        System.out.print("Ingrese el número de términos: ");
        int numTerms = src.nextInt();
        double sum = 0.0;

        for (int k = 1; k <= numTerms; k++) {
            sum += 1.0 / k;
        }

        System.out.println("La suma de los " + numTerms + " términos es: " + sum);
    }

    private static void ejercicio6(Scanner src) {

        System.out.print("Ingrese el número de términos: ");
        int n = src.nextInt();
        double sumaSerie = 0.0;

        for (int i = 1; i <= n; i++) {
            sumaSerie += (i * 1.0) / Math.pow(3, i);
        }

        System.out.println("La suma de los " + n + " términos es: " + sumaSerie);
    }

    private static void ejercicio7(Scanner src) {

        System.out.print("Ingrese el número de términos: ");
        int n7 = src.nextInt();
        double sumaSerie7 = 0.0;

        for (int i = 1; i <= n7; i++) {
            sumaSerie7 += i / Math.pow(2, i);
        }

        System.out.println("La suma de los " + n7 + " términos es: " + sumaSerie7);
    }

    private static void ejercicio8(Scanner src) {

        System.out.println("Desde : ");
        int fahrenheit = src.nextInt();
        System.out.println("Hasta : ");
        int fahrenheit1 = src.nextInt();
        int celsius = 0;
        int kelvin = 0;
        int rankine = 0;
        if (fahrenheit < fahrenheit1)

            for (int i = fahrenheit; i <= fahrenheit1; i++) {
                celsius = (i - 32) * 5 / 9;
                kelvin = celsius + 273;
                rankine = i + 459;
                System.out.println("i: " + i + " Celsius: " + celsius + " Kelvin: " + kelvin + " Rankine: " + rankine);
            }
        else if (fahrenheit > fahrenheit1) {
            for (int i = fahrenheit1; i <= fahrenheit; i++) {
                celsius = (i - 32) * 5 / 9;
                kelvin = celsius + 273;
                rankine = i + 459;
                System.out.println("i: " + i + " Celsius: " + celsius + " Kelvin: " + kelvin + " Rankine: " + rankine);
            }

        }
    }

    private static void ejercicio9(Scanner src) {

        System.out.print("Ingrese un número para calcular su factorial: ");
        int numFactorial = src.nextInt();

        long factorial = 1;
        for (int i = 1; i <= numFactorial; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + numFactorial + " es: " + factorial);

        System.out.println("Factoriales de los primeros 20 números naturales:");
        for (int i = 0; i <= 20; i++) {
            long factorial20 = 1;
            for (int j = 1; j <= i; j++) {
                factorial20 *= j;
            }
            System.out.println(i + "! = " + factorial20);
        }
    }

    private static void ejercicio10(Scanner src) {

        System.out.print("Ingrese el número de términos: ");
        int n10 = src.nextInt();

        int term = 1;
        for (int i = 1; i <= n10; i++) {
            System.out.print(term + " ");
            term *= -2;
        }
        System.out.println();
    }

    private static void ejercicio11(Scanner src) {

        System.out.print("Ingrese la cantidad de números: ");
        int cantidad = src.nextInt();

        if (cantidad > 0) {
            double suma11 = 0;
            double mayor = Double.NEGATIVE_INFINITY;
            double menor = Double.POSITIVE_INFINITY;

            for (int i = 1; i <= cantidad; i++) {
                System.out.print("Ingrese el número " + i + ": ");
                double numero = src.nextDouble();
                suma11 += numero;
                if (numero > mayor) {
                    mayor = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }

            double media11 = suma11 / cantidad;

            System.out.println("El mayor número es: " + mayor);
            System.out.println("El menor número es: " + menor);
            System.out.println("La media de los números es: " + media11);
        } else {
            System.out.println("La cantidad de números debe ser mayor que 0.");
        }
    }
}

