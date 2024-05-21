import java.util.Arrays;
import java.util.Date;

public class Paciente extends Persona{
    private ExpedienteMedico expediente;
    private CitaMedica citaMedicaList[];
    private Doctor doctorList[];
    private Enfermero enfermeroList[];

    public Paciente(String nombre, String apellido, String dni, Date fechaNacimiento) {
        super(nombre, apellido, dni, fechaNacimiento);
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "Nombre: " + super.getNombre() + '\n' +
                "expediente=" + expediente +
                '}';
    }
}
