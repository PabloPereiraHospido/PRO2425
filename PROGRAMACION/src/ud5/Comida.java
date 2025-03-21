package ud5;

/**
 * @author pabloPereira
 */

public interface Comida {
    enum PlatoPrincipal implements Comida {
        BACALAO, RAXO, PULPO
    }

    enum Postre implements Comida {
        HELADO, TARTA
    }

}
