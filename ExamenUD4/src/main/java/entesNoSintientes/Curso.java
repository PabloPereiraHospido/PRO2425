package entesNoSintientes;

public class Curso  extends CentroEducativo { // un curso pertenece a un centro educativo, por eso la relacion de herencia
    private Integer estudiantes;

    public Curso(Integer estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Integer getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Integer estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "estudiantes=" + estudiantes +
                '}';
    }
}
