package UD2;

import java.util.Scanner;

public class Boletin21 {
    public static void main(String[] ars) {
        System.out.println("introduce numero de ejercicio : ");
        Scanner in = new Scanner(System.in);
        int ejercicio = in.nextInt();
        switch (ejercicio) {
            case 1:
                System.out.println((true && true) || false == true);
        /*
         primero se ejecuta el true and true, lo que da true
        luego al seguir la metodologia del cortocicuito se deja de comprobar al siempre dar true
*/
                System.out.println((false || false) && false == true);
/*
primero se ejecuta el false or false, lo que da false,
luego va el false and false,lo que vuelve a dar false,
y al no ser igual a true da false
*/
                System.out.println((!(true && false)) == false);
        /*
        se invierte el primer true lo que seria false and false, dando como resultado false
        por ultimo da false debido a que false es igual a false
         */
                int i = 1;
                int j = 0;
                int k = -1;
                boolean resultado = i + k <= j - k * 3 && k >= 2;
                System.out.println(resultado);
        /*
        primero se hace la suma de i + k=0
        despues se hace la multiplicacion de k*3, la cual da -3
        luego debido a la doble necacion pasa a 3, al cual se le suma el valor de j dando 4
        al comparar el 4 con el cero da false ya que es mayor que cero
        asi que sabiendo que el resutado final es false, se deja de hacer la ultima comprobacion
         */
                int ii = 3;
                int jj = 2;
                int kk = -1;
                boolean resultado2 = ii == 3 || jj <= 2 && kk > 0;
                System.out.println(resultado2);
        /*
        primero comprueba que una de las dos primeras variables sean verdaderas,
        y luego comprurba que la ultima variable es mayor o igual a cero, que lo es
         */
                int iii = 1;
                boolean resultados3 = 3 == 2 || 5 > iii + iii;
                System.out.println(resultados3);
        /*
        es verdadero ya que aunque la primera parte sea falsa,la segunda se vuelve verdadero al llegar
        al 5 o superarlo,, lo cual ocurre, y con el or en medio en este caso es true
         */
                double x = 1;
                int y = 4;
                int z = 10;
               final double PI = 3.1416;
                boolean resultado4 = PI * x * x > y || 2 * PI * x <= z;
                boolean resultado5 = x > 3 && (y == 4 || x + y <= z);
                System.out.println(resultado4);
                System.out.println(resultado5);
/*
la primera de las dos es verdadera ya que aunque la primera parte da false, debido a que la segunda parte esta
unido por un or y es verdadera, la expresion es verdadera

por otro lado, el sgundo enunciado es falso por que todas sus condiciones son falsas
 */
                break;
            case 2:
                int as = 10; // Cambia estos valores para probar con otros números
                int ba = 2;


                // Verificar si a es divisible por b
                if (ba != 0 && as % ba == 0) {
                    System.out.println(as + " es divisible por " + ba);
                } else if (ba == 0) {
                    System.out.println("No se puede dividir entre 0.");
                } else {
                    System.out.println(as + " no es divisible por " + ba);
                }
                break;

            case 3:
                boolean esTurnoDeA = true;  // Al inicio, es el turno del jugador A.
                // Mostrar de quién es el turno actual
                if (esTurnoDeA) {
                    System.out.println("Es el turno del jugador A.");
                } else {
                    System.out.println("Es el turno del jugador B.");
                }

                // Cambiar el turno
                esTurnoDeA = !esTurnoDeA;

                // Mostrar de quién es el turno después de cambiar
                if (esTurnoDeA) {
                    System.out.println("Ahora es el turno del jugador A.");
                } else {
                    System.out.println("Ahora es el turno del jugador B.");
                }
                break;
            case 4:
                Scanner scanner = new Scanner(System.in);

                // Leer las coordenadas
                System.out.print("Introduce la fila (1-5): ");
                int fila = scanner.nextInt();

                System.out.print("Introduce la columna (1-5): ");
                int columna = scanner.nextInt();

                // Verificar si las coordenadas están dentro del rango válido de la matriz 5x5
                if (fila >= 1 && fila <= 5 && columna >= 1 && columna <= 5) {
                    System.out.println("El elemento está dentro de la matriz.");
                } else {
                    System.out.println("El elemento está fuera de la matriz.");
                }
                scanner.close();
                break;
            case 5:
                Scanner scanner2 = new Scanner(System.in);

                // Pedir el número máximo de opciones del menú (N)
                System.out.print("Introduce el número máximo de opciones del menú (N): ");
                int n = scanner2.nextInt();

                // Pedir al usuario que introduzca su opción
                System.out.print("Introduce una opción del menú (1 a " + n + "): ");
                int opcion = scanner2.nextInt();

                // Verificar si la opción es válida
                if (opcion >= 1 && opcion <= n) {
                    System.out.println("La opción " + opcion + " es válida.");
                } else {
                    System.out.println("La opción " + opcion + " no es válida.");
                }
                break;
            case 6:
                // Notas de las tres unidades didácticas
                double nota1 = 6.0;
                double nota2 = 4.5;
                double nota3 = 5.5;

                // Calcular la nota media
                double notaMedia = (nota1 + nota2 + nota3) / 3;

                // Verificar si el alumno aprobó
                boolean aprobo = notaMedia >= 5;

                System.out.println("El alumno aprobó: " + aprobo);
                // Notas de las tres unidades didácticas
                double nota4 = 6.0;
                double nota5 = 4.5;
                double nota6 = 5.5;

                // Puntuación extra otorgada por el profesor
                double puntosExtra = 0.5;

                // Calcular la nota media
                double notaMedia1 = (nota4 + nota5 + nota6) / 3;

                // Verificar si el alumno aprobó teniendo en cuenta los puntos extra
                boolean aprobo1 = (notaMedia + puntosExtra) >= 5;

                System.out.println("El alumno aprobó: " + aprobo1);  // Notas de las tres unidades didácticas
                double nota7 = 6.0;
                double nota8 = 4.5;
                double nota9 = 5.5;

                // Puntuación extra otorgada por el profesor
                double puntosExtra1 = 0.5;

                // Calcular la nota media
                double notaMedia2 = (nota7 + nota8 + nota9) / 3;

                // Verificar si el alumno aprobó teniendo en cuenta los puntos extra
                boolean aprobo3 = (notaMedia2 + puntosExtra1) >= 5;

                System.out.println("El alumno aprobó: " + aprobo3);
                // Notas de las tres unidades didácticas
                double nota11 = 6.0;
                double nota21 = 4.5;
                double nota31 = 5.5;

                // Puntuación extra otorgada por el profesor
                double puntosExtra2 = 0.5;

                // Calcular la nota media
                double notaMedia3 = (nota11 + nota21 + nota31) / 3;

                // Verificar si el alumno aprobó (nota media >= 4 y nota media + puntos extra >= 5)
                boolean aprobo4 = (notaMedia3 >= 4) && (notaMedia3 + puntosExtra2 >= 5);

                System.out.println("El alumno aprobó: " + aprobo4);
                // Notas de las tres unidades didácticas
                double nota12 = 6.0;
                double nota22 = 4.5;
                double nota32 = 5.5;

                // Notas de los trabajos por cada unidad didáctica
                double trabajo1 = 7.0;
                double trabajo2 = 6.0;
                double trabajo3 = 5.0;

                // Puntuación extra otorgada por el profesor
                double puntosExtra5 = 0.5;

                // Calcular la nota media de las unidades didácticas
                double notaMediaUD = (nota12 + nota22 + nota32) / 3;

                // Calcular la nota media de los trabajos
                double notaMediaTrabajos = (trabajo1 + trabajo2 + trabajo3) / 3;

                // Calcular la media aritmética entre la nota de las unidades didácticas y la de los trabajos
                double notaMediaFinal = (notaMediaUD + notaMediaTrabajos) / 2;

                // Verificar si el alumno aprobó (nota media >= 4 y nota media + puntos extra >= 5)
                boolean aprobo5 = (notaMediaFinal >= 4) && (notaMediaFinal + puntosExtra5 >= 5);

                System.out.println("El alumno aprobó: " + aprobo5);
                // Notas de las tres unidades didácticas
                double nota15 = 6.0;
                double nota25 = 4.5;
                double nota35 = 5.5;

                // Notas de los trabajos por cada unidad didáctica
                double trabajo12 = 7.0;
                double trabajo22 = 6.0;
                double trabajo32 = 5.0;

                // Puntuación extra otorgada por el profesor
                double puntosExtra6 = 0.5;

                // Calcular la nota media de las unidades didácticas
                double notaMediaUD1 = (nota15 + nota25 + nota35) / 3;

                // Calcular la nota media de los trabajos
                double notaMediaTrabajos1 = (trabajo12 + trabajo22 + trabajo32) / 3;

                // Calcular la nota final ponderada (80% unidades didácticas, 20% trabajos)
                double notaMediaFinal1 = (notaMediaUD1 * 0.8) + (notaMediaTrabajos1 * 0.2);

                // Verificar si el alumno aprobó (nota media >= 4 y nota media + puntos extra >= 5)
                boolean aprobo7 = (notaMediaFinal1 >= 4) && (notaMediaFinal1 + puntosExtra6 >= 5);

                System.out.println("El alumno aprobó: " + aprobo7);
                // Notas de las tres unidades didácticas
                double nota14 = 6.0;
                double nota24 = 4.5;
                double nota34 = 5.5;

                // Notas de los trabajos por cada unidad didáctica
                double trabajo14 = 7.0;
                double trabajo24 = 6.0;
                double trabajo34 = 5.0;

                // Puntuación extra otorgada por el profesor
                double puntosExtra3 = 0.5;

                // Calcular la nota media de las unidades didácticas
                double notaMediaUD8 = (nota14 + nota24 + nota34) / 3;

                // Calcular la nota media de los trabajos
                double notaMediaTrabajos8 = (trabajo14 + trabajo24 + trabajo34) / 3;

                // Calcular la nota final ponderada (80% unidades didácticas, 20% trabajos)
                double notaMediaFinal8 = (notaMediaUD8 * 0.8) + (notaMediaTrabajos8 * 0.2);

                // Verificar si el alumno aprobó (nota media >= 4 y nota media + puntos extra >= 5)
                // Y que la media de las prácticas sea al menos 4
                boolean aprobo8 = (notaMediaFinal8 >= 4) && (notaMediaFinal8 + puntosExtra3 >= 5) && (notaMediaTrabajos8 >= 4);

                System.out.println("El alumno aprobó: " + aprobo8);
                break;

            default:
                System.out.println("el numero de ejercicio introducido es incorrecto! ");
                break;
        }
    }

}
