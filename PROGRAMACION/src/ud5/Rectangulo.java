package ud5;

public class Rectangulo extends FiguraGeometrica {
    private final double base;
    double altura;

    public Rectangulo(double base, double altura) {
        super("Rectángulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return base * altura;
    }
}
