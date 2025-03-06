package UD5;

public interface Comida {
    enum PlatoPrincipal implements Comida {
        BACALAO, RAXO, PULPO
    }

    enum Postre implements Comida {
        HELADO, TARTA
    }

}
