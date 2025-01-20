package UD5.capaNegocio;

public class Articulo {
    private int codigo;
    private String descripcion;
    private int precio;
    private int precioConIva;
    private final double IVA = 0.21;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
        this.precioConIva = (int) (precio + precio * IVA);
    }

    public int getPrecioConIva() {
        return precioConIva;
    }

    public double getIVA() {
        return IVA;
    }

    public Articulo() {
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "codigo=" + codigo +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", precioConIva=" + precioConIva +
                ", IVA=" + IVA +
                '}';
    }
}
