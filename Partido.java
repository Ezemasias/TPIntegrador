package EjercicioIntegrador;

public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private int golesEquipo1;
    private int golesEquipo2;
    
    public Partido(Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }
    
    public Equipo getEquipo1() {
        return equipo1;
    }
    
    public Equipo getEquipo2() {
        return equipo2;
    }
    
    public int getGolesEquipo1() {
        return golesEquipo1;
    }
    
    public int getGolesEquipo2() {
        return golesEquipo2;
    }
    
    public ResultadoEnum resultado(Equipo equipo) {
        if (equipo.equals(equipo1)) {
            if (golesEquipo1 > golesEquipo2) {
                return ResultadoEnum.GANADOR;
            } else if (golesEquipo1 < golesEquipo2) {
                return ResultadoEnum.PERDEDOR;
            } else {
                return ResultadoEnum.EMPATE;
            }
        } else if (equipo.equals(equipo2)) {
            if (golesEquipo2 > golesEquipo1) {
                return ResultadoEnum.GANADOR;
            } else if (golesEquipo2 < golesEquipo1) {
                return ResultadoEnum.PERDEDOR;
            } else {
                return ResultadoEnum.EMPATE;
            }
        } else {
            throw new IllegalArgumentException("El equipo no participa en este partido.");
        }
    }
}