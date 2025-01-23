package UD5;

public abstract class FiguraGeometrica {
    private final String nombre;
    abstract public double getArea();


    private boolean mayorQue(FiguraGeometrica figura){
        return this.getArea()>figura.getArea();
    }

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
