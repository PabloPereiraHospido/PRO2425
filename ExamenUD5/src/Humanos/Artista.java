package Humanos;

public class Artista extends Persona {

    private int numpublicaciones;
    private String publicaciones;

    public Artista() {
    }

    public Artista(String nombre, int edad, String dni, String domicilio, int numpublicaciones, String publicaciones) {
        super(nombre, edad, dni, domicilio);
        this.numpublicaciones = numpublicaciones;
        this.publicaciones = publicaciones;
    }


    @Override
    public String toString() {
        return "Artista{" +
                "publicaciones='" + publicaciones + '\'' +
                ", numpublicaciones=" + numpublicaciones +
                ", domicilio='" + domicilio + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }


    public int getNumpublicaciones() {
        return numpublicaciones;
    }

    public void setNumpublicaciones(int numpublicaciones) {
        this.numpublicaciones = numpublicaciones;
    }

    public String getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(String publicaciones) {
        this.publicaciones = publicaciones;
    }
}

