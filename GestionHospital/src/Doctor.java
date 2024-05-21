import java.util.Arrays;
import java.util.Date;

public class Doctor extends Persona{
    private String ID_DOCTOR; //READ ONLY
    private Especialidad especialidad; //READ ONLY

    private CitaMedica citaMedicaList[];
    private Paciente pacienteList[];
    private Enfermero enfermeroList[];

    public Doctor(String nombre, String apellido, String dni, Date fechaNacimiento, String ID_DOCTOR, Especialidad especialidad){
        super(nombre, apellido, dni, fechaNacimiento);
        this.ID_DOCTOR = ID_DOCTOR;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "Nombre: " + super.getNombre() + '\n' +
                "ID_DOCTOR='" + ID_DOCTOR + '\'' +
                ", especialidad=" + especialidad +
                '}';
    }
}
