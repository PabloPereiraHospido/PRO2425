package UD1;

import java.security.spec.RSAOtherPrimeInfo;

public class Teoria1 {
    public static void main(String args[]) {

        // buenos dias,son las 19:49 del dia 19 septiembre
        //viernes 20 de septiembre
        //definir variable
        int numero;
        //inicializar variable
        numero = 1;
        numero = 2;
        numero = numero * 2;

        System.out.println(numero);
//declaracion e inicializacion de variables
        byte importe;//declaracion de byte
        importe = 100;  // asignacion de valor
        double doble;
        doble = 2;
        short corto;
        corto = 3;
        int entero;
        entero = 4;
        long largo;
        largo = 5;
        float flotante;
        flotante = 6;
        char caracter;
        caracter = 7;
        boolean logico;
        logico = true;

        //dia 23 de septiembre
        System.out.println("Hola Mundo\n");
        System.out.println("\tivan me dijo \"ya pensaba que llegaba tade\"");

        //dia 25 de septiembre

        int i = 0;

        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        System.out.println(i--);
        System.out.println(i);
        System.out.println(--i);

        i = 10;
        i += 1;
        System.out.println(i);

        System.out.println(true);
        System.out.println(false);
        System.out.println(true && false);
        System.out.println(true || false);

        //jueves 26 de septiembre

        int ii = 100;
        long ll = ii;
        float ff = ll;
        System.out.println("valor de int" + ii);
        System.out.println("valor de long" + ll);
        System.out.println("vaLor de float" + ff);

        //Cadenas
        System.out.println("vaLor de float" + ff+ "y el valor de long es" +ll);

        int num1=5;
        int num2=7;
        System.out.println("la suma de"+num1+num2);
        System.out.println("la suma de"+(num1+num2));
        System.out.println(num1+num2+ "la suma de");

        int aa=50;
        byte bb=(byte) aa;  // casting se pone entre parentesis la el tipo al que lo queremos pasar

        double ddd=100.04;
                long lll= (long)ddd;
                int iii= (int) lll;

        System.out.println("valor double"+ ddd);
        System.out.println("valor long" + lll);
        System.out.println("valor int"+ iii);


    }
}

