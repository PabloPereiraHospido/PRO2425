package Recursos;

public class Cd extends RecursoBibliografico {
    private String artista;

    public Cd() {
    }

    public Cd(String titulo, int anoPublicacion, boolean disponible, String artista) {
        super(titulo, anoPublicacion, disponible);
        this.artista = artista;
    }

    @Override
    public String mostrarInformacion() {
        return "Cd{" +
                "artista='" + artista + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anoPublicacion=" + anoPublicacion +
                ", disponible=" + disponible +
                '}';
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
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
