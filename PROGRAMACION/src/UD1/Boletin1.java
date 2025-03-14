package UD1;

import java.util.Scanner;

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

        int q = 2; //no se porque no detecta que se esta usando
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

        System.out.println(p *= +8);//no detecta que es una multiplicacion

        byte variableByte;

        variableByte = (byte) p; // haciendo el casting

        System.out.println(variableByte);  // el numero no coincide ya que el byte no puede contener numero


        // ejercicio 12

        int miInt = 9;
        double miDoble = miInt;
        System.out.println(miDoble);
        System.out.println(miInt);

        //funciona porque a un int le puedes meter un double

        //ejercicio 13
        double miDoble2 = 9.78d;
        int mInt;
        mInt = (int) miDoble2;
        System.out.println(miDoble2);
        System.out.println(miInt);

        //ejercicio 14

        // Total de segundos a convertir
        int totalSegundos = 86455;

        // Definimos las constantes para las conversiones
        int segundosEnUnMinuto = 60;
        int minutosEnUnaHora = 60;
        int horasEnUnDia = 24;

        // Cálculos
        int segundosRestantes = totalSegundos;

        int dias = segundosRestantes / (segundosEnUnMinuto * minutosEnUnaHora * horasEnUnDia);
        segundosRestantes %= (segundosEnUnMinuto * minutosEnUnaHora * horasEnUnDia);

        int horas = segundosRestantes / (segundosEnUnMinuto * minutosEnUnaHora);
        segundosRestantes %= (segundosEnUnMinuto * minutosEnUnaHora);

        int minutos = segundosRestantes / segundosEnUnMinuto;
        int segundos = segundosRestantes % segundosEnUnMinuto;

        // Imprimir el resultado
        System.out.println(totalSegundos + " segundos son:");
        System.out.println(dias + " días");
        System.out.println(horas + " horas");
        System.out.println(minutos + " minutos");
        System.out.println(segundos + " segundos");

        //ejercicio 15
        // Declarar e inicializar una variable entera con un número de cuatro cifras
        int numero = 4321;

        // Calcular los componentes
        int millares = numero / 1000;
        int centenas = (numero % 1000) / 100;
        int decenas = (numero % 100) / 10;
        int unidades = numero % 10;

        // Imprimir el desglose
        System.out.println(millares + " millares.");
        System.out.println(centenas + " centenas.");
        System.out.println(decenas + " decenas.");
        System.out.println(unidades + " unidades.");

        //ejercicio 16

        // Declarar e inicializar la variable contador
        int contador = 8; // Puedes cambiar este valor inicial para probar

        // Incrementar el contador de forma circular en una única instrucción
        contador = (contador + 1) % 10;

        // Imprimir el resultado
        System.out.println("El valor del contador es: " + contador);

        //ejercicio 17

        int nn = 10;
        int yy = 4;
        int v = 2;
        double k;

        k = nn / yy;
        k = (double) nn / yy;
        k = (double) (nn / yy);
        k += nn;
        v *= k;
        k += 2;
        System.out.println(k);

        //ejercicio 18

        // Declarar e inicializar cuatro variables de tipo int
        int var1 = 10;  // Puedes cambiar estos valores
        int var2 = 25;
        int var3 = 40;
        int var4 = 5;

        // a) La suma de las cuatro variables
        int suma = var1 + var2 + var3 + var4;

        // b) El producto de la primera variable por 100
        int producto = var1 * 100;

        // c) La división real de la segunda por tres
        double divisionReal = (double) var2 / 3;

        // d) La parte entera de la división de la tercera variable dividida por la cuarta
        int parteEntera = var3 / var4;

        // e) El resto de la división de la primera entre la segunda variable
        int resto = var1 % var2;

        // Imprimir los resultados
        System.out.println("Suma: " + suma);
        System.out.println("Producto de var1 por 100: " + producto);
        System.out.println("División real de var2 por 3: " + divisionReal);
        System.out.println("Parte entera de var3 dividido por var4: " + parteEntera);
        System.out.println("Resto de var1 dividido por var2: " + resto);

        //ejercicio 19
        // Declarar e inicializar cuatro variables de tipo double
        double var11 = 10.5;  // Puedes cambiar estos valores
        double var22 = 25.0;
        double var33 = 40.0;
        double var44 = 5.0;

        // a) La suma de las cuatro variables
        double sumadouble = var11 + var22 + var33 + var44;

        // b) El producto de la primera variable por 100
        double producto2 = var11 * 100;

        // c) La división real de la segunda por tres
        double divisionReal2 = var22 / 3;

        // d) La parte entera de la división de la tercera variable dividida por la cuarta
        double parteEntera2 = Math.floor(var33 / var44); // Usamos Math.floor para obtener la parte entera

        // e) El resto de la división de la primera entre la segunda variable
        double resto2 = var11 % var22;

        // Imprimir los resultados
        System.out.println("Suma: " + suma);
        System.out.println("Producto de var1 por 100: " + producto);
        System.out.println("División real de var2 por 3: " + divisionReal);
        System.out.println("Parte entera de var3 dividido por var4: " + parteEntera);
        System.out.println("Resto de var1 dividido por var2: " + resto);
//ejercicio 20

        Scanner scanner = new Scanner(System.in);

        // Declarar las variables para los tres números
        int num1;
        int num2;
        int num3;

        // Solicitar al usuario que ingrese los tres números
        System.out.print("Introduce el primer número entero: ");
        num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número entero: ");
        num2 = scanner.nextInt();

        System.out.print("Introduce el tercer número entero: ");
        num3 = scanner.nextInt();

        // Calcular la media real
        double media = (num1 + num2 + num3) / 3.0;

        // Imprimir el resultado
        System.out.println("La media de los tres números es: " + media);

        //ejercicio 21
        Scanner scanner2 = new Scanner(System.in);

        // Declarar las variables para los tres números reales
        double num111;
        double num222;
        double num333;

        // Solicitar al usuario que ingrese los tres números reales
        System.out.print("Introduce el primer número real: ");
        num111 = scanner.nextDouble();

        System.out.print("Introduce el segundo número real: ");
        num222 = scanner.nextDouble();

        System.out.print("Introduce el tercer número real: ");
        num333 = scanner.nextDouble();

        // Calcular la media
        double media2 = (num111 + num222 + num333) / 3;

        // Imprimir el resultado
        System.out.println("La media de los tres números es: " + media2);

        // Cerrar el scanner
        scanner.close();

        //ejercicio 22
        // Declarar e inicializar la longitud del lado
        double lado = 0.5;

        // Calcular el área
        double area = lado * lado;

        // Calcular el perímetro
        double perimetro = 4 * lado;

        // Imprimir los resultados
        System.out.println("Lado del cuadrado: " + lado + " cm");
        System.out.println("Área del cuadrado: " + area + " cm²");
        System.out.println("Perímetro del cuadrado: " + perimetro + " cm");

        //ejercicio 23
        // Monto inicial y tasa de interés
        double montoInicial = 5000.0; // en euros
        double tasaInteres = 0.06; // 6% de interés anual

        // Calcular el monto total después de un año
        double montoFinal = montoInicial * (1 + tasaInteres);

        // Imprimir el resultado
        System.out.println("Dinero después de un año: " + montoFinal + " €");
    }

}

