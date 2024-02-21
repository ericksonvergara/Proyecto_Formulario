package src.main.java.formulario.enums;

public enum Cesantias {
    PORVENIR("Porvenir"),
    COLFONDOS("Colfondos"),
    PROTECCION("Protección"),
    SKANDIA("Skandia"),
    FNA("Fondo Nacional del Ahorro");

    private final String cesantias;

    Cesantias(String cesantias) {
        this.cesantias = cesantias;
    }

    public String getCesantias() {
        return cesantias;
    }
}
