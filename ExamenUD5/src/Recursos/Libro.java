package Recursos;

public class Libro extends RecursoBibliografico {

    private String autor;

    public Libro() {
    }

    public Libro(String autor) {
        this.autor = autor;
    }

    public Libro(String titulo, int anoPublicacion, boolean disponible, String autor) {
        super(titulo, anoPublicacion, disponible);
        this.autor = autor;
    }

    @Override
    public String mostrarInformacion() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anoPublicacion=" + anoPublicacion +
                ", disponible=" + disponible +
                '}';
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String prestar() {
        return "ha sido prestado";
    }

    @Override
    public String devolver() {
        return "ha sido devuelto";
    }

    //la relacion entre prestar y devolver se haria a nivel de base de datos y no en el codigo.

}
