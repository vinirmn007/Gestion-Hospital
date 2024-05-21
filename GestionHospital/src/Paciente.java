import java.util.Date;

public class Paciente extends Persona{
    private ExpedienteMedico expediente;
    private CitaMedica citaMedicaList[];
    private Doctor doctorList[];
    private Enfermero enfermeroList[];

    public Paciente(String nombre, String apellido, String dni, Date fechaNacimiento, ExpedienteMedico expedient    ) {
        super(nombre, apellido, dni, fechaNacimiento);
        this.expediente = expediente;
    }
}
