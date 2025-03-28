package UD4;

import UD5.Alumno;
import UD5.Persona;
import UD5.Profesor;

import java.lang.reflect.Array;
import java.util.*;

public class Teoria4 {
    public static void main(String[] args) {

        //declarar un array

        Integer[] enteros;
        enteros = new Integer[5];


        enteros[1] = 100;

        String alumnos[] = {"Nabil", "Hector"};

        Persona[] personas = new Persona[5];

        Persona[] persona = {new Profesor("Victor"), new Alumno("Nabil"), new Alumno("Hector"), new Alumno("Pablo"), new Alumno("Carla")};

        String[] mensajes = new String[10];
        for (int i = 0; i < mensajes.length; i++) {
            mensajes[i] = "Esta es la posicon " + i;
        }
        for (String s : mensajes) {
            System.out.println(s);
        }
        double tabla1[][] = new double[3][2];
        int tabla2[][] = new int[2][];
        tabla2[0] = new int[2];
        tabla2[1] = new int[3];
        System.out.println("arrays");
        System.out.println(tabla1.length);
        System.out.println(tabla2.length);
        System.out.println(tabla2[0].length);
        System.out.println(tabla2[1].length);

        double matriz1[][] = new double[4][4];
        matriz1[0][0] = 1;
        matriz1[0][1] = 1;
        matriz1[0][2] = 1;
        matriz1[0][3] = 1;
        matriz1[1][0] = 0;
        matriz1[1][1] = 1;
        matriz1[1][2] = 0;
        matriz1[1][3] = 0;
        matriz1[2][0] = 0;
        matriz1[2][1] = 1;
        matriz1[2][2] = 1;
        matriz1[2][3] = 0;
        matriz1[3][0] = 0;
        matriz1[3][1] = 0;
        matriz1[3][2] = 0;
        matriz1[3][3] = 1;


        for (int fila = 0; fila < matriz1.length; fila++) {
            for (int j = 0; j < matriz1[fila].length; j++) {
                System.out.println(matriz1[fila][j] + "");

            }
            System.out.println();
        }
        //almacene e imprime por pantalla al alumnado de este aula

        String aulunmos[][] = new String[4][6];
        aulunmos[0][0] = "pabloPar";
        aulunmos[0][1] = "nabil";
        aulunmos[0][2] = "hector";
        aulunmos[0][3] = "carla";
        aulunmos[0][4] = "diego";
        aulunmos[0][5] = "africa";

        aulunmos[1][0] = "pablo";
        aulunmos[1][1] = "vacio";
        aulunmos[1][2] = "liuber";
        aulunmos[1][3] = "fabian";
        aulunmos[1][4] = "vacio";
        aulunmos[1][5] = "vacio";

        aulunmos[2][0] = "vacio";
        aulunmos[2][1] = "vacio";
        aulunmos[2][2] = "andres";
        aulunmos[2][3] = "vacio";
        aulunmos[2][4] = "vacio";
        aulunmos[2][5] = "vacio";

        aulunmos[3][0] = "manuel";
        aulunmos[3][1] = "vacio";
        aulunmos[3][2] = "fabian";
        aulunmos[3][3] = "ivan";
        aulunmos[3][4] = "vacio";
        aulunmos[3][5] = "cristian";


        for (int fila = 0; fila < aulunmos.length; fila++) {
            for (int j = 0; j < aulunmos[fila].length; j++) {
                System.out.println(aulunmos[fila][j] + "");

            }
            System.out.println();
        }

        Persona aula[][] = new Persona[4][7];
        aula[0][0] = new Profesor("Victor");
        aula[0][1] = new Alumno("pabloPar");
        aula[0][2] = new Alumno("nabil");
        aula[0][3] = new Alumno("hector");
        aula[0][4] = new Alumno("carla");
        aula[0][5] = new Alumno("diego");
        aula[0][6] = new Alumno("africa");


        aula[1][0] = new Alumno("pablo");
        aula[1][1] = new Alumno("vacio");
        aula[1][2] = new Alumno("liuber");
        aula[1][3] = new Alumno("fabian");
        aula[1][4] = new Alumno("vacio");
        aula[1][5] = new Alumno("vacio");


        aula[2][0] = new Alumno("vacio");
        aula[2][1] = new Alumno("vacio");
        aula[2][2] = new Alumno("andres");
        aula[2][3] = new Alumno("vacio");
        aula[2][4] = new Alumno("vacio");
        aula[2][5] = new Alumno("vacio");


        aula[3][0] = new Alumno("manuel");
        aula[3][1] = new Alumno("vacio");
        aula[3][2] = new Alumno("hernan");
        aula[3][3] = new Alumno("ivan");
        aula[3][4] = new Alumno("vacio");
        aula[3][5] = new Alumno("cristian");

        for (int fila = 0; fila < aula.length; fila++) {
            for (int j = 0; j < aula[fila].length; j++) {
                System.out.println(aula[fila][j] + "");

            }
            System.out.println();
        }
        int[] enteros1 = {1, 2};
        Persona vladimir = new Alumno();
        vladimir.setNombre("Vladimir");
        int valor = 10;

        modificador(vladimir, valor, enteros1);
        vladimir.getNombre();
        System.out.println(valor);
        for (int a = 0; a < enteros.length; a++) {
            System.out.println(enteros[a]);

        }

        String nombre[] = {"victor", "manolo", "carla"};
        for (String nombre1 : nombre) {
            System.out.println(nombre1);
        }
        Arrays.sort(nombre);
        for (String nombre2 : nombre) {
            System.out.println(nombre2);
        }
        Arrays.sort(nombre, Collections.reverseOrder());
        for (String nombre3 : nombre) {
            System.out.println(nombre3);
        }
      /* Arrays.sort(personas);
        for (Persona personas1 : persona) {
            System.out.println(personas1);
        }
        Arrays.sort(personas, Collections.reverseOrder());
        for (Persona persona2 : personas) {
            System.out.println(persona2);
        } */


        HashSet<String> conjunto = new HashSet<>();
        conjunto.add("Lunes");
        conjunto.add("Martes");
        conjunto.add("Miercoles");
        conjunto.add("Jueves");
        conjunto.add("Viernes");
        conjunto.add("Sabado");
        conjunto.add("Sabado");
        conjunto.add("Domingo");

        Iterator w = conjunto.iterator();
        while (w.hasNext()) {
            System.out.println(w.next());
        }
        /*
        crear un hashset de dos fromas:
        1. con un iterator que muestre ademas una enumeracion
        2.visualizarlo entero,con cada elemento seguido de comas
         */
        HashSet<String> forma1 = new HashSet<>();
        forma1.add("manzanas");
        forma1.add("peras");
        forma1.add("limones");
        Iterator ww = forma1.iterator();
        while (ww.hasNext()) {
            int n = 1;
            System.out.println(n + "." + ww.next());
            n++;
        }
        System.out.println("forma 2");
        System.out.println(forma1);

        Set articulitos = new HashSet<>();

        Articulito pera = new Articulito("pera");
        articulitos.add(pera);
        System.out.println(articulitos);
        Articulito manzana=new Articulito("manzana");
        articulitos.add(manzana);
        System.out.println(articulitos);
        articulitos.remove(manzana);
        System.out.println(articulitos);

    }

    public static void modificador(Persona vlad, int diez, int[] enteros1) {
        vlad.setNombre("Vlad");
        int i = diez * 10;
        for (int a = 0; a < enteros1.length; a++) {
            enteros1[a] *= 2;
        }

    }

    public static void listas() {
        ArrayList<String> listaArray = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        ArrayList<String> listaArray2 = new ArrayList();
        listaArray2.add("a");
        System.out.println(listaArray2.get(0));
        listaArray2.remove(0);
        for (String e : listaArray) {
            System.out.println(e);
        }
        for (int i = 0; i < listaArray.size(); i++) {
            System.out.println(i);
        }
        ArrayList<String> subLista = new ArrayList<>(listaArray.subList(1, 3));
        for (String e : subLista) {
            System.out.println(e);
            ArrayList<Integer> listaEntetros = new ArrayList<>(Arrays.asList(1, 2, 4, 6, 8, 8));
            System.out.println("indez de 8:" + listaEntetros.indexOf(8));
            Collections.sort(listaEntetros);
            System.out.println("indice de 8:" + Collections.binarySearch(listaEntetros, 8));
            System.out.println(listaEntetros.contains(8));
        }

        //declare e inicialice una lista de personas que ordene por apellido a todos los alummnos de la clase, el orden de insercion
// es el orden por el que estamos sentados

        ArrayList<Persona> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(new Alumno("Pablo", "Parapar"));
        listaAlumnos.add(new Alumno("Nabil", " ait Bouihia"));
        listaAlumnos.add(new Alumno("Hector", " Trabado"));
        listaAlumnos.add(new Alumno("Carla", " Neira"));
        listaAlumnos.add(new Alumno("Diego", " Ferreiros"));
        listaAlumnos.add(new Alumno("Africa", " Mendez"));
        listaAlumnos.add(new Alumno("Pablo", " Pereira"));
        listaAlumnos.add(new Alumno("Liuber", " Diaz"));
        listaAlumnos.add(new Alumno("Fabian", " Alvarez"));
        listaAlumnos.add(new Alumno("Andres", " Lopez"));
        listaAlumnos.add(new Alumno("Manuel", " Mendez"));
        listaAlumnos.add(new Alumno("Hernan", " Coronel"));
        listaAlumnos.add(new Alumno("Ivan", " Diaz"));
        listaAlumnos.add(new Alumno("Cristian", " Rodrigez"));

        for (Persona a : listaAlumnos) {
            System.out.println(a);
        }


        ArrayList<Persona> colaCharcuteria = new ArrayList<>();

        colaCharcuteria.add(new Profesor("Victor", "Blanco"));
        colaCharcuteria.add(new Alumno("Manuel", "Mendez"));
        colaCharcuteria.add(new Alumno("Pablo", "Parapar"));


    }

    public static void colas() {

        /*
        crear tres colas. el as dos primeras almacenaremos medio millar de numeros generados aleatoriamente
        entre el 0 y50.luego recorreremos simultaneamente ambas colas y almacenaremos en la tercera aquellos
        numeros que coinciden en valor y posicion
         */

        LinkedList<Random> cola1 = new LinkedList<>();
        LinkedList<Random> cola2 = new LinkedList<>();
        LinkedList<Random> cola3 = new LinkedList<>();
        for (int i = 0; i < 500; i++) {
            cola1.add(new Random());
            cola2.add(new Random());
            System.out.println(cola1);
            System.out.println(cola2);

        }
    }
}
