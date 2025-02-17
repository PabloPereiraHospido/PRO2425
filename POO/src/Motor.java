public class Motor {
    private int potencia;
    private String combustible;

    public Motor() {
    }

    public Motor(int potencia, String combustible) {
        this.potencia = potencia;
        this.combustible = combustible;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "potencia=" + potencia +
                ", combustible='" + combustible + '\'' +
                '}';
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
}
