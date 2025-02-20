package Recursos;

public abstract class RecursoBibliografico implements Prestable {
    protected String titulo;
    protected int anoPublicacion;
    protected boolean disponible;

    public RecursoBibliografico() {
    }

    public RecursoBibliografico(String titulo, int anoPublicacion, boolean disponible) {
        this.titulo = titulo;
        this.anoPublicacion = anoPublicacion;
        this.disponible = disponible;
    }


    public String mostrarInformacion() {
        return "Recursos.RecursoBibliografico{" +
                "titulo='" + titulo + '\'' +
                ", anoPublicacion=" + anoPublicacion +
                ", disponible=" + disponible +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
