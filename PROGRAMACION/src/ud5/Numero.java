package ud5;

public enum Numero {
    UNO, DOS, TRES, CUATRO, CINCO, SEIS;

    int getValue() {
        return ordinal() + 1;
    }

}
