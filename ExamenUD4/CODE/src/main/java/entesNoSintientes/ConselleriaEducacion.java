package entesNoSintientes;

public class ConselleriaEducacion {
    private String responsable;
    private String nombre;
    private Integer presupuestoAnual;

    public ConselleriaEducacion() {
    }

    public ConselleriaEducacion(String responsable, String nombre, Integer presupuestoAnual) {
        this.responsable = responsable;
        this.nombre = nombre;
        this.presupuestoAnual = presupuestoAnual;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPresupuestoAnual() {
        return presupuestoAnual;
    }

    public void setPresupuestoAnual(Integer presupuestoAnual) {
        this.presupuestoAnual = presupuestoAnual;
    }

    @Override
    public String toString() {
        return "ConselleriaEducacion{" +
                "responsable='" + responsable + '\'' +
                ", nombre='" + nombre + '\'' +
                ", presupuestoAnual=" + presupuestoAnual +
                '}';
    }
}
