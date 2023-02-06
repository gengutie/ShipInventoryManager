package Repository;

import Model.*;

import java.util.List;

/**
 * Repositorio
 */
public interface Repository {
    /**
     * Obtiene los vehículos espaciales por nombre
     * @param name Nombre
     * @return Lista de vehículos
     */
    List<SpaceVehicle> getByName(String name);

    /**
     * Obtiene los vehículos espaciales por clase
     * @param cls Clase de vehículo
     * @return Lista de vehículos
     */
    List<SpaceVehicle> getByClass(VehicleClass cls);

    /**
     * Obtiene todos los vehículos
     * @return Lista de vehículos
     */
    List<SpaceVehicle> getAll();

    /**
     * Guarda un vehículo
     * @param vehicle Vehículo a guardar
     */
    void Save(SpaceVehicle vehicle);
}
