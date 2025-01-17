package UD5.capaNegocio;

public class Cliente {
    private String nombre;
    private int dni;
    private String nif;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        String letras = "TRWAGMYFPDXDNJZSQVHLCKE";
        this.nif = String.valueOf(dni) + letras.charAt(dni % 23);
    }

    public Cliente() {

    }

    public Cliente(String nombre, int dni, String nif) {
        this.nombre = nombre;
        this.dni = dni;
        this.nif = nif;
    }

}
