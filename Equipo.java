package EjercicioIntegrador;

public class Equipo {
    private String equipo;
    private String descripcion;

    public Equipo(String equipo, String descripcion) {
        this.equipo = equipo;
        this.descripcion = descripcion;
    }

    public String getEquipo() {
        return equipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
