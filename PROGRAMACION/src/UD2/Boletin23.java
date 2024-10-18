package UD2;

import java.util.Scanner;

public class Boletin23 {
    public static void main(String[] args) {

        //ejercicio 1
        int suma = 0;

        for (int n = 1; n <= 100; n++) {
            suma += n;
        }
        System.out.println("La suma de los números del 1 al 100 es: " + suma);

        //ejercicio 2

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

        //ejercicio 3

    }
}
