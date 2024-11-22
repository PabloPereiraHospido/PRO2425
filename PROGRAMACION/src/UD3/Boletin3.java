package UD3;

import java.time.YearMonth;
import java.util.Scanner;
import java.lang.Exception;

public class Boletin3 {

    public static int ejercicio1(int mes, int anho) {
        try {
            YearMonth y = YearMonth.of(anho, mes);
            int dias = y.lengthOfMonth();
            return dias;
        } catch (Exception e) {
            System.out.println("Error: Mes invalido ");

        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Introduce el mes en formato numérico:");
        int mes = src.nextInt();
        System.out.println("Introduce el año:");
        int anho = src.nextInt();
        int dias = ejercicio1(mes, anho);
        System.out.println("El mes " + mes + " del año " + anho + " tiene " + dias + " días.");
    }
}

