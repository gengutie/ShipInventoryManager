package Repository;

import Model.SondaShip;
import Model.SpaceVehicle;
import Model.VehicleClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MemoryRepository implements Repository {
    /**
     * Almacén de vehículos
     */
    private final HashMap<String, SpaceVehicle> storage;

    /**
     * Inicializa una nueva instancia de la clase
     */
    public MemoryRepository() {
        this.storage = new HashMap<String, SpaceVehicle>();
    }

    /**
     * Obtiene los vehículos espaciales por nombre
     *
     * @param name Nombre
     * @return Lista de vehículos
     */
    @Override
    public List<SpaceVehicle> getByName(String name) {
        List<SpaceVehicle> vehicles = new ArrayList<SpaceVehicle>();

        this.storage.forEach((key, vehicle) -> {
            if (vehicle.getName().toLowerCase().contains(name.toLowerCase())) {
                vehicles.add(vehicle);
            }
        });

        return vehicles;
    }

    /**
     * Obtiene los vehículos espaciales por clase
     *
     * @param cls Clase de vehículo
     * @return Lista de vehículos
     */
    @Override
    public List<SpaceVehicle> getByClass(VehicleClass cls) {
        List<SpaceVehicle> vehicles = new ArrayList<>();

        this.storage.forEach((key, vehicle) -> {
            if (vehicle.getCls() == cls) {
                vehicles.add(vehicle);
            }
        });

        return vehicles;
    }

    /**
     * Obtiene todos los vehículos
     *
     * @return Lista de vehículos
     */
    @Override
    public List<SpaceVehicle> getAll() {
        List<SpaceVehicle> vehicles = new ArrayList<>();

        this.storage.forEach((key, vehicle) -> {
            vehicles.add(vehicle);
        });

        return vehicles;
    }

    /**
     * Guarda un vehículo
     *
     * @param vehicle Vehículo a guardar
     */
    @Override
    public void Save(SpaceVehicle vehicle) {
        if (vehicle != null) {
            this.storage.put(vehicle.getId(), vehicle);
        }
    }
}
