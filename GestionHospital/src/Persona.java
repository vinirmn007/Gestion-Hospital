import java.util.Date;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;
    private Date fechaNacimiento;

    public int determinarEdad() {
        return 0;
    }

    public Persona(String nombre, String apellido, String dni, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }
}
