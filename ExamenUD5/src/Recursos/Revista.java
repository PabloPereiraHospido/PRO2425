package Recursos;

public class Revista extends RecursoBibliografico {

    private int numero;

    public Revista() {
    }


    public Revista(String titulo, int anoPublicacion, boolean disponible, int numero) {
        super(titulo, anoPublicacion, disponible);
        this.numero = numero;
    }


    @Override
    public String mostrarInformacion() {
        return "Revista{" +
                "numero=" + numero +
                ", titulo='" + titulo + '\'' +
                ", anoPublicacion=" + anoPublicacion +
                ", disponible=" + disponible +
                '}';
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String prestar() {
        return "";
    }

    @Override
    public String devolver() {
        return "";
    }
}
