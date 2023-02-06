package Model;

/**
 * Vehículo Espacial
 */
public abstract class SpaceVehicle {
    /**
     * Identificación
     */
    private final String id;
    /**
     * Nombre
     */
    private final String name;
    /**
     * Fabricante o propietario
     */
    private final String owner;
    /**
     * Clase de vehículo
     */
    private final VehicleClass cls;
    /**
     * Año de lanzamiento
     */
    private final int releaseYear;
    /**
     * Año de retiro
     */
    private Integer retirementYear;
    /**
     * Sistema de propulsión
     */
    private final PropulsionSystem propulsion;
    /**
     * Velocidad
     */
    private final double maxSpeed;

    /**
     * Inicializa una nueva instancia de un Vehículo Espacial
     * @param id Id del vehículo
     * @param name Nombre
     * @param owner Fabricante o propietario
     * @param cls Clase de vehículo
     * @param releaseYear Año de lanzamiento
     * @param retirementYear Año de retiro
     * @param propulsion Sistema de Propulsión
     * @param maxSpeed Velocidad Maxima
     */
    protected SpaceVehicle(String id, String name, String owner, VehicleClass cls, int releaseYear, Integer retirementYear, PropulsionSystem propulsion, double maxSpeed) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.cls = cls;
        this.releaseYear = releaseYear;
        this.retirementYear = retirementYear;
        this.propulsion = propulsion;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Obtiene el Id
     * @return Id
     */
    public String getId() {
        return id;
    }

    /**
     * Obtiene el Nombre
     * @return Nombre
     */
    public String getName() {
        return name;
    }

    /**
     * Obtiene el Fabricante o Propietario
     * @return Fabricante o Propietario
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Obtiene la Clase de Vehículo
     * @return Clase de Vehículo
     */
    public VehicleClass getCls() {
        return cls;
    }

    /**
     * Obtiene el Año de Lanzamiento
     * @return Año de Lanzamiento
     */
    public int getReleaseYear() {
        return releaseYear;
    }

    /**
     * Obtiene el Año de Retiro
     * @return Año de Retiro
     */
    public Integer getRetirementYear() {
        return retirementYear;
    }

    /**
     * Asigna el Año de Retiro
     * @param year Año de Retiro
     */
    public void SetRetirementYear(Integer year) {
        retirementYear = year;
    }

    /**
     * Obtiene el Sistema de Propulsión
     * @return Sistema de Propulsión
     */
    public PropulsionSystem getPropulsion() {
        return propulsion;
    }

    /**
     * Obtiene la Velocidad Maxima
     * @return Velocidad Maxima
     */
    public double getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Obtiene información detallada del vehículo
     * @return información del vehículo
     */
    public abstract String getInfo();
}
