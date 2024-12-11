package UD3;

import java.awt.*;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Teoria3 {

    private static void imprimirTablaMultiplicar(int valor) {
        System.out.println("Tabla de multiplicar del " + valor);
        for (int i = 1; i <= 10; i++) {
            System.out.println(valor + " * " + i + "= " + i * valor);
        }
    }

    private static int sumar(int numero1, int numero2) {

        return numero1 + numero2;
    }

    private static double hacerMedia(int numero1, int numero2) {
        return (double) (numero1 + numero2) / 2;
    }

    private static void imprimirPresentacion() {
        System.out.println("Pablo,edad 24,Lugo");

    }

    private static void imprimirPresentacion(String nombre, int edad, String Lugar) {
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(Lugar);
    }

    private static void presentar(int edad, String nombre) {

        System.out.println(nombre + "tiene" + edad + "años");
    }

    private static void presentar() {
        System.out.println("hola");
    }

    private static void presentar(String nombre, int edad) {
        System.out.println(nombre + "tiene" + edad + "años");
    }

    public class EjemploAmbitos {
        private int a = 0;

        private void metodo() {
            int b = 10;
            for (int i = 0; i < b; i++) {
                System.out.println(i * b);
            }
            metodo2(b);
        }
    }

    private static void metodo2(int b) {
        int resultado = 2 * b;
    }

    public static int factorial(int n) {
        if (n <= 01) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }

    public static void main(String[] args) {
        for (int valor = 1; valor <= 2; valor++)
            // imprimirTablaMultiplicar(valor);
            System.out.println(sumar(10, 10));
        System.out.println(hacerMedia(9, 8));
        imprimirPresentacion();
        imprimirPresentacion("Pablo", 24, "Lugo");
        int a = 10;
        String b = "Victor";
        presentar(a, b);
        presentar();
        presentar(b, a);
        System.out.println(factorial(5));
        int valor = Math.abs(10);
        Point puntoOrigen = new Point(5, 10);
        int ejeX = puntoOrigen.x;
        double longitud = Math.PI;
        Random aleatorio = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println(aleatorio.nextInt());
        }
        Random aleatorio1 = new Random(123);
        Random aleatorio2 = new Random(123);

        for (int i = 0; i < 5; i++) {

            System.out.println(aleatorio1.nextInt() + "t" + aleatorio2.nextInt());
        }
        String cadena1 = "programación";
        String cadena2 = "programación";

        if (cadena1 == cadena2) {
            System.out.println("son iguales");
        } else {
            System.out.println("son diferentes");
        }

        String cadena3 = new String("programación");
        String cadena4 = new String("ProgramacióN");
        if (cadena3 == cadena4) {
            System.out.println("son iguales");
        } else {
            System.out.println("son diferentes");
        }

        if (cadena3.equalsIgnoreCase(cadena4)) {
            System.out.println("son iguales");
        } else {
            System.out.println("son diferentes");
        }
        String resultado = "           hola" + "profe";
        System.out.println(resultado.trim());

        Integer i = 5;
        int aa = Integer.parseInt("5");

        Boolean b1 = new Boolean(false);
        Boolean c = new Boolean("trUe");
        Boolean d = new Boolean("Non");

        String s = "5";
        int i1 = Integer.parseInt(s);

        Integer j = new Integer(5);
        s = j.toString();

        float f = j.floatValue();


      /*  Boolean estado=null;
        boolean estado2=null;

        Integer entero=null;
        int entero2=null;

       Scanner src=new Scanner(System.in);
        System.out.println("introduce opcion");
        int entrada;

        if(src.hasNextInt()){
            entrada=src.nextInt();
            src.nextLine();
        }else{
            System.out.println("introduce un numero");
        }
        entrada=src.nextInt();
        //llamariamos al ejercicio correspondiente
        BigInteger n=new BigInteger("1");
        BigInteger m=new BigInteger.ONE

                DecimalFormat df=new DecimalFormat(".##")
                        System.out.println(df.format(3.14159265));*/
        System.out.println("fecha actual" + LocalDate.now());
        System.out.println("Hora actual" + LocalTime.now());
        System.out.println("fecha y hora actual" + LocalDateTime.now());
        System.out.println("el instante actual es"+ Instant.now());
        System.out.println("en zona horaria"+ ZonedDateTime.now());

        LocalDate fecha=LocalDate.now();
        Month mes=fecha.getMonth();
        System.out.println(fecha.getMonth());
        System.out.println(fecha.getDayOfMonth());
        String nombreMes=mes.getDisplayName(TextStyle.FULL, Locale.forLanguageTag("es-ES"));
    }
}

