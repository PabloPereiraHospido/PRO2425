/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PaqueteExamenUD2;

import java.util.Scanner;

/**
 *
 * @author perhospab
 */
public class ExamenUD2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenido a examen de la UD2-estructuras de control.Seleccione la opcion deseada: 1-.Multiplicador\t 2-Cuadrado\t 3-Factorial\t 5-Fibonacci\t");
        Scanner in = new Scanner(System.in);
        int ejercicios = in.nextInt();
        switch (ejercicios) {
            case 1:
                System.out.println("introduce los numeros");
                Scanner ejercicio1 = new Scanner(System.in);
                Scanner valor2 = new Scanner(System.in);
                int n = ejercicio1.nextInt();
                int p = valor2.nextInt();
                System.out.println(n * p);

                break;
            case 2:

                break;
            case 3:
                System.out.println("Introduce un numero");
                Scanner factorial = new Scanner(System.in);
                int f = factorial.nextInt();

                break;
            case 4:
                System.out.println("introduce los primeros terminos");
                Scanner ejercicio4 = new Scanner(System.in);
                int Fi = ejercicio4.nextInt();

                break;

            default:
                System.out.println("Error, ejercicio no encontrado");
                System.out.println("Bienvenido a examen de la UD2-estructuras de control.Seleccione la opcion deseada: 1-.Multiplicador\t 2-Cuadrado\t 3-Factorial\t 5-Fibonacci\t");

        }
    }

}
