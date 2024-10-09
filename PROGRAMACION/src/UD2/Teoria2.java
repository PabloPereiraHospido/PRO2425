package UD2;

public class Teoria2 {
    public static void main(String[] ars) {
        boolean verdadero = true;
        boolean falso = false;
        System.out.println(true);
        System.out.println(false);
        System.out.println(true && false);
        System.out.println(true || false);

        //miercoles 9 de octubre
        System.out.println("buenas");
        int edad = 20;
        if (edad >= 18) {
            System.out.println("puede beber");
        }
        System.out.println("adios");
        int numero = 10;
        if (numero % 2 == 0) {
            System.out.println("numero par");
        } else {
            System.out.println("numero impar");
        }
        byte edad2 = 15;
        if (edad2 >= 18) {
            System.out.println("es mayor de edad, su edad es " + edad2);

        } else {
            System.out.println("es menor de edad, su edad es " + edad2);
        }
    }

}
