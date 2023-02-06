package Model;

/**
 * Nave tripulada
 */
public class MannedShip extends SpaceShip {
    /**
     * Cantidad de tripulantes
     */
    private final int members;

    /**
     * Inicializa una nueva instancia de un Vehículo Espacial clase Nave y Tipo Tripulado
     * @param id             Id del vehículo
     * @param name           Nombre
     * @param owner          Fabricante o propietario
     * @param releaseYear    Año de lanzamiento
     * @param retirementYear Año de retiro
     * @param propulsion     Sistema de Propulsión
     * @param maxSpeed       Velocidad Maxima
     * @param mission        Misión o propósito
     * @param members        Cantidad de Tripulantes
     */
    public MannedShip(String id, String name, String owner, int releaseYear, Integer retirementYear, PropulsionSystem propulsion, double maxSpeed, String mission, int members) {
        super(id, name, owner, releaseYear, retirementYear, propulsion, maxSpeed, ShipType.MANNED, mission);
        this.members = members;
    }

    /**
     * Obtiene la Cantidad de Tripulantes
     * @return Cantidad de Tripulantes
     */
    public int getMembers() {
        return members;
    }

    @Override
    public String getInfo() {
        return "NOMBRE: '" + getName() + '\'' +
                "\nFABRICANTE: '" + getOwner() + '\'' +
                "\nCLASE: '" + getCls() + '\'' +
                "\nTIPO: '" + getType() + '\'' +
                "\nACTIVIDAD: " + getReleaseYear() + " - " + getRetirementYear() +
                "\nPROPULSIÓN: " + getPropulsion() +
                "\nVELOCIDAD: " + getMaxSpeed() +
                "\nMISIÓN: " + getMission() +
                "\nTRIPULACIÓN: " + getMembers();
    }
}
