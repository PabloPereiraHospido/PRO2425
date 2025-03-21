package RefuerzoUD2;

import java.util.Scanner;

/**
 * @author pabloPereira
 */

public class EjerciciosRefuerzo {

    /**
     *
     * @param args
     */

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
            case 1, 2:
                System.out.println("se retiene el 20% del salario");
                break;
            case 3,4,5:
                System.out.println("se retiene el 15% del salario");
                break;
            case 6,7:
                System.out.println("se retiene el 10% del salario");
                break;
            case 8,9:
                System.out.println("se retieene el 5% del salario");
                break;
            case 10:
                System.out.println("no se retiene el salario");
                break;
            default:
                System.out.println("el sonar este quiere que me sucide");
        }
        Scanner b = new Scanner(System.in);

        System.out.println("¿De que numero quiere calcular la potencia? ");
        int a = b.nextInt();
        System.out.println("Indique la potencia mas alta a la que deseas elevar ");
        int c = sc.nextInt();
        int resultado = 1;
        for (int i = 1; i <= c; i++) {
            resultado *= a;
            System.out.println(a + " elevado a " + i + " es igual a " + resultado);
        }
        int nunerador = 5;
        int denominador = 2;
        int cociente = 0;
        int resto;
        for (int i = nunerador; i >= denominador; i -= denominador) {
            cociente += 1;

        }
        resto = nunerador;
        System.out.println("cociente " + denominador);

    }
}
