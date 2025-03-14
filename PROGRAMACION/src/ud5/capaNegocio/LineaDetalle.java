package ud5.capaNegocio;

public class LineaDetalle {
    private Integer unidadesVendidas;
    private double precioUnitario;
    private Integer precioTotal;

    public Integer getUnidadesVendidas() {
        return unidadesVendidas;
    }

    public void setUnidadesVendidas(Integer unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Integer getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Integer precioTotal) {
        this.precioTotal = precioTotal;
    }

    public LineaDetalle(Integer unidadesVendidas, double precioUnitario, Integer precioTotal) {
        this.unidadesVendidas = unidadesVendidas;
        this.precioUnitario = precioUnitario;
        this.precioTotal = precioTotal;
    }

    public LineaDetalle() {
    }

    @Override
    public String toString() {
        return "LineaDetalle{" +
                "unidadesVendidas=" + unidadesVendidas +
                ", precioUnitario=" + precioUnitario +
                ", precioTotal=" + precioTotal +
                '}';
    }

}
