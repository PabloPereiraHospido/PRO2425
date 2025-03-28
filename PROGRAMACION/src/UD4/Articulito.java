package UD4;

import java.util.Objects;

public class Articulito {
    protected String nombre;
    protected int cantidad;

    public Articulito() {
    }

    public Articulito(String nombre) {
        this.nombre = nombre;
    }

    public Articulito(int cantidad) {
        this.cantidad = cantidad;
    }

    public Articulito(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Articulito{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Articulito that = (Articulito) o;
        return Objects.equals(getNombre(), that.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNombre());
    }
}
