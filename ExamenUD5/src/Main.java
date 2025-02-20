import Humanos.Artista;
import Humanos.Autor;
import Humanos.Usuario;
import Recursos.Cd;
import Recursos.Libro;

public class Main {
    public static void main(String[] args) {

        Artista vladimir = new Artista();

        vladimir.setNumpublicaciones(1);
        vladimir.setDomicilio("Sin techo");
        vladimir.setEdad(18);
        vladimir.setNombre("Vladimir");
        vladimir.setPublicaciones("rapidín");
        vladimir.setDni("69696969X");

        System.out.println(vladimir);

        Cd rapidin = new Cd();
        rapidin.setAnoPublicacion(2025);
        rapidin.setTitulo("Rapidin");
        rapidin.setArtista("vladimir");
        rapidin.prestar();
        rapidin.devolver();

        System.out.println(rapidin);

        Autor victor = new Autor();
        victor.setNombre("Victor");
        victor.setEdad(30);
        victor.setNumLibros(1);
        victor.setLibros("Como aprender java en 15 dias");
        victor.setDomicilio("Muralla Romana");
        victor.setDni("2345678V");

        System.out.println(victor);

        Libro java = new Libro();

        java.setTitulo("Como aprender java en 15 dias");
        java.setAnoPublicacion(2020);
        java.setAutor("victor");
        java.prestar();
        java.devolver();



        System.out.println(java);


        Usuario ivan = new Usuario();

        ivan.setNombre("Ivan");
        ivan.setDni("123456I");
        ivan.setEdad(20);
        ivan.setNomPrestado("rapidin");
        ivan.setNumAfiliado(12345676);
        ivan.setRenovacionAfiliado("12/31/2026");
        ivan.setDomicilio("Villalba");

        System.out.println(ivan);


        //la relacion entre prestar y devolver se realiza a nivel de base de datos, no en el codigo.
    }
}