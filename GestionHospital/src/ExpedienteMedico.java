import ExpedienteMedico.*;

public class ExpedienteMedico {
    private String alergias;
    private TipoSangre tipoSangre;

    private Diagnostico diagnosticoList[];
    private Prescripcion prescripcionList[];
    private Enfermedad enfermedadList[];

    private Paciente paciente;

    public ExpedienteMedico(String alergias, TipoSangre tipoSangre, Paciente paciente) {
        this.alergias = alergias;
        this.tipoSangre = tipoSangre;
        this.paciente = paciente;
    }
}
