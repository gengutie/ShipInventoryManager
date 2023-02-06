package Model;

/**
 * Nave Espacial
 */
public abstract class SpaceShip extends SpaceVehicle {
    /**
     * Tipo de nave
     */
    private final ShipType type;
    /**
     * Misión
     */
    private String mission;

    /**
     * Inicializa una nueva instancia de un Vehículo Espacial clase Nave
     * @param id             Id del vehículo
     * @param name           Nombre
     * @param owner          Fabricante o propietario
     * @param releaseYear    Año de lanzamiento
     * @param retirementYear Año de retiro
     * @param propulsion     Sistema de Propulsión
     * @param maxSpeed       Velocidad Maxima
     * @param type           Tipo de nave
     * @param mission        Misión o propósito
     */
    protected SpaceShip(String id, String name, String owner, int releaseYear, Integer retirementYear, PropulsionSystem propulsion, double maxSpeed, ShipType type, String mission) {
        super(id, name, owner, VehicleClass.SHIP, releaseYear, retirementYear, propulsion, maxSpeed);
        this.type = type;
        this.mission = mission;
    }

    /**
     * Obtiene el Tipo de nave
     * @return Tipo de nave
     */
    public ShipType getType() {
        return type;
    }

    /**
     * Obtiene la Misión o Propósito
     * @return Misión o Propósito
     */
    public String getMission() {
        return mission;
    }

    /**
     * Asigna la Misión o Propósito
     * @param mission Misión o Propósito
     */
    public void setMission(String mission) {
        this.mission = mission;
    }
}
