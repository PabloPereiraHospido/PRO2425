package UD5;

public class Teoria4 {
    public static void main(String[] args) {
        System.out.println(Semaforo.AMBAR.ordinal());

        Semaforo color = Semaforo.ROJO;
        System.out.println("El color del semáforo es " + color);
        switch (color) {
            case ROJO:
                color = Semaforo.VERDE;
                break;
            case AMBAR:
                color = Semaforo.ROJO;
                break;
            case VERDE:
                color = Semaforo.AMBAR;
                break;
        }
        Numero n= Numero.DOS;
        System.out.println(n.getValue());
        Comida comida=Comida.PlatoPrincipal.BACALAO;
        comida=Comida.Postre.HELADO;
    }
}
