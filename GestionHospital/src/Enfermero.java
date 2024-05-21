import java.util.Arrays;
import java.util.Date;

public class Enfermero extends Persona{
    private String ID_ENFERMERO;

    private CitaMedica citaMedicaList[];
    private Doctor doctorList[];
    private Paciente pacienteList[];

    public Enfermero(String nombre, String apellido, String dni, Date fechaNacimiento, String ID_ENFERMERO){
        super(nombre, apellido, dni, fechaNacimiento);
        this.ID_ENFERMERO = ID_ENFERMERO;
    }

    @Override
    public String toString() {
        return "Enfermero{" +
                "Nombre: " + super.getNombre() + '\n' +
                "ID_ENFERMERO='" + ID_ENFERMERO +
                '}';
    }
}
