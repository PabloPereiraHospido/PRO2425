package RefuerzoUD2;

import java.util.Scanner;

public class EjerciciosRefuerzo {

    public static void main(String[] args) {
        //salarioNeto
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el numero de hijos : ");
        int hijos = sc.nextInt();
        double salario = 1000;
        if (hijos <= 2) {
            System.out.println("se retiene el 20% del salario");
        } else if (hijos <= 5) {
            System.out.println("se retiene el 15% del salario");
        } else if (hijos <= 7) {
            System.out.println("se retiene el 10% del salario");
        } else if (hijos <= 9) {
            System.out.println("se retiene el 5% del salario");

        } else {
            System.out.println("no se retiene ningún porcentaje del salario");

        }
        System.out.println("introduce el numero de hijos : ");
        int numHijos = sc.nextInt();
        switch (numHijos) {
            case 1:
            case 2:
                System.out.println("se retiene el 20% del salario");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("se retiene el 15% del salario");
                break;
            case 6:
            case 7:
                System.out.println("se retiene el 10% del salario");
                break;
            case 8:
            case 9:
                System.out.println("se retieene el 5% del salario");
                break;
            case 10:
                System.out.println("no se retiene el salario");
                break;
        }
    }
}
