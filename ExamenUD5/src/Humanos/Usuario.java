package Humanos;


public class Usuario extends Persona {

    private double numAfiliado;
    private boolean objetoPrestado;
    private String nomPrestado;
    private boolean devuelto;
    private String renovacionAfiliado;

    public Usuario() {
    }

    public Usuario(String nombre, int edad, String dni, String domicilio, double numAfiliado, boolean objetoPrestado, String nomPrestado, boolean devuelto, String renovacionAfiliado) {
        super(nombre, edad, dni, domicilio);
        this.numAfiliado = numAfiliado;
        this.objetoPrestado = objetoPrestado;
        this.nomPrestado = nomPrestado;
        this.devuelto = devuelto;
        this.renovacionAfiliado = renovacionAfiliado;
    }

    public Usuario(double numAfiliado, boolean objetoPrestado, String nomPrestado, boolean devuelto, String renovacionAfiliado) {
        this.numAfiliado = numAfiliado;
        this.objetoPrestado = objetoPrestado;
        this.nomPrestado = nomPrestado;
        this.devuelto = devuelto;
        this.renovacionAfiliado = renovacionAfiliado;
    }




    @Override
    public String toString() {
        return "Usuario{" +
                "renovacionAfiliado=" + renovacionAfiliado +
                ", numAfiliado=" + numAfiliado +
                ", objetoPrestado=" + objetoPrestado +
                ", nomPrestado='" + nomPrestado + '\'' +
                ", devuelto=" + devuelto +
                ", domicilio='" + domicilio + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public double getNumAfiliado() {
        return numAfiliado;
    }

    public void setNumAfiliado(double numAfiliado) {
        this.numAfiliado = numAfiliado;
    }

    public boolean isObjetoPrestado() {
        return objetoPrestado;
    }

    public void setObjetoPrestado(boolean objetoPrestado) {
        this.objetoPrestado = objetoPrestado;
    }

    public String getNomPrestado() {
        return nomPrestado;
    }

    public void setNomPrestado(String nomPrestado) {
        this.nomPrestado = nomPrestado;
    }

    public boolean isDevuelto() {
        return devuelto;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }

    public String getRenovacionAfiliado() {
        return renovacionAfiliado;
    }

    public void setRenovacionAfiliado(String renovacionAfiliado) {
        this.renovacionAfiliado = renovacionAfiliado;
    }
}

