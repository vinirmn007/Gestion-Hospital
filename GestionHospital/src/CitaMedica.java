import java.sql.Time;
import java.util.Date;

public class CitaMedica implements GestionCita{
    private Date fecha;
    private Time hora;
    private String motivoCita;
    private Estado estado;
    private static int contadorCitas = 0;

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
}
