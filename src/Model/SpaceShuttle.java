package Model;

/**
 * Lanzadera
 */
public class SpaceShuttle extends SpaceVehicle {
    /**
     * Carga útil
     */
    private String usefulLoad;
    /**
     * Capacidad
     */
    private double capacity;

    /**
     * Inicializa una nueva instancia de un Vehículo Espacial clase Lanzadera
     * @param id             Id del vehículo
     * @param name           Nombre
     * @param owner          Fabricante o propietario
     * @param releaseYear    Año de lanzamiento
     * @param retirementYear Año de retiro
     * @param propulsion     Sistema de Propulsión
     * @param maxSpeed       Velocidad Maxima
     * @param usefulLoad     Carga útil
     * @param capacity       Capacidad de carga
     */
    public SpaceShuttle(String id, String name, String owner, int releaseYear, Integer retirementYear, PropulsionSystem propulsion, double maxSpeed, String usefulLoad, double capacity) {
        super(id, name, owner, VehicleClass.SHUTTLE, releaseYear, retirementYear, propulsion, maxSpeed);
        this.usefulLoad = usefulLoad;
        this.capacity = capacity;
    }

    /**
     * Obtiene la Carga Útil
     * @return Carga Útil
     */
    public String getUsefulLoad() {
        return usefulLoad;
    }

    /**
     * Asigna la Carga Útil
     * @param usefulLoad Carga Útil
     */
    public void setUsefulLoad(String usefulLoad) {
        this.usefulLoad = usefulLoad;
    }

    /**
     * Obtiene la Capacidad
     * @return Capacidad
     */
    public double getCapacity() {
        return capacity;
    }

    /**
     * Asigna la Capacidad
     * @param capacity Capacidad
     */
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    /**
     * Obtiene información detallada del vehículo
     *
     * @return información del vehículo
     */
    @Override
    public String getInfo() {
        return "NOMBRE: '" + getName() + '\'' +
                "\nFABRICANTE: '" + getOwner() + '\'' +
                "\nCLASE: '" + getCls() + '\'' +
                "\nACTIVIDAD: " + getReleaseYear() + " - " + getRetirementYear() +
                "\nPROPULSIÓN: " + getPropulsion() +
                "\nVELOCIDAD: " + getMaxSpeed() +
                "\nCARGA ÚTIL: " + getUsefulLoad() +
                "\nCAPACIDAD: " + getCapacity();
    }
}
