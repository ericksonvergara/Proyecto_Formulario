package src.main.java.formulario.enums;

public enum Genero {
    MASCULINO("Masculino"),
    FEMENINO("Femenino"),
    LGTBI("lgtbi+"),
    NOBINARIO("No binario"),
    NORESPONDE("No responde");

    private final String genero;

    Genero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }
}
