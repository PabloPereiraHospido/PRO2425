package UD3;

import java.time.YearMonth;
import java.util.Scanner;

public class Boletin3 {

    public static int ejercicio1(int mes, int ano) {
        YearMonth y = YearMonth.of(ano, mes);
        int dias = y.lengthOfMonth();
        return dias;
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Introduce el mes en formato numérico:");
        int mes = src.nextInt();
        System.out.println("Introduce el año:");
        int ano = src.nextInt();
        int dias = ejercicio1(mes, ano);
        System.out.println("El mes " + mes + " del año " + ano + " tiene " + dias + " días.");
    }
}

