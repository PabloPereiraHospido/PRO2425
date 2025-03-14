package ud5;

public abstract class FiguraGeometrica {
    private final String nombre;

    public abstract double getArea();


    private boolean mayorQue(FiguraGeometrica figura) {
        return this.getArea() > figura.getArea();
    }

    protected FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
