package Model;

public class SpaceVehicleFactory {
    /**
     * Crea un vehículo espacial clase lanzadera
     * @param id             Id del vehículo
     * @param name           Nombre
     * @param owner          Fabricante o propietario
     * @param releaseYear    Año de lanzamiento
     * @param retirementYear Año de retiro
     * @param propulsion     Sistema de propulsión
     * @param maxSpeed       Maxima velocidad
     * @param usefulLoad     Carga útil
     * @param capacity       Capacidad de carga
     * @return Una nueva instancia de un vehículo espacial clase lanzadera
     */
    public static SpaceVehicle createShuttle(String id, String name, String owner, int releaseYear, Integer retirementYear, PropulsionSystem propulsion, double maxSpeed, String usefulLoad, double capacity) {
        return new SpaceShuttle(id, name, owner, releaseYear, retirementYear, propulsion, maxSpeed, usefulLoad, capacity);
    }

    /**
     * Crea un vehículo espacial clase nave
     * @param id             Id del vehículo
     * @param name           Nombre
     * @param owner          Fabricante o propietario
     * @param releaseYear    Año de lanzamiento
     * @param retirementYear Año de retiro
     * @param propulsion     Sistema de propulsión
     * @param maxSpeed       Maxima velocidad
     * @param type           Tipo de nave
     * @param mission        Misión o propósito de la nave
     * @return Una nueva instancia de un vehículo espacial clase nave
     */
    public static SpaceVehicle createShip(String id, String name, String owner, int releaseYear, Integer retirementYear, PropulsionSystem propulsion, double maxSpeed, ShipType type, String mission) {
        return createShip(id, name, owner, releaseYear, retirementYear, propulsion, maxSpeed, type, mission, 0);
    }

    /**
     * Crea un vehículo espacial clase nave
     * @param id             Id del vehículo
     * @param name           Nombre
     * @param owner          Fabricante o propietario
     * @param releaseYear    Año de lanzamiento
     * @param retirementYear Año de retiro
     * @param propulsion     Sistema de propulsión
     * @param maxSpeed       Maxima velocidad
     * @param type           Tipo de nave
     * @param mission        Misión o propósito de la nave
     * @param members        Cantidad de miembros tripulantes
     * @return Una nueva instancia de un vehículo espacial clase nave
     */
    public static SpaceVehicle createShip(String id, String name, String owner, int releaseYear, Integer retirementYear, PropulsionSystem propulsion, double maxSpeed, ShipType type, String mission, int members) {
        switch (type) {
            case SONDA -> {
                return new SondaShip(id, name, owner, releaseYear, retirementYear, propulsion, maxSpeed, mission);
            }
            case MANNED -> {
                return new MannedShip(id, name, owner, releaseYear, retirementYear, propulsion, maxSpeed, mission, members);
            }
            case SATELLITE -> {
                return new SatelliteShip(id, name, owner, releaseYear, retirementYear, propulsion, maxSpeed, mission);
            }
        }
        return null;
    }
}
