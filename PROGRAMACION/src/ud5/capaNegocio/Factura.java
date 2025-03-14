package ud5.capaNegocio;

public class Factura {
    private static int contador = 0;
    private final Integer ID;
    private String descripcion;
    private double importe;

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Factura.contador = contador;
    }

    public Integer getID() {
        return ID;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Factura(String descripcion, double importe) {
        this.ID = ++contador;
        this.descripcion = descripcion;
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "ID=" + ID +
                ", descripcion='" + descripcion + '\'' +
                ", importe=" + importe +
                '}';
    }
}
