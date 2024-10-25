package UD2;

import java.util.Scanner;

public class Teoria2 {
    public static void main(String[] ars) {
        boolean verdadero = true;
        boolean falso = false;
        System.out.println(true);
        System.out.println(false);
        System.out.println(true && false);
        System.out.println(true || false);

        //miercoles 9 de octubre
        System.out.println("buenas");
        int edad = 20;
        if (edad >= 18) {
            System.out.println("puede beber");
        }
        System.out.println("adios");
        int numero = 10;
        if (numero % 2 == 0) {
            System.out.println("numero par");
        } else {
            System.out.println("numero impar");
        }
        byte edad2 = 15;
        if (edad2 >= 18) {
            System.out.println("es mayor de edad, su edad es " + edad2);

        } else {
            System.out.println("es menor de edad, su edad es " + edad2);
        }
        //dia 10 de octubre
        int edad3 = 24;
        if (edad3 <= 17) {
            if (edad3 < 3)
                System.out.println("bebe");
        } else {
            if (edad3 >= 3 && edad3 <= 11) {
                System.out.println("va a primaria");
            } else {
                if (edad3 >= 11 && edad3 <= 17) {
                    System.out.println("va a secundaria");
                } else {
                    if (edad3 >= 17 && edad3 <= 35) {
                        System.out.println("es joven");
                    } else {
                        if (edad3 >= 35 && edad3 <= 66) {
                            System.out.println("es adulto");
                        } else {
                            if (edad3 >= 66 && edad3 <= 99) {
                                System.out.println("es anciano");
                            }
                        }
                    }
                }
            }
        }
        //practica del dia 16 de octubre
        int dia = 1;
        if (dia == 1) {
            System.out.println("Lunes");

        } else if (dia == 2) {
            System.out.println("Martes");

        } else if (dia == 3) {
            System.out.println("Miercoles");


        } else if (dia == 4) {
            System.out.println("Jueves");

        } else if (dia == 5) {
            System.out.println("Viernes");


        } else if (dia >= 6) {
            System.out.println("Fin de semana");
        }


        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            default:
                System.out.println("Fin de semana");
                break;
        }
        int valor = 2;
        switch (valor) {
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
                System.out.println("Es par");
                break;
            default:
                System.out.println("Es impar");
                break;


        }
        //dia 24 de octubre
        for (int i = 0; i < 10; i++) {
            System.out.println("El numero es: " + i);
        }
       /* for (int i = 0; i < 10; i--) {
            System.out.println("El numero es: " + i);
        }*/
        Scanner in = new Scanner(System.in);
        System.out.print("Número de iteraciones: ");
        int iteracion = in.nextInt();
        for (; iteracion > 0; iteracion--) {

        }
        Scanner in1 = new Scanner(System.in);
        System.out.print("Número de iteraciones: ");
        int iteración;
        for (iteracion = in1.nextInt(); iteracion > 0; iteracion--) {

        }
        int a = 5;
        while (a < 10) {
            System.out.println("Prueba");

        }
    }


}



