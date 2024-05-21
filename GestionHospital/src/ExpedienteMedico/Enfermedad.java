package ExpedienteMedico;

public class Enfermedad {
    private String nombre;
    private boolean enTratamiento;

    private Tratamiento tratamientoList[];

    public Enfermedad(String nombre, boolean enTratamiento) {
        this.nombre = nombre;
        this.enTratamiento = enTratamiento;
    }
}
