package UD2;

public class Boletin21 {
    public static void main (String [] ars){
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
        boolean resultado2 =ii == 3 || jj <= 2 && kk > 0;
        System.out.println(resultado2);
                



    }
}
