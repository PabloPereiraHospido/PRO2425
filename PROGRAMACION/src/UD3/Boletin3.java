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

    public static void ejecutarPrograma() {
        Scanner scanner = new Scanner(System.in);
        String entrada;

        System.out.println("Introduce una hora en formato 'hh:mm:ss' o 0 para salir:");

        while (true) {
            entrada = scanner.nextLine();


            if (entrada.equals("0")) {
                System.out.println("Programa finalizado.");
                break;
            }

            String[] partes = entrada.split(":");


            if (partes.length != 3) {
                System.out.println("La hora es inválida. Formato incorrecto.");
                continue;
            }

            try {
                int horas = Integer.parseInt(partes[0]);
                int minutos = Integer.parseInt(partes[1]);
                int segundos = Integer.parseInt(partes[2]);


                if (horas >= 0 && horas < 24 && minutos >= 0 && minutos < 60 && segundos >= 0 && segundos < 60) {
                    System.out.println("La hora es válida.");
                } else {
                    System.out.println("La hora es inválida. Valores fuera de rango.");
                }
            } catch (NumberFormatException e) {
                System.out.println("La hora es inválida. Contiene caracteres no numéricos.");
            }
        }
    }

    public static void buscarNumerosReversibles() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad de números reversibles a encontrar (0 para salir):");

        while (true) {
            int n = scanner.nextInt();

            if (n == 0) {
                System.out.println("Programa finalizado.");
                break;
            }

            System.out.println("Buscando los primeros " + n + " números reversibles:");
            int encontrados = 0;
            int numero = 1;

            while (encontrados < n) {
                int inverso = Integer.parseInt(new StringBuilder(String.valueOf(numero)).reverse().toString());
                int suma = numero + inverso;


                if (String.valueOf(numero).length() == String.valueOf(inverso).length()) {

                    boolean todosImpares = true;
                    for (char c : String.valueOf(suma).toCharArray()) {
                        if ((c - '0') % 2 == 0) {
                            todosImpares = false;
                            break;
                        }
                    }

                    if (todosImpares) {
                        System.out.println(numero);
                        encontrados++;
                    }
                }

                numero++;
            }
        }
    }

    public static void realizarConversiones() {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Opciones:");
            System.out.println("1.- Transformar a binario.");
            System.out.println("2.- Transformar a octal.");
            System.out.println("3.- Transformar a hexadecimal.");
            System.out.println("4.- Fin del proceso.");
            System.out.print("Selecciona una opción: ");

            int opcion = scanner.nextInt();

            if (opcion == 4) {
                System.out.println("Proceso finalizado.");
                break;
            }

            if (opcion < 1 || opcion > 4) {
                System.out.println("Opción inválida. Intenta de nuevo.");
                continue;
            }


            System.out.print("Introduce un número entero: ");
            int numero = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Binario: " + Integer.toBinaryString(numero));
                    break;
                case 2:
                    System.out.println("Octal: " + Integer.toOctalString(numero));
                    break;
                case 3:
                    System.out.println("Hexadecimal: " + Integer.toHexString(numero).toUpperCase());
                    break;
            }
        }
    }

    public static void procesarEntradaUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre completo y DNI en el formato: 'Nombre Apellido, DNI'");
        System.out.println("Ejemplo: Javier Rodríguez López, 33456789Z");

        String entrada = scanner.nextLine();


        int posicionComa = entrada.indexOf(',');

        if (posicionComa == -1) {
            System.out.println("Formato inválido. Asegúrate de usar una coma para separar el nombre del DNI.");
        } else {

            String nombre = entrada.substring(0, posicionComa).trim().toUpperCase();
            String dni = entrada.substring(posicionComa + 1).trim();


            System.out.println("Nombre: " + nombre);
            System.out.println("DNI: " + dni);
        }
    }

    public static void encontrarNumerosPerfectos() {
        int contador = 0;
        int numero = 1;

        System.out.println("Los primeros cuatro números perfectos son:");

        while (contador < 4) {
            int sumaDivisores = 0;


            for (int i = 1; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    sumaDivisores += i;
                }
            }

            if (sumaDivisores == numero) {
                System.out.println(numero);
                contador++;
            }

            numero++;
        }
    }

    private static int ejercicio12(int n) {
        if (n < 10 && n > -10) {
            return 1;
        } else {

            return 1 + ejercicio12(n / 10);
        }
    }

    public static void calcularPotencia() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Introduce la base (x): ");
        double x = scanner.nextDouble();


        System.out.print("Introduce el exponente (n): ");
        int n = scanner.nextInt();


        double resultado = calcularPotenciaRecursiva(x, n);


        System.out.println("Resultado: " + resultado);

        scanner.close();
    }

    private static double calcularPotenciaRecursiva(double x, int n) {

        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 1 / calcularPotenciaRecursiva(x, -n);
        }
        return x * calcularPotenciaRecursiva(x, n - 1);
    }

    private static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    private static void ejecutarFibonacci(Scanner scanner) {
        System.out.print("Introduce el número de términos de la serie de Fibonacci a mostrar: ");
        int n = scanner.nextInt();

        System.out.println("Los primeros " + n + " términos de la serie de Fibonacci son:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    private static int invertirNumero(int numero) {
        try {
            if (numero < 10) {
                return numero;
            }
            int longitud = (int) Math.log10(numero);
            return (numero % 10) * (int) Math.pow(10, longitud) + invertirNumero(numero / 10);
        } catch (Exception e) {
            System.out.println("Error: No bancamos las recursividad");
        }
        return 0;
    }


    private static int sumarDigitos() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce un número: ");
            int numero = scanner.nextInt();
            scanner.close();


            return sumarDigitosRecursivo(numero);
        } catch (Exception e) {
            System.out.println("Error: No bancamos las recursividad");
        }
        return 0;
    }


    private static int sumarDigitosRecursivo(int numero) {
        try {
            if (numero == 0) {
                return 0;
            }
            return (numero % 10) + sumarDigitosRecursivo(numero / 10);
        } catch (Exception e) {
            System.out.println("Error: No bancamos las recursividad");
        }
        return 0;
    }

    private static void algoritmoEuclidesRecursivo(int a, int b) {
        try {
            if (b == 0) {
                System.out.println("El máximo común divisor es: " + a);
            } else {
                algoritmoEuclidesRecursivo(b, a % b);
            }
        } catch (Exception e) {
            System.out.println("Error: No bancamos las recursividad");
        }
    }

    public static boolean esPar(int numero) {

        if (numero == 0) {
            return true;
        }

        if (numero == 1) {
            return false;
        }

        return esPar(numero - 2);
    }

    public static int sumaRecursiva(int n) {
        try {
            if (n <= 1) {
                return n;
            }
            return n + sumaRecursiva(n - 1);
        } catch (Exception e) {
            System.out.println("Error: No bancamos las recursividad");
        }
        return 0;
    }

    private static boolean esPalindromo(String cadena) {
        Scanner src = new Scanner(System.in);
        String texto = src.nextLine();
        try {
            texto = texto.replaceAll(" ", "");
            if (texto.length() <= 1) {
                return true;
            } else {
                if (texto.charAt(0) == texto.charAt(texto.length() - 1)) {
                    return esPalindromo(texto.substring(1, texto.length() - 1));
                } else {
                    return false;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: No bancamos las recursividad");
        }
        return false;
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
                char letra = src.next().charAt(0);


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
            case 7:
                ejecutarPrograma();
                break;
            case 8:
                buscarNumerosReversibles();
                break;
            case 9:
                realizarConversiones();
                break;
            case 10:
                procesarEntradaUsuario();
                break;
            case 11:
                encontrarNumerosPerfectos();
                break;
            case 12:
                try {
                    System.out.println("introduce un numero entero :");
                    int n = src.nextInt();
                    int digitos = ejercicio12(n);
                    System.out.println("El número " + n + " tiene " + digitos + " dígitos.");
                } catch (Exception e) {
                    System.out.println("Error: No bancamos las recursividad");
                }
                break;
            case 13:
                try {
                    calcularPotencia();
                } catch (Exception e) {
                    System.out.println("Error: No bancamos las recursividad");
                }
                break;
            case 14:
                try {
                    ejecutarFibonacci(src);
                } catch (Exception e) {
                    System.out.println("Error: aqui no bancamos la recusividad");
                }
                break;
            case 15:
                System.out.println("introduce el número para invertir: ");
                int numero = src.nextInt();
                System.out.println("Número invertido: " + invertirNumero(numero));
                break;
            case 16:
                System.out.println("La suma de los dígitos es: " + sumarDigitos());
                break;
            case 17:
                System.out.println("Introduce el primer número:");
                int a = src.nextInt();
                System.out.println("Introduce el segundo número:");
                int b = src.nextInt();
                algoritmoEuclidesRecursivo(a, b);
                break;
            case 18:
                System.out.println("Introduce un número entero:");
                int num = src.nextInt();
                if (esPar(num)) {
                    System.out.println("El número es par.");
                } else {
                    System.out.println("El número es impar.");
                }
                break;
            case 19:

                Scanner scanner = new Scanner(System.in);

                System.out.print("Introduce un número entero positivo: ");
                int n = scanner.nextInt();


                if (n < 1) {
                    System.out.println("Por favor, introduce un número entero positivo.");
                } else {

                    int resultado = sumaRecursiva(n);
                    System.out.println("La suma de los números de 1 a " + n + " es: " + resultado);
                }
                break;
            case 20:
                System.out.println("Introduce una cadena:");
                String cadena = src.nextLine();
                if (esPalindromo(cadena)) {
                    System.out.println("La cadena es un palíndromo.");
                } else {
                    System.out.println("La cadena no es un palíndromo.");
                }
                break;
            default:
                System.out.println("El número de ejercicio es incorrecto.");
                break;
        }
    }
}


