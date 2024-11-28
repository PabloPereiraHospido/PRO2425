package UD3;

import java.time.YearMonth;
import java.util.Scanner;
import java.lang.Exception;

public class Boletin3 {

    private static int ejercicio1(int mes, int anho) {
        try {
            YearMonth y = YearMonth.of(anho, mes);
            int dias = y.lengthOfMonth();
            return dias;
        } catch (Exception e) {
            System.out.println("Error: Mes o año invalido ");
        }
        return 0;
    }

    private static void ejercicio2(Scanner src) {
        try {
            System.out.print("Introduce una fecha en formato dd/mm/aaaa: ");
            Scanner in = new Scanner(System.in);
            String fecha = in.nextLine();
            String[] partes = fecha.split("/");
            int dia = Integer.parseInt(partes[0]);
            int mes1 = Integer.parseInt(partes[1]);
            int anho1 = Integer.parseInt(partes[2]);
            int diasEnMes = ejercicio1(mes1, anho1);

            if (diasEnMes > 0 && dia >= 1 && dia <= diasEnMes) {
                System.out.println("La fecha es válida.");
            } else {
                System.out.println("La fecha es inválida.");
            }
        } catch (Exception e) {
            System.out.println("Formato de fecha incorrecto.");
        }
    }

    private static void determinarTipoTriangulo(Scanner src) {

        System.out.print("Introduce la longitud del primer lado: ");
        double lado1 = src.nextDouble();

        System.out.print("Introduce la longitud del segundo lado: ");
        double lado2 = src.nextDouble();

        System.out.print("Introduce la longitud del tercer lado: ");
        double lado3 = src.nextDouble();
        try {
            if ((lado1 + lado2 > lado3) &&
                    (lado1 + lado3 > lado2) &&
                    (lado2 + lado3 > lado1)) {

                if (lado1 == lado2 && lado2 == lado3) {
                    System.out.println("El triángulo es equilátero.");
                } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                    System.out.println("El triángulo es isósceles.");
                } else {
                    System.out.println("El triángulo es escaleno.");
                }
            } else {
                System.out.println("Las longitudes no forman un triángulo.");
            }
        } catch (Exception e) {
            System.out.println("Error: Longitud de lado invalida ");
        }
    }

    private static boolean esVocal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    private static boolean esConsonante(char c) {
        if (Character.isLetter(c)) {
            return !esVocal(c);
        } else {
            return false;
        }
    }

    private static void ejecutarClasificacion(Scanner scanner) {
        while (true) {
            // Solicitar altura
            double altura = solicitarAltura(scanner);

            // Finalizar si la altura es 0
            if (altura == 0) {
                System.out.println("Fin del programa.");
                break;
            }

            // Solicitar sexo
            char sexo = solicitarSexo(scanner);

            // Clasificar y mostrar el resultado
            String clasificacion = clasificarAltura(altura, sexo);
            System.out.println("La persona es " + clasificacion + ".");
        }
    }

    private static double solicitarAltura(Scanner scanner) {
        System.out.print("Introduce la altura en cm (0 para salir): ");
        return scanner.nextDouble();
    }


    private static char solicitarSexo(Scanner scanner) {
        char sexo;
        while (true) {
            System.out.print("Introduce el sexo de la persona (M para masculino, F para femenino): ");
            sexo = scanner.next().toUpperCase().charAt(0);
            if (sexo == 'M' || sexo == 'F') {
                break; // Sexo válido
            }
            System.out.println("Sexo inválido. Introduce 'M' o 'F'.");
        }
        return sexo;
    }

    private static void contador(Scanner src, int c) {
        System.out.println("Introduce un texto:");
        String texto = src.nextLine();

        texto = texto.toLowerCase();

        int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;
        int totalVocales = 0;


        for (char c1 : texto.toCharArray()) {
            if (esVocal(c1)) {
                totalVocales++;
                switch (c1) {
                    case 'a':
                        contadorA++;
                        break;
                    case 'e':
                        contadorE++;
                        break;
                    case 'i':
                        contadorI++;
                        break;
                    case 'o':
                        contadorO++;
                        break;
                    case 'u':
                        contadorU++;
                        break;
                }
            }
        }
        if (totalVocales > 0) {
            System.out.printf("Porcentaje de 'a': %.2f%%\n", (contadorA * 100.0) / totalVocales);
            System.out.printf("Porcentaje de 'e': %.2f%%\n", (contadorE * 100.0) / totalVocales);
            System.out.printf("Porcentaje de 'i': %.2f%%\n", (contadorI * 100.0) / totalVocales);
            System.out.printf("Porcentaje de 'o': %.2f%%\n", (contadorO * 100.0) / totalVocales);
            System.out.printf("Porcentaje de 'u': %.2f%%\n", (contadorU * 100.0) / totalVocales);
        } else {
            System.out.println("No se encontraron vocales en el texto.");
        }
    }

    private static String clasificarAltura(double altura, char sexo) {
        if (sexo == 'M') {
            if (altura < 160) {
                return "baja";
            } else if (altura <= 175) {
                return "de estatura normal";
            } else {
                return "alta";
            }
        } else {
            if (altura < 150) {
                return "baja";
            } else if (altura <= 165) {
                return "de estatura normal";
            } else {
                return "alta";
            }
        }
    }

    private static int ejercicio12(int n) {
        if (n < 10 && n > -10) {
            return 1;
        } else {

            return 1 + ejercicio12(n / 10);
        }
    }


    public static void main(String[] args) {

        System.out.println("Introduce el número de ejercicio:");
        Scanner src = new Scanner(System.in);
        int ejercicios = src.nextInt();
        switch (ejercicios) {
            case 1:
                System.out.println("Introduce el mes en formato numérico:");
                int mes = src.nextInt();
                System.out.println("Introduce el año:");
                int anho = src.nextInt();
                int dias = ejercicio1(mes, anho);
                System.out.println("El mes " + mes + " del año " + anho + " tiene " + dias + " días.");
                break;
            case 2:
                ejercicio2(src);
                break;
            case 3:
                determinarTipoTriangulo(src);
                break;
            case 4:
                System.out.print("Introduce un carácter: ");
                char letra = src.next().charAt(0); // Leer el primer carácter introducido

                // Comprobar si el carácter es una vocal
                if (esVocal(letra)) {
                    System.out.println(letra + " es una vocal.");
                } else if (esConsonante(letra)) {
                    System.out.println(letra + " es una consonante.");
                } else {
                    System.out.println(letra + " no es ni vocal ni consonante.");
                }
                break;
            case 5:
                contador(src, 0);
                break;
            case 6:
                ejecutarClasificacion(src);
                break;
            case 12:
                System.out.println("introduce un numero entero :");
                int n = src.nextInt();
                int digitos = ejercicio12(n);
                System.out.println("El número " + n + " tiene " + digitos + " dígitos.");
            default:
                System.out.println("El número de ejercicio es incorrecto.");
                break;
        }
    }
}

