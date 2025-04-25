package entesNoSintientes;

public class CentroEducativo extends EdificoPublico { // los centros educativos son un tipo de edificio publico
    private enum etapaEducativa{primaria,ESO,bach,cicloFormativo}
    private Integer estudiantesMatriculados;

    public CentroEducativo() {
    }

    public CentroEducativo(String codigoIdentificador, String nombre, String direccion, Integer anoFundacion, Integer estudiantesMatriculados) {
        super(codigoIdentificador, nombre, direccion, anoFundacion);
        this.estudiantesMatriculados = estudiantesMatriculados;
    }

    public Integer getEstudiantesMatriculados() {
        return estudiantesMatriculados;
    }

    public void setEstudiantesMatriculados(Integer estudiantesMatriculados) {
        this.estudiantesMatriculados = estudiantesMatriculados;
    }

    @Override
    public String toString() {
        return "CentroEducativo{" +
                "estudiantesMatriculados=" + estudiantesMatriculados +
                '}';
    }
}
