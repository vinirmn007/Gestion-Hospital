package ExpedienteMedico;

public class Tratamiento {
    private String nombre;
    private int duracionEstimada;

    private Enfermedad enfermedad;

    public Tratamiento(String nombre, int duracionEstimada) {
        this.nombre = nombre;
        this.duracionEstimada = duracionEstimada;
    }
}
