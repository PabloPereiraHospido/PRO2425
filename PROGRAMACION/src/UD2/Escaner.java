package UD2;

import java.util.Scanner;

public class Escaner {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.println("introduce nombre y apellidos y edad : ");
        String nombre = src.next();
        String apellido1 = src.next();
        String apellido2 = src.next();
        int edad = src.nextInt();

        System.out.println("Nombre : " + nombre + " - " +
                " Apellido 1 : " + apellido1 +
                " Apellido 2 : " + apellido2 +
                "edad : " + edad);
        src.close();
    }
}
