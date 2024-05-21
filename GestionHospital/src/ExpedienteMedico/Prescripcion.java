package ExpedienteMedico;

public class Prescripcion {
    private String medicamento;
    private String dosis;
    private String frecuencia;
    private String duracion;

    public Prescripcion(String medicamento, String dosis, String frecuencia, String duracion) {
        this.medicamento = medicamento;
        this.dosis = dosis;
        this.frecuencia = frecuencia;
        this.duracion = duracion;
    }
}
