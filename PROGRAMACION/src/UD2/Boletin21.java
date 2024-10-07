package UD2;

public class Boletin21 {
    public static void main(String[] ars) {
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
        int i = 1, j = 0, k = -1;
        boolean resultado = i + k <= j - k * 3 && k >= 2;
        System.out.println(resultado);
        /*
        primero se hace la suma de i + k=0
        despues se hace la multiplicacion de k*3, la cual da -3
        luego debido a la doble necacion pasa a 3, al cual se le suma el valor de j dando 4
        al comparar el 4 con el cero da false ya que es mayor que cero
        asi que sabiendo que el resutado final es false, se deja de hacer la ultima comprobacion
         */
        int ii = 3, jj = 2, kk = -1;
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
        double x = 1, y = 4, z = 10, PI = 3.1416;
        boolean resultado4 = PI * x * x > y || 2 * PI * x <= z;
        boolean resultado5 = x > 3 && (y == 4 || x + y <= z);
        System.out.println(resultado4);
        System.out.println(resultado5);
/*
la primera de las dos es verdadera ya que aunque la primera parte da false, debido a que la segunda parte esta
unido por un or y es verdadera, la expresion es verdadera

por otro lado, el sgundo enunciado es falso por que todas sus condiciones son falsas
 */


    }
}
