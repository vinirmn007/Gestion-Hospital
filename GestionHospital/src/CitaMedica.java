import java.sql.Time;
import java.util.Date;

public class CitaMedica implements GestionCita{
    private Date fecha;
    private Time hora;
    private String motivoCita;
    private Estado estado;
    private static int contadorCitas = 0;

    private Doctor doctorList[];
    private Paciente pacienteList[];
    private Enfermero enfermeroList[];

    public CitaMedica(Date fecha, Time hora, String motivoCita, Estado estado, Doctor doctorList[], Paciente pacienteList[], Enfermero enfermeroList[]){
        this.fecha = fecha;
        this.hora = hora;
        this.motivoCita = motivoCita;
        this.estado = estado;
        this.doctorList = doctorList;
        this.pacienteList = pacienteList;
        this.enfermeroList = enfermeroList;
        contadorCitas++;
    }

    @Override
    public void programarCita(){
        //TODO
    };
    public void cancelarCita() {
        //TODO
    };
    public void realizarCita() {
        //TODO
    };

    @Override
    public String toString() {
        return "CitaMedica{ \n" +
                "fecha=" + fecha + '\n' +
                ", hora=" + hora + '\n' +
                ", motivoCita='" + motivoCita + '\n' +
                ", estado=" + estado + '\n' +
                '}';
    }
}
