package UD1;

public class Boletin1 {
    public static void main(String args[]) {

        // ejercicio 1

    /*
    línea 1 es el paquete en el que se estructura el código
    línea 3 inicio de comentario detectado por javadoc para hacer la documentacion del proyecto
    línea 7 clase pública del .java
    línea 9 definición de un elemento estático
    línea 10 declaración de constante
    línea 12 delaración de variable
    línea 15 inicio de comentario en bloque
    línea 22 comentario en linea explicativo del código
     */

        //ejercicio 2

   /*
   María no es válido por el acento
   Salto_Mortal no es válido debido al subrayado
   "datos" no es válido ya que empieza por comillas
   sueldo bruto no es válido debido al espacio
   cu_1 no es válido por el subrayado
   58 no es válido ya que comienza por un dígito
   salto-mortal no es valido por el guion
   if no es valido ya que es una palabra reservada del sistema java
   año no es válido por la ñ
    */

        // ejercicio 3

    /*
    en el apartado a asigna el valor de la variable a se asigna a una vaiable llamada b y el segundo asigna el caracter "b" a la variable a
    en el partado b se asigna el valor de la variable 7 a la a, y en el segundo se asigna el numero 7 a la variable a
     */

        // ejercicio 4

        char letraA = 'a';
        System.out.println((int) letraA);
        char letraB = 'z';
        System.out.println((int) letraB);

        int z = 122;
        int a = 97;
        int total;
        total = z - a;
        System.out.println("total=" + total);


// ejercicio 5

        int d = 5;    // declaracion de la primera variable
        int f = 10;   // declaracion de la segunda variable
        int c;        // declaracion de una tercera variable sin ningun valor asignado

        c = d;       // el valor de la variable es c=d
        d = f;       // el valor de la variable es d=c
        f = c;       // el valor de la variable es f=c

        System.out.println("d=" + d);
        System.out.println("f=" + f);

        //ejercicio 6

        char xocas;
        xocas = 'e';
        System.out.println("la variable xocas almacena la letra\t" + xocas);
        char letraE = 'e';
        xocas = letraE;
        System.out.println("la variable xocas sigue almacenando la letra\t" + xocas);
        xocas = '\u0065';
        System.out.println("la variable xocas sigue almacenando la letra\t" + xocas);

        //ejercicio 7

        int i1 = 10;
        int i2 = 3;
        double d1 = 12.5;
        double d2 = 2.0;

        System.out.println(i1 / i2);
        System.out.println(i1 & i2);
        System.out.println(d1 / d2);
        System.out.println(d1 % d2);
        System.out.println(d1 / i2);
        System.out.println(d1 % i2);

        //ejercicio 8

        int q = 2;
        int n = 10;

        System.out.println(q = ++n * 3);
        System.out.println(q = n++ * 3);

        //ejercicio 9

        System.out.println(-6 * 7 + 2 * 3 / 4 - 8);
        System.out.println(((3 + 2) % 2 - 15) / 2 * 5);
        System.out.println(3 + 6 * 14 % 3);
        System.out.println(8 + 7 * 3 + 4 * 6 / 2 % 4);

        //ejercicio 10

        double x = 1;
        double y = 4;
        double u = 10;
        final double pi = 3.1416;

        System.out.println(2 * x + 0.5 + y - 1 / 5 * u);
        System.out.println(4 / y + pi * x / u);
        System.out.println(y - 2 / u + 4 * y / 2);

        //ejecricio 11

        int p = 50;

        System.out.println(p *= +8);

        byte variableByte;

        variableByte = (byte) p; // haciendo el casting

        System.out.println(variableByte);  // el numero no coincide ya que el byte no puede contener todo el nunero


        // ejercicio 12

        int miInt = 9;
        double miDoble = miInt;
        System.out.println(miDoble);
        System.out.println(miInt);
//funciona porque a un int le puedes meter un double

        //ejercicio 13
        double miDoble2 = 9.78d;
        int mInt = (int) miDoble2;
        System.out.println(miDoble2);
        System.out.println(miInt);
    }
}
