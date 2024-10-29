package UD2;

import java.util.Scanner;

public class Boletin23 {
    public static void main(String[] args) {
        System.out.println("introduce numero de ejercicio : ");
        Scanner in = new Scanner(System.in);
        int ejercicio = in.nextInt();
        switch (ejercicio) {

            case 1:
                int suma = 0;

                for (int n = 1; n <= 100; n++) {
                    suma += n;
                }
                System.out.println("La suma de los números del 1 al 100 es: " + suma);
                break;
            case 2:

                Scanner scanner = new Scanner(System.in);
                double suma1 = 0;

                for (int i = 1; i <= 5; i++) {
                    System.out.print("Ingrese el número " + i + ": ");
                    double numero = scanner.nextDouble();
                    suma1 += numero;
                }

                double media = suma1 / 5;

                System.out.println("La media de los cinco números es: " + media);

                scanner.close();
                break;
            case 3:
                Scanner scanner3 = new Scanner(System.in);
                System.out.print("¿Cuántos números desea introducir? ");
                int cantidadNumeros = scanner3.nextInt();
                double suma3 = 0;

                for (int i = 1; i <= cantidadNumeros; i++) {
                    System.out.print("Ingrese el número " + i + ": ");
                    double numero = scanner3.nextDouble();
                    suma3 += numero;
                }

                double media3 = suma3 / cantidadNumeros;

                System.out.println("La media de los " + cantidadNumeros + " números es: " + media3);
                break;
            case 4:
                Scanner scanner4 = new Scanner(System.in);
                System.out.print("Ingrese el primer número: ");
                int num1 = scanner4.nextInt();
                System.out.print("Ingrese el segundo número: ");
                int num2 = scanner4.nextInt();
                int sumaPares = 0;

                for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
                    if (i % 2 == 0) {
                        sumaPares += i;
                    }
                }

                System.out.println("La suma de los números pares entre " + num1 + " y " + num2 + " es: " + sumaPares);
                break;

            case 5:
                Scanner scanner5 = new Scanner(System.in);
                System.out.print("Ingrese el número de términos: ");
                int numTerms = scanner5.nextInt();
                double sum = 0.0;

                for (int k = 1; k <= numTerms; k++) {
                    sum += 1.0 / k;
                }

                System.out.println("La suma de los " + numTerms + " términos es: " + sum);
                break;

            case 6:
                Scanner scanner6 = new Scanner(System.in);
                System.out.print("Ingrese el número de términos: ");
                int n = scanner6.nextInt();
                double sumaSerie = 0.0;

                for (int i = 1; i <= n; i++) {
                    sumaSerie += (i * 1.0) / Math.pow(3, i);
                }

                System.out.println("La suma de los " + n + " términos es: " + sumaSerie);
                break;

            case 7:
                Scanner scanner7 = new Scanner(System.in);
                System.out.print("Ingrese el número de términos: ");
                int n7 = scanner7.nextInt();
                double sumaSerie7 = 0.0;

                for (int i = 1; i <= n7; i++) {
                    sumaSerie7 += i / Math.pow(2, i);
                }

                System.out.println("La suma de los " + n7 + " términos es: " + sumaSerie7);
                break;
            case 8:
                Scanner scanner8 = new Scanner(System.in);
                System.out.println("Desde : ");
                System.out.println("Hasta : ");
                int Fahrenheit = scanner8.nextInt();
                int Celsius = 0;
                int Kelvin = 0;
                int Rankine = 0;
                for (int i = 0; i <= Fahrenheit; i++) {
                    Celsius = (Fahrenheit - 32) * 5 / 9;
                    Kelvin = Celsius + 273;
                    Rankine = Fahrenheit + 459;
                    System.out.println("Fahrenheit: " + Fahrenheit + " Celsius: " + Celsius + " Kelvin: " + Kelvin + " Rankine: " + Rankine);
                }
                break;
            case 9:
                Scanner scanner9 = new Scanner(System.in);
                System.out.print("Ingrese un número para calcular su factorial: ");
                int numFactorial = scanner9.nextInt();

                // a) Calcular el factorial de un número dado
                long factorial = 1;
                for (int i = 1; i <= numFactorial; i++) {
                    factorial *= i;
                }
                System.out.println("El factorial de " + numFactorial + " es: " + factorial);

                // b) Calcular el factorial de los primeros 20 números naturales
                System.out.println("Factoriales de los primeros 20 números naturales:");
                for (int i = 0; i <= 20; i++) {
                    long factorial20 = 1;
                    for (int j = 1; j <= i; j++) {
                        factorial20 *= j;
                    }
                    System.out.println(i + "! = " + factorial20);
                }
                break;
            case 10:
                Scanner scanner10 = new Scanner(System.in);
                System.out.print("Ingrese el número de términos: ");
                int n10 = scanner10.nextInt();

                int term = 1;
                for (int i = 1; i <= n10; i++) {
                    System.out.print(term + " ");
                    term *= -2;
                }
                System.out.println();
                break;
            case 11:
                Scanner scanner11 = new Scanner(System.in);
                System.out.print("Ingrese la cantidad de números: ");
                int cantidad = scanner11.nextInt();

                if (cantidad > 0) {
                    double suma11 = 0;
                    double mayor = Double.NEGATIVE_INFINITY;
                    double menor = Double.POSITIVE_INFINITY;

                    for (int i = 1; i <= cantidad; i++) {
                        System.out.print("Ingrese el número " + i + ": ");
                        double numero = scanner11.nextDouble();
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
                break;

            default:
                System.out.println("el numero de ejercicio es incorrecto! ");
                break;


        }
    }
}

