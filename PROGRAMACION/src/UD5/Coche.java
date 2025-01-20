package UD5;

import java.util.Date;

public class Coche {

    private String marca;
    private String modelo;
    private int anho;
    private double precio;
    private String color;
    private String matricula;
    private int numeroDePuertas;
    private String tipoDeMotor;
    private double cilindrada;
    private int potencia;
    private double consumo;
    private String transmision;
    private String traccion;
    private double capacidadDeposito;
    private int autonomia;
    private double longitud;
    private double anchura;
    private double altura;
    private int peso;
    private int capacidadMaletero;
    private int airbags;
    private String climatizacion;
    private  String sistemaDeSonido;
    private boolean pantallaTactil;
    private boolean navegadorGPS;
    private boolean camaraTrasera;
    private boolean asistenciaDeAparcamiento;
    private boolean sensoresDeProximidad;
    private boolean farosLED;
    private boolean techoSolar;
    private boolean controlDeCruzero;
    private boolean asientosCalefactables;
    private boolean sistemaAntibloqueo;
    private boolean controlDeEstabilidad;
    private boolean detectorDeColision;
    private boolean asistenciaDeCarril;
    private boolean frenadoAutonomo;
    private int kilometraje;
    private Date ultimaRevision;
    private double nivelDeAceite;
    private String estadoDeNeumaticos;
    private int numeroDeDuenosAnteriores;
    private String tipoDeLlanta;
    private boolean pegatinas;
    private boolean alarmaPersonalizada;
    private String modificaciones;
    private int capacidadBateria;
    private double tiempoDeCarga;
    private String tipoDeConector;
    private boolean modoEcologico;


    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAnho(){
        return anho;
    }
    public double getPrecio(){
        return precio;
    }
    public String getColor(){
        return color;
    }
    public String getMatricula(){
        return matricula;
    }
    public int getNumeroDePuertas(){
        return numeroDePuertas;
    }
    public String getTipoDeMotor(){
        return tipoDeMotor;
    }
    public double getCilindrada(){
        return cilindrada;
    }
    public int getPotencia(){
        return potencia;
    }
    public double getConsumo(){
        return consumo;
    }
    public String getTransmision(){
        return transmision;
    }
    public String getTraccion(){
        return traccion;
    }
    public double getCapacidadDeposito(){
        return capacidadDeposito;
    }
    public int getAutonomia(){
        return autonomia;
    }
    public double getLongitud(){
        return longitud;
    }
    public double getAnchura(){
        return anchura;
    }
    public double getAltura(){
        return altura;
    }
    public int getPeso(){
        return peso;
    }
    public int getCapacidadMaletero(){
        return peso;
    }
    public int getAirbags(){
        return airbags;
    }
    public String getClimatizacion(){
        return climatizacion;
    }
    public String getSistemaDeSonido(){
        return sistemaDeSonido;
    }
    public boolean getPantallaTctil(){
        return pantallaTactil;
    }
    public boolean getNavegadorGPS(){
        return navegadorGPS;
    }
    public boolean getCamaraTrasera(){
        return camaraTrasera;
    }
    public boolean getAsistenciaDeAparcamiento(){
        return asistenciaDeAparcamiento;
    }
    public boolean getSensoresDeProximidad(){
        return sensoresDeProximidad;
    }
    public boolean getFarosLED(){
        return farosLED;
    }
    public boolean getTechoSolar(){
        return techoSolar;
    }
    public boolean getControlDeCrucero(){
        return controlDeCruzero;
    }
    public boolean getAsientosCalefactables(){
        return asientosCalefactables;
    }
    public boolean getSistemaAntibloqueo(){
        return sistemaAntibloqueo;
    }
    public boolean getControlDeEstabilidad(){
        return controlDeEstabilidad;
    }
    public boolean getDetectorDeColision(){
        return detectorDeColision;
    }
    public boolean getAsistencaDeCarril(){
        return asistenciaDeCarril;
    }
    public boolean getFrenadoAutonomo(){
        return frenadoAutonomo;
    }
    public int getKilometraje(){
        return kilometraje;
    }
    public Date getUltimaRevision(){
        return ultimaRevision;
    }
    public double getNivelDeAceite(){
        return nivelDeAceite;
    }
    public String getEstadoDeNeumaticos(){
        return estadoDeNeumaticos;
    }
    public int getNumeroDeDuenosAnteriores(){
        return numeroDeDuenosAnteriores;
    }
    public String getTipoDeLlanta(){
        return tipoDeLlanta;
    }
    public boolean getPegatinas(){
        return pegatinas;
    }
    public boolean getAlarmaPersonalizada(){
        return alarmaPersonalizada;
    }
    public String getModificaciones(){
        return modificaciones;
    }
    public int getCapacidadBateria(){
        return capacidadBateria;
    }
    public double getTiempoDeCarga(){
        return tiempoDeCarga;
    }
    public String getTipoDeConector(){
        return tipoDeConector;
    }
    public boolean getModoEcologico(){
        return modoEcologico;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public Coche(boolean sistemaAntibloqueo, boolean controlDeEstabilidad, boolean detectorDeColision, boolean asistenciaDeCarril, boolean frenadoAutonomo) {
        this.sistemaAntibloqueo = sistemaAntibloqueo;
        this.controlDeEstabilidad = controlDeEstabilidad;
        this.detectorDeColision = detectorDeColision;
        this.asistenciaDeCarril = asistenciaDeCarril;
        this.frenadoAutonomo = frenadoAutonomo;
    }

    public Coche(String marca, int capacidadBateria, double tiempoDeCarga, String tipoDeConector, boolean modoEcologico) {
        this.marca = marca;
        this.capacidadBateria = capacidadBateria;
        this.tiempoDeCarga = tiempoDeCarga;
        this.tipoDeConector = tipoDeConector;
        this.modoEcologico = modoEcologico;
    }

    public Coche(String marca, String tipoDeLlanta, boolean pegatinas, boolean alarmaPersonalizada, String modificaciones) {
        this.marca = marca;
        this.tipoDeLlanta = tipoDeLlanta;
        this.pegatinas = pegatinas;
        this.alarmaPersonalizada = alarmaPersonalizada;
        this.modificaciones = modificaciones;
    }

    public Coche(String marca, int kilometraje, Date ultimaRevision, double nivelDeAceite, String estadoDeNeumaticos, int numeroDeDuenosAnteriores) {
        this.marca = marca;
        this.kilometraje = kilometraje;
        this.ultimaRevision = ultimaRevision;
        this.nivelDeAceite = nivelDeAceite;
        this.estadoDeNeumaticos = estadoDeNeumaticos;
        this.numeroDeDuenosAnteriores = numeroDeDuenosAnteriores;
    }

    public Coche(int airbags, String climatizacion, String sistemaDeSonido, boolean pantallaTactil, boolean navegadorGPS, boolean camaraTrasera, boolean asistenciaDeAparcamiento, boolean sensoresDeProximidad, boolean farosLED, boolean techoSolar, boolean controlDeCruzero, boolean asientosCalefactables) {
        this.airbags = airbags;
        this.climatizacion = climatizacion;
        this.sistemaDeSonido = sistemaDeSonido;
        this.pantallaTactil = pantallaTactil;
        this.navegadorGPS = navegadorGPS;
        this.camaraTrasera = camaraTrasera;
        this.asistenciaDeAparcamiento = asistenciaDeAparcamiento;
        this.sensoresDeProximidad = sensoresDeProximidad;
        this.farosLED = farosLED;
        this.techoSolar = techoSolar;
        this.controlDeCruzero = controlDeCruzero;
        this.asientosCalefactables = asientosCalefactables;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Coche(String marca, String modelo, int anho, double precio, String color, String matricula, int numeroDePuertas) {
        this.marca = marca;
        this.modelo = modelo;
        this.anho = anho;
        this.precio = precio;
        this.color = color;
        this.matricula = matricula;
        this.numeroDePuertas = numeroDePuertas;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public boolean isModoEcologico() {
        return modoEcologico;
    }

    public void setModoEcologico(boolean modoEcologico) {
        this.modoEcologico = modoEcologico;
    }

    public void setTipoDeConector(String tipoDeConector) {
        this.tipoDeConector = tipoDeConector;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public void setTiempoDeCarga(double tiempoDeCarga) {
        this.tiempoDeCarga = tiempoDeCarga;
    }

    public void setModificaciones(String modificaciones) {
        this.modificaciones = modificaciones;
    }

    public boolean isPegatinas() {
        return pegatinas;
    }

    public void setPegatinas(boolean pegatinas) {
        this.pegatinas = pegatinas;
    }

    public boolean isAlarmaPersonalizada() {
        return alarmaPersonalizada;
    }

    public void setAlarmaPersonalizada(boolean alarmaPersonalizada) {
        this.alarmaPersonalizada = alarmaPersonalizada;
    }

    public void setTipoDeLlanta(String tipoDeLlanta) {
        this.tipoDeLlanta = tipoDeLlanta;
    }

    public void setNumeroDeDuenosAnteriores(int numeroDeDuenosAnteriores) {
        this.numeroDeDuenosAnteriores = numeroDeDuenosAnteriores;
    }

    public void setEstadoDeNeumaticos(String estadoDeNeumaticos) {
        this.estadoDeNeumaticos = estadoDeNeumaticos;
    }

    public void setNivelDeAceite(double nivelDeAceite) {
        this.nivelDeAceite = nivelDeAceite;
    }

    public void setUltimaRevision(Date ultimaRevision) {
        this.ultimaRevision = ultimaRevision;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public boolean isFrenadoAutonomo() {
        return frenadoAutonomo;
    }

    public void setFrenadoAutonomo(boolean frenadoAutonomo) {
        this.frenadoAutonomo = frenadoAutonomo;
    }

    public boolean isAsistenciaDeCarril() {
        return asistenciaDeCarril;
    }

    public void setAsistenciaDeCarril(boolean asistenciaDeCarril) {
        this.asistenciaDeCarril = asistenciaDeCarril;
    }

    public boolean isDetectorDeColision() {
        return detectorDeColision;
    }

    public void setDetectorDeColision(boolean detectorDeColision) {
        this.detectorDeColision = detectorDeColision;
    }

    public boolean isControlDeEstabilidad() {
        return controlDeEstabilidad;
    }

    public void setControlDeEstabilidad(boolean controlDeEstabilidad) {
        this.controlDeEstabilidad = controlDeEstabilidad;
    }

    public boolean isSistemaAntibloqueo() {
        return sistemaAntibloqueo;
    }

    public void setSistemaAntibloqueo(boolean sistemaAntibloqueo) {
        this.sistemaAntibloqueo = sistemaAntibloqueo;
    }

    public boolean isAsientosCalefactables() {
        return asientosCalefactables;
    }

    public void setAsientosCalefactables(boolean asientosCalefactables) {
        this.asientosCalefactables = asientosCalefactables;
    }

    public boolean isControlDeCruzero() {
        return controlDeCruzero;
    }

    public void setControlDeCruzero(boolean controlDeCruzero) {
        this.controlDeCruzero = controlDeCruzero;
    }

    public boolean isTechoSolar() {
        return techoSolar;
    }

    public void setTechoSolar(boolean techoSolar) {
        this.techoSolar = techoSolar;
    }

    public boolean isFarosLED() {
        return farosLED;
    }

    public void setFarosLED(boolean farosLED) {
        this.farosLED = farosLED;
    }

    public boolean isSensoresDeProximidad() {
        return sensoresDeProximidad;
    }

    public void setSensoresDeProximidad(boolean sensoresDeProximidad) {
        this.sensoresDeProximidad = sensoresDeProximidad;
    }

    public boolean isAsistenciaDeAparcamiento() {
        return asistenciaDeAparcamiento;
    }

    public void setAsistenciaDeAparcamiento(boolean asistenciaDeAparcamiento) {
        this.asistenciaDeAparcamiento = asistenciaDeAparcamiento;
    }

    public boolean isCamaraTrasera() {
        return camaraTrasera;
    }

    public void setCamaraTrasera(boolean camaraTrasera) {
        this.camaraTrasera = camaraTrasera;
    }

    public boolean isNavegadorGPS() {
        return navegadorGPS;
    }

    public void setNavegadorGPS(boolean navegadorGPS) {
        this.navegadorGPS = navegadorGPS;
    }

    public boolean isPantallaTactil() {
        return pantallaTactil;
    }

    public void setPantallaTactil(boolean pantallaTactil) {
        this.pantallaTactil = pantallaTactil;
    }

    public void setSistemaDeSonido(String sistemaDeSonido) {
        this.sistemaDeSonido = sistemaDeSonido;
    }

    public void setClimatizacion(String climatizacion) {
        this.climatizacion = climatizacion;
    }

    public void setAirbags(int airbags) {
        this.airbags = airbags;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public void setCapacidadDeposito(double capacidadDeposito) {
        this.capacidadDeposito = capacidadDeposito;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    public void setTipoDeMotor(String tipoDeMotor) {
        this.tipoDeMotor = tipoDeMotor;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anho=" + anho +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", matricula='" + matricula + '\'' +
                ", numeroDePuertas=" + numeroDePuertas +
                ", tipoDeMotor='" + tipoDeMotor + '\'' +
                ", cilindrada=" + cilindrada +
                ", potencia=" + potencia +
                ", consumo=" + consumo +
                ", transmision='" + transmision + '\'' +
                ", traccion='" + traccion + '\'' +
                ", capacidadDeposito=" + capacidadDeposito +
                ", autonomia=" + autonomia +
                ", longitud=" + longitud +
                ", anchura=" + anchura +
                ", altura=" + altura +
                ", peso=" + peso +
                ", capacidadMaletero=" + capacidadMaletero +
                ", airbags=" + airbags +
                ", climatizacion='" + climatizacion + '\'' +
                ", sistemaDeSonido='" + sistemaDeSonido + '\'' +
                ", pantallaTactil=" + pantallaTactil +
                ", navegadorGPS=" + navegadorGPS +
                ", camaraTrasera=" + camaraTrasera +
                ", asistenciaDeAparcamiento=" + asistenciaDeAparcamiento +
                ", sensoresDeProximidad=" + sensoresDeProximidad +
                ", farosLED=" + farosLED +
                ", techoSolar=" + techoSolar +
                ", controlDeCruzero=" + controlDeCruzero +
                ", asientosCalefactables=" + asientosCalefactables +
                ", sistemaAntibloqueo=" + sistemaAntibloqueo +
                ", controlDeEstabilidad=" + controlDeEstabilidad +
                ", detectorDeColision=" + detectorDeColision +
                ", asistenciaDeCarril=" + asistenciaDeCarril +
                ", frenadoAutonomo=" + frenadoAutonomo +
                ", kilometraje=" + kilometraje +
                ", ultimaRevision=" + ultimaRevision +
                ", nivelDeAceite=" + nivelDeAceite +
                ", estadoDeNeumaticos='" + estadoDeNeumaticos + '\'' +
                ", numeroDeDuenosAnteriores=" + numeroDeDuenosAnteriores +
                ", tipoDeLlanta='" + tipoDeLlanta + '\'' +
                ", pegatinas=" + pegatinas +
                ", alarmaPersonalizada=" + alarmaPersonalizada +
                ", modificaciones='" + modificaciones + '\'' +
                ", capacidadBateria=" + capacidadBateria +
                ", tiempoDeCarga=" + tiempoDeCarga +
                ", tipoDeConector='" + tipoDeConector + '\'' +
                ", modoEcologico=" + modoEcologico +
                '}';
    }
}


