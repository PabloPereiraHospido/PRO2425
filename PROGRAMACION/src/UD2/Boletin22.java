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

    }
}
