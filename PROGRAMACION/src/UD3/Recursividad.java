package UD3;

/**
 * @author pabloPereira
 */

public class Recursividad {
    public static void main(String[] args) {
        int numero = 5;
        int numero2 = 12345;
        final int ZERO = 0;
        System.out.println(factorial(5));
        System.out.println(invertir(numero2, ZERO));
    }

    /**
     *
     * @param n
     * @return
     */
    private static long factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    /**
     *
     * @param n
     * @param invertido
     * @return
     */
    private static int invertir(int n, int invertido) {
        if (n == 0) {
            return invertido * 10 + n;
        } else {
            return invertir(n / 10, invertido = invertido * 10 + n % 10);
        }
    }
}
