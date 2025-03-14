package UD2;

import java.util.Scanner;

public class Boletin22 {
    public static void main(String[] ars) {
        System.out.println("menu de ejercicios, introduce un numero del 1 al 15");
        Scanner src = new Scanner(System.in);
        int opciones = src.nextInt();
        switch (opciones) {
            case 1:
                ejercicio1(src);
                break;
            case 2:
                ejercicio2(src);
                break;
            case 3:
                ejercicio3(src);
                break;
            case 4:
                ejercicio4(src);
                break;
            case 5:
                ejercicio5(src);
                break;
            case 8:
                ejercicio8(src);
                break;
            case 9:
                ejercicio9(src);
                break;
            case 10:
                ejercicio10(src);
                break;
            case 11:
                ejercicio11(src);
                break;
            case 12:
                ejercicio12(src);
                break;
            case 13:
                ejercicio13(src);
                break;
            case 14:
                ejercicio14(src);
                break;
            case 15:
                ejercicio15(src);
                break;
            default:
                System.out.println("ese numero como que no existe manin");
                break;
        }
    }

    private static void ejercicio1(Scanner src) {
        System.out.println("introduce un valor entre 0 y 10 ");
        int valores = src.nextInt();
        if (valores <= 4) {

            System.out.println("nota correcta,es un suspenso");
        } else {
            if (valores >= 5) {
                System.out.println("nota correcta, estas aprobado");
            } else {
                if (valores >= 11) {
                    System.out.println("el valor introducido no es correcto");
                }
            }
        }
        src.close();
    }

    private static void ejercicio2(Scanner src) {

        System.out.print("Introduce una nota (0 a 10): ");

        try {
            double nota = src.nextDouble();

            if (nota >= 0 && nota <= 10) {
                if (nota >= 5) {
                    System.out.println("La nota es correcta. El alumno ha aprobado.");
                } else {
                    System.out.println("La nota es correcta. El alumno ha suspendido.");
                }
            } else {
                System.out.println("La nota no es correcta. Debe estar entre 0 y 10.");
            }
        } catch (Exception e) {
            System.out.println("Entrada no válida. Por favor, introduce un número.");
        }
        src.close();
    }


    private static void ejercicio3(Scanner src) {

        System.out.println("introduce un numero");
        int entero = src.nextInt();

        switch (entero) {
            case 1, 3, 5, 7, 9:
                System.out.println("es impar");
                break;
            case 2, 4, 6, 8, 10:
                System.out.println("Es par");
                break;
            default:
                System.out.println(0);
                break;
        }
        src.close();
    }

    private static void ejercicio4(Scanner src) {

        System.out.print("Ingrese la cantidad de unidades compradas: ");
        int cantidad = src.nextInt();


        System.out.print("Ingrese el precio por unidad del artículo: ");
        double precioUnitario = src.nextDouble();


        double descuento = 0.0;


        if (cantidad > 100) {
            descuento = 0.40;
        } else if (cantidad >= 25 && cantidad <= 100) {
            descuento = 0.20;
        } else if (cantidad >= 10 && cantidad <= 24) {
            descuento = 0.10;
        } else {
            descuento = 0.0;
        }
        src.close();


        double importeTotal = cantidad * precioUnitario;


        double montoDescuento = importeTotal * descuento;

        double importeFinal = importeTotal - montoDescuento;

        // Mostrar el descuento aplicado y el importe final
        System.out.println("El descuento aplicado es: " + (descuento * 100) + "%");
        System.out.println("El importe total sin descuento es: $" + importeTotal);
        System.out.println("El monto del descuento es: $" + montoDescuento);
        System.out.println("El importe final a pagar es: $" + importeFinal);
    }

    private static void ejercicio5(Scanner src) {

        int salario;
        salario = 100;
    }

    private static void ejercicio8(Scanner src) {


        {

            {
                int meses;
                meses = 1;
                switch (meses) {
                    case 1, 3, 5, 7, 8, 10, 12:
                        System.out.println("tiene 31 dias");
                        break;
                    case 4, 6, 9, 11:
                        System.out.println("tiene 30 dias");
                        break;

                    case 2:
                        System.out.println("tiene 28 dias");
                        break;
                    default:
                        System.out.println(("como que ese mes no existe crack"));
                        break;
                }
            }
        }
    }

    private static void ejercicio9(Scanner src) {

        int ano;
        int aa;
        int bb;
        int cc;
        int d;
        int e;
        int f;
        ano = 12;
        aa = 0;
        bb = 1;
        cc = 4;
        d = 6;
        e = 11;
        f = 31;

        if (aa == ano % 19) {
            System.out.println(5);
        } else if (bb == ano % 4) {
            System.out.println(6);
        } else if (cc == ano % 7) {
            System.out.println(3);
        } else if (d == (19 * aa + 24) % 30) {
            System.out.println(12);
        } else if (e == (2 * bb + 4 * cc + 6 * d + 5) % 7) {
            System.out.println(1);
        } else if (f == (22 + d + e)) {
            System.out.println(2);
        }
    }


    private static void ejercicio10(Scanner src) {

        System.out.print("Ingresa un año: ");
        int anio = src.nextInt();

        boolean esBisiesto = false;

        if (anio % 4 == 0) {
            if (anio % 100 == 0) {
                if (anio % 400 == 0) {
                    esBisiesto = true; // Múltiplo de 400, es bisiesto
                }
            } else {
                esBisiesto = true; // Múltiplo de 4, pero no de 100, es bisiesto
            }
        }


        if (esBisiesto) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }

        Scanner scanner4 = new Scanner(System.in);


        System.out.print("Ingresa un año: ");
        int ano1 = src.nextInt();


        boolean esBisiesto1 = false;

        if (ano1 % 4 == 0) {
            if (ano1 % 100 == 0) {
                if (ano1 % 400 == 0) {
                    esBisiesto1 = true; // Múltiplo de 400, es bisiesto
                }
            } else {
                esBisiesto1 = true; // Múltiplo de 4, pero no de 100, es bisiesto
            }
        }

        // Mostrar el resultado
        if (esBisiesto1) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }
    }


    private static void ejercicio11(Scanner src) {

        System.out.print("Ingresa el primer número: ");
        int num1 = src.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = src.nextInt();
        System.out.print("Ingresa el tercer número: ");
        int num3 = src.nextInt();

        int mayor;
        if (num1 > num2 && num1 > num3) {
            mayor = num1;
        } else if (num2 > num1 && num2 > num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        System.out.println("El mayor número es: " + mayor);
    }

    private static void ejercicio12(Scanner src) {

        System.out.print("Ingresa la distancia recorrida en km: ");

        double kmRecorridos = src.nextDouble();


        double totalFactura = 30.0;


        if (kmRecorridos <= 300) {

            totalFactura = 30.0;
        } else if (kmRecorridos <= 1000) {

            totalFactura += (kmRecorridos - 300) * 0.20;
        } else {

            totalFactura += (1000 - 300) * 0.20; // Para los primeros 700 km (de 300 a 1000)
            totalFactura += (kmRecorridos - 1000) * 0.15; // Para los km mayores de 1000
        }


        System.out.println("El total de la factura es: " + totalFactura + "€");
    }

    private static void ejercicio13(Scanner src) {

        System.out.println("Ingresa el número de serie del producto: ");

        int numeroSerie = src.nextInt();


        boolean esDefectuoso = (numeroSerie >= 14681 && numeroSerie <= 15681) ||
                (numeroSerie >= 70001 && numeroSerie <= 79999) ||
                (numeroSerie >= 88888 && numeroSerie <= 111111);


        if (esDefectuoso) {
            System.out.

                    println("El producto con número de serie " + numeroSerie + " es defectuoso.");
        } else {
            System.out.

                    println("El producto con número de serie " + numeroSerie + " NO es defectuoso.");
        }
    }

    private static void ejercicio14(Scanner src) {

        System.out.

                print("Ingresa la primera puntuación: ");

        int punt1 = src.nextInt();
        System.out.

                print("Ingresa la segunda puntuación: ");

        int punt2 = src.nextInt();
        System.out.

                print("Ingresa la tercera puntuación: ");

        int punt3 = src.nextInt();
        System.out.

                print("Ingresa la cuarta puntuación: ");

        int punt4 = src.nextInt();


        double media = (punt1 + punt2 + punt3 + punt4) / 4.0;


        char nota;
        if (media >= 90 && media <= 100) {
            nota = 'A';
        } else if (media >= 80 && media <= 89) {
            nota = 'B';
        } else if (media >= 70 && media <= 79) {
            nota = 'C';
        } else if (media >= 60 && media <= 69) {
            nota = 'D';
        } else {
            nota = 'E';
        }


        System.out.

                println("La media de las puntuaciones es: " + media);
        System.out.

                println("La nota es: " + nota);
    }

    private static void ejercicio15(Scanner src) {

        int a;
        int b;
        int c;
        a = 0;
        b = 2;
        c = 1;

        if (a == 0) {

            System.out.

                    println("Solucion = " + ((double) (-c / b)));
        } else {
            double x1;
            double x2;
            int discriminante = b * b - 4 * a * c;
            if (discriminante >= 0) {
                x1 = (-b + Math.

                        sqrt(discriminante) / (2 * a));
                x2 = (-b - Math.

                        sqrt(discriminante) / (2 * a));
            } else {
                double parteReal;
                parteReal = -b / (2 * a);
                x1 = Math.

                        sqrt(discriminante * -1) / 2 * a;
                x2 = x1 * -1;
                System.out.

                        println(parteReal);
                System.out.println(x1);
                System.out.println(x2);
            }

        }
    }
}

