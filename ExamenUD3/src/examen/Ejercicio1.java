package examen;

import java.util.Scanner;

public class Ejercicio1 {

    public static void Redondear(double num){

       double b= Math.log10(num);
       double c=Math.ceil(num);
       double e=Math.floor(num);
        System.out.println(b);
        System.out.println(c);
        System.out.println(e);



    }

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("introduce un numero");
        double num=a.nextDouble();
        Redondear(num);

    }
}
