package src.main.java.formulario;

public enum TipoDocumento {
    CEDULA_CIUDADANIA("Cedula de ciudadania"),
    CEDULA_EXTRANJERIA("Cedula de extranjeria"),
    REGISTRO_CIVIL("Registro civil"),
    TARJETA_IDENTIDAD("Tarjeta de identidad"),
    PASAPORTE("Pasaporte");

    private final String nombreDoc;

    TipoDocumento(String nombreDoc) {
        this.nombreDoc = nombreDoc;
    }

    public String getNombreDoc() {
        return nombreDoc;
    }
}
