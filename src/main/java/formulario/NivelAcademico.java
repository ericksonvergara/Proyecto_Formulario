package src.main.java.formulario;

public enum NivelAcademico {
    PRIMARIA("Primaria"),
    SECUNDARIA("Bachiller"),
    TECNICO("Tecnico"),
    TECNOLOGO("Tecnologo"),
    PREGRADO("Pregrado"),
    POSTGRADO("Postgrado"),
    NINGUNO("Ninguno");

    private final String nivelAcademico;

    NivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }

    public String getNivelAcademico() {
        return nivelAcademico;
    }
}
