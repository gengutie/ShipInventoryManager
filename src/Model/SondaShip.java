package Model;

/**
 * Sonda
 */
public class SondaShip extends SpaceShip {
    /**
     * Inicializa una nueva instancia de un Vehículo Espacial clase Nave y tipo Sonda
     * @param id             Id del vehículo
     * @param name           Nombre
     * @param owner          Fabricante o propietario
     * @param releaseYear    Año de lanzamiento
     * @param retirementYear Año de retiro
     * @param propulsion     Sistema de Propulsión
     * @param maxSpeed       Velocidad Maxima
     * @param mission        Misión o propósito
     */
    public SondaShip(String id, String name, String owner, int releaseYear, Integer retirementYear, PropulsionSystem propulsion, double maxSpeed, String mission) {
        super(id, name, owner, releaseYear, retirementYear, propulsion, maxSpeed, ShipType.SONDA, mission);
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
                "\nMISIÓN: " + getMission();
    }
}
