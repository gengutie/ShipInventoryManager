package Controller;

import Model.*;
import Repository.*;
import View.*;

import java.util.List;
import java.util.UUID;

/**
 * Controlador
 */
public class Controller {
    private final Repository storage;
    private final View view;

    /**
     * Inicializa una nueva instancia de la clase
     * @param storage Almacén de datos
     * @param view  Vista
     */
    public Controller(Repository storage, View view) {
        this.storage = storage;
        this.view = view;

        initialize();
    }

    /**
     * Comando para crear un nuevo vehículo
     */
    public void createCommand() {
        var opt = view.createCommandClassMenuView();
        if (opt == 1) {
            var shuttle = view.createCommandShuttleView();
            storage.Save(shuttle);
            view.createCommandOKView();
        } else if (opt == 2) {
            var ship = view.createCommandShipView();
            storage.Save(ship);
            view.createCommandOKView();
        }
    }

    /**
     * Comando para buscar un vehículo
     */
    public void searchCommand() {
        var filter = view.searchCommandView();
        if (filter.getType() == 4) {
            return;
        }

        List<SpaceVehicle> result = null;
        if (filter.getType() == 1) {
            result = storage.getByName(filter.getCriteria());
        } else if (filter.getType() == 2) {
            result = storage.getByClass(VehicleClass.valueOf(filter.getCriteria().toUpperCase()));
        } else if (filter.getType() == 3) {
            result = storage.getAll();
        }

        view.searchCommandResultView(result);
    }

    /**
     * Inicializa el almacén de datos
     */
    private void initialize() {
        //Lanzaderas==================================================
        storage.Save(SpaceVehicleFactory.createShuttle(
                UUID.randomUUID().toString(),
                "Saturno V",
                "EE.UU.",
                1967,
                1973,
                new PropulsionSystem(32000, "Hidrogeno Liquido", 3500),
                150000,
                "Sonda",
                118
        ));

        storage.Save(SpaceVehicleFactory.createShuttle(
                UUID.randomUUID().toString(),
                "Transbordador Espacial",
                "NASA",
                1981,
                2011,
                new PropulsionSystem(32000, "Hidrogeno Liquido", 3500),
                10000,
                "Refacciones",
                98
        ));

        storage.Save(SpaceVehicleFactory.createShuttle(
                UUID.randomUUID().toString(),
                "Protón",
                "RUSIA",
                2001,
                0,
                new PropulsionSystem(32000, "Queroseno", 3500),
                150000,
                "Satélite",
                56
        ));
        //======================================================================
        //Sondas==================================================
        storage.Save(SpaceVehicleFactory.createShip(
                UUID.randomUUID().toString(),
                "Cassini-Huygens",
                "NASA, ESA, ASI",
                1997,
                0,
                new PropulsionSystem(2500, "Nitrógeno", 45.39),
                18000,
                ShipType.SONDA,
                "Saturno y sus lunas"
        ));
        storage.Save(SpaceVehicleFactory.createShip(
                UUID.randomUUID().toString(),
                "Pionero X",
                "NASA, ESA, ASI",
                1972,
                0,
                new PropulsionSystem(2500, "Nitrógeno", 45.39),
                15000,
                ShipType.SONDA,
                "Júpiter"
        ));
        storage.Save(SpaceVehicleFactory.createShip(
                UUID.randomUUID().toString(),
                "Soho",
                "NASA, ESA, ASI",
                1995,
                0,
                new PropulsionSystem(2500, "Nitrógeno", 45.39),
                18000,
                ShipType.SONDA,
                "Marte"
        ));
        //======================================================================
        //Satélites==================================================
        storage.Save(SpaceVehicleFactory.createShip(
                UUID.randomUUID().toString(),
                "Satélite Climático",
                "NASA",
                1997,
                0,
                new PropulsionSystem(5622, "Hidrógeno", 45.39),
                130,
                ShipType.SATELLITE,
                "Reunir datos del clima"
        ));
        storage.Save(SpaceVehicleFactory.createShip(
                UUID.randomUUID().toString(),
                "StarLink 5",
                "NASA",
                2019,
                0,
                new PropulsionSystem(100, "Foto-celdas", 10.25),
                250,
                ShipType.SATELLITE,
                "Proveedor de internet satelital"
        ));
        storage.Save(SpaceVehicleFactory.createShip(
                UUID.randomUUID().toString(),
                "GPS 15",
                "NASA",
                2000,
                0,
                new PropulsionSystem(125, "Foto-celdas", 1523.5),
                17500,
                ShipType.SATELLITE,
                "Proveer ubicación en tiempo real"
        ));
        //======================================================================
        //Tripuladas==================================================
        storage.Save(SpaceVehicleFactory.createShip(
                UUID.randomUUID().toString(),
                "Dragon V2",
                "NASA",
                2016,
                0,
                new PropulsionSystem(2500, "Solido", 45.39),
                25000,
                ShipType.MANNED,
                "Marte",
                5
        ));
        storage.Save(SpaceVehicleFactory.createShip(
                UUID.randomUUID().toString(),
                "Módulo Lunar",
                "NASA",
                1968,
                1972,
                new PropulsionSystem(2500, "Gasolina Plástica", 45.39),
                15000,
                ShipType.MANNED,
                "Luna",
                2
        ));
        storage.Save(SpaceVehicleFactory.createShip(
                UUID.randomUUID().toString(),
                "Soyuz",
                "RUSIA",
                1967,
                0,
                new PropulsionSystem(2500, "Agua Hervida", 45.39),
                18000,
                ShipType.MANNED,
                "Luna",
                3
        ));
        //======================================================================
    }
}
