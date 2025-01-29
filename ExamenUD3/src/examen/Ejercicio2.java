package examen;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ejercicio2 {
   public static void DiaNacimiento(int dia, int mes, int anho){
       System.out.println(LocalDate.ofYearDay(anho,dia));

   }
   public static void FechaJubilacion(int dia, int mes, int anho){

   }

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        Scanner b=new Scanner(System.in);
        Scanner c=new Scanner(System.in);
        System.out.println("introduce tu fecha de nacimiento dia, mes y año");
        int dia=a.nextInt();
        int mes=b.nextInt();
        int anho=c.nextInt();
        DiaNacimiento(dia,mes,anho);
    }
}
