import java.sql.Time;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Doctor Juan = new Doctor("Juan", "Perez", "1104517417", new Date("26/04/2005"), "1234", Especialidad.CARDIOLOGIA);
        Paciente Carlos = new Paciente("Carlos", "Roman", "110405320", new Date("08/04/2001"));
        Enfermero Maria = new Enfermero("Maria", "Gonzalez", "1104517417", new Date("26/04/2005"), "1234");

        CitaMedica cita = new CitaMedica(new Date("26/04/2005"), new Time(15), "Dolor de cabeza", Estado.PROGRAMADA, new Doctor[]{Juan}, new Paciente[]{Carlos}, new Enfermero[]{Maria});
        System.out.println(cita); //PRESENTACION
    }
}