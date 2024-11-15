package UD3;

public class Teoria3 {

    private static void imprimirTablaMultiplicar(int valor) {
        System.out.println("Tabla de multiplicar del " + valor);
        for (int i = 1; i <= 10; i++) {
            System.out.println(valor + " * " + i + "= " + i * valor);
        }
    }

    private static int sumar(int numero1, int numero2) {

        return numero1 + numero2;
    }

    private static double hacerMedia(int numero1, int numero2) {
        return (double) (numero1 + numero2) / 2;
    }

    private static void imprimirPresentacion() {
        System.out.println("Pablo,edad 24,Lugo");

    }

    private static void imprimirPresentacion(String nombre, int edad, String Lugar) {
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(Lugar);
    }

    public static void main(String[] args) {
        for (int valor = 1; valor <= 2; valor++)
            // imprimirTablaMultiplicar(valor);
            System.out.println(sumar(10, 10));
        System.out.println(hacerMedia(9, 8));
        imprimirPresentacion();
        imprimirPresentacion("Pablo", 24, "Lugo");
    }
}

