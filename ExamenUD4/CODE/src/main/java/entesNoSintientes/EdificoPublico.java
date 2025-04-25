package entesNoSintientes;

public class EdificoPublico {
    private String codigoIdentificador;
    private String nombre;
    private String direccion;
    private Integer anoFundacion;

    public EdificoPublico() {
    }

    public EdificoPublico(String codigoIdentificador, String nombre, String direccion, Integer anoFundacion) {
        this.codigoIdentificador = codigoIdentificador;
        this.nombre = nombre;
        this.direccion = direccion;
        this.anoFundacion = anoFundacion;
    }

    public String getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(String codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getAnoFundacion() {
        return anoFundacion;
    }

    public void setAnoFundacion(Integer anoFundacion) {
        this.anoFundacion = anoFundacion;
    }

    @Override
    public String toString() {
        return "entesNoSintientes.EdificoPublico{" +
                "codigoIdentificador='" + codigoIdentificador + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", anoFundacion=" + anoFundacion +
                '}';
    }
}
