package UD4;

import UD5.Alumno;
import UD5.Persona;
import UD5.Profesor;

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


    }
}
