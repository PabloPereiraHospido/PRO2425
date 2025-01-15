package UD5;


import java.security.InvalidParameterException;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private String nif;
    private String fechaNacimiento;
    private String cuentaBancaria;
    private String direccionPostal;
    private String email;
    private int telefono;
    private String grupoSanguineo;
    private Sexo sexo;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;

    }

    public int getEdad() {

        return edad;
    }

    public int getDni() {

        return dni;
    }

    public String getNif() {
        return nif;
    }

    public String getFechaNacimiento() {

        return fechaNacimiento;
    }

    public String getCuentaBancaria() {

        return cuentaBancaria;
    }

    public String getDireccionPostal() {

        return direccionPostal;
    }

    public String getEmail() {

        return email;
    }

    public int getTelefono() {

        return telefono;
    }

    public String getGrupoSanguineo() {

        return grupoSanguineo;
    }

    public Sexo getSexo() {

        return sexo;
    }

    public void setNombre(String nombre) {
        if (nombre.length() <= 10 && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            throw new InvalidParameterException("El nombre no debe superar los 10 carácteres");
        }
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(int dni) {
        String letras = "TRWAGMYFPDXDNJZSQVHLCKE";
        this.dni = dni;
        nif = String.valueOf(dni) + letras.charAt(dni % 23);
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public void setDireccionPostal(String direccionPostal) {
        this.direccionPostal = direccionPostal;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
public Persona(){

}
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Persona(String nombre, String apellido, int edad,int dni, String nif,String fechaNacimiento, String cuentaBancaria,String direccionPostal,String email,Integer telefono,String grupoSanguineo, Sexo sexo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad=edad;
        this.dni=dni;
        this.nif=nif;
        this.fechaNacimiento=fechaNacimiento;
        this.cuentaBancaria=cuentaBancaria;
        this.direccionPostal=direccionPostal;
        this.email=email;
        this.telefono=telefono;
        this.grupoSanguineo=grupoSanguineo;
        this.sexo=sexo;
    }
}
