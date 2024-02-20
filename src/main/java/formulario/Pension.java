package src.main.java.formulario;

public enum Pension {

    COLFONDOS("Colfondos"),
    COLPENSIONES("Colpensiones"),
    OLD_MUTUAL("Old Mutual"),
    PORVENIR("Porvenir"),
    PROTECCION("Proteccion");

    private final String pension;

    Pension(String pension) {
        this.pension = pension;
    }

    public String getPension() {
        return pension;
    }
}
