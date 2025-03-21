package ud5;

/**
 * @author pabloPereira
 */

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
        return "FiguraGeometrica{"
                +
                "nombre='"
                +
                nombre
                +
                '\''
                +
                '}';
    }
}
