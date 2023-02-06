package View;

import Controller.*;
import Model.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

/**
 * Vista
 */
public class View {
    private Controller ctrl;
    private final Scanner scan;

    /**
     * Inicializa una nueva instancia de la clase
     */
    public View() {
        this.scan = new Scanner(System.in);
    }

    /**
     * Asigna el controlador a la vista
     * @param ctrl Controlador
     */
    public void setController(Controller ctrl) {
        this.ctrl = ctrl;
    }

    /**
     * Limpia la consola
     */
    private void clean() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * Imprime el título de la aplicación
     */
    private void title() {
        System.out.println("****************| SHIP INVENTORY MANAGER |****************");
        System.out.println();
        System.out.println();
    }

    /**
     * Imprime el command prompt
     */
    private void prompt() {
        System.out.println();
        System.out.printf("@/> ");
    }

    /**
     * Imprime el menú principal
     */
    private void menu() {
        clean();

        title();
        System.out.println("1. Buscar");
        System.out.println("2. Crear");
        System.out.println("3. Salir");
        prompt();
    }

    /**
     * Esperar por un ENTER
     */
    private void waitForEnter() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Presiona Enter para continuar...");
            reader.readLine();
        } catch (IOException ex) {
            scan.next("\n");
        }
    }

    /**
     * Vista del menú para la creación
     * @return Opción seleccionada
     */
    public int createCommandClassMenuView() {
        while (true) {
            clean();

            title();
            System.out.println("¿Qué clase de vehículo espacial desea crear?");
            System.out.println("1. Lanzadera");
            System.out.println("2. Nave");
            System.out.println("3. ...");
            prompt();

            String option = scan.nextLine().toUpperCase();

            switch (option) {
                case "1":
                    return 1;
                case "2":
                    return 2;
                case "3":
                    return 3;
            }
        }
    }

    /**
     * Vista del menú para la creación
     * @return Opción seleccionada
     */
    public Filter searchCommandView() {
        Filter filter = new Filter();

        clean();

        title();
        System.out.println("Buscar ----------------------------------------------");
        System.out.printf("FILTRAR POR (1-Nombre, 2-Clase, 3-Todo, 4-Salir): ");
        filter.setType(scan.nextInt());
        if (filter.getType() > 2) {
            return filter;
        }
        System.out.printf("CRITERIO: ");
        filter.setCriteria(scan.next());

        return filter;
    }

    /**
     * Imprime los resultados de una búsqueda
     * @param vehicles Lista de vehículos
     */
    public void searchCommandResultView(List<SpaceVehicle> vehicles) {
        clean();

        if (vehicles != null) {
            title();
            System.out.println("RESULTADOS ==================================");
            System.out.println();
            for (int i = 0; i < vehicles.size(); i++) {
                var vehicle = vehicles.get(i);
                System.out.printf("%d. ------------------------------------------\n%s\n", (i+1), vehicle.getInfo());
                System.out.println("---------------------------------------------");
            }
            waitForEnter();
        }

        ctrl.searchCommand();
    }

    /**
     * Vista de creación con éxito
     */
    public  void createCommandOKView() {
        clean();

        title();
        System.out.println("Vehículo creado con éxito..!!");
        waitForEnter();
    }

    /**
     * Vista de datos para crear una lanzadera
     */
    public SpaceVehicle createCommandShuttleView() {
        while (true) {
            clean();

            title();
            System.out.println("Creando vehículo espacial clase LANZADERA:");
            System.out.printf("\tNOMBRE: ");
            var name = scan.nextLine().toLowerCase();
            System.out.printf("\tPROPIETARIO: ");
            var owner = scan.nextLine().toUpperCase();
            System.out.printf("\tAÑO LANZAMIENTO: ");
            var releaseYear = scan.nextInt();
            System.out.printf("\tAÑO RETIRO: ");
            var retirementYear = scan.nextInt();
            System.out.printf("\tSISTEMA PROPULSIÓN\n");
            System.out.printf("\t\tPOTENCIA: ");
            var pow = scan.nextDouble();
            System.out.printf("\t\tEMPUJE: ");
            var drive = scan.nextDouble();
            System.out.printf("\t\tCOMBUSTIBLE: ");
            var fuel = scan.next().toLowerCase();
            System.out.printf("\tVELOCIDAD MAX (km/h): ");
            var maxSpeed = scan.nextDouble();
            System.out.printf("\tCAPACIDAD (kg): ");
            var capacity = scan.nextDouble();
            System.out.printf("\tCARGA ÚTIL: ");
            var usefulLoad = scan.next().toLowerCase();

            return SpaceVehicleFactory.createShuttle(
                    UUID.randomUUID().toString(),
                    name,
                    owner,
                    releaseYear,
                    retirementYear,
                    new PropulsionSystem(pow, fuel, drive),
                    maxSpeed,
                    usefulLoad,
                    capacity
            );
        }
    }

    /**
     * Vista de datos para crear una nave
     */
    public SpaceVehicle createCommandShipView() {
        while (true) {
            clean();

            title();
            System.out.println("Creando vehículo espacial clase NAVE:");
            System.out.printf("\tNOMBRE: ");
            var name = scan.nextLine().toLowerCase();
            System.out.printf("\tPROPIETARIO: ");
            var owner = scan.nextLine().toUpperCase();
            System.out.printf("\tAÑO LANZAMIENTO: ");
            var releaseYear = scan.nextInt();
            System.out.printf("\tAÑO RETIRO: ");
            var retirementYear = scan.nextInt();
            System.out.printf("\tSISTEMA PROPULSIÓN\n");
            System.out.printf("\t\tPOTENCIA: ");
            var pow = scan.nextDouble();
            System.out.printf("\t\tEMPUJE: ");
            var drive = scan.nextDouble();
            System.out.printf("\t\tCOMBUSTIBLE: ");
            var fuel = scan.next().toLowerCase();
            System.out.printf("\tVELOCIDAD MAX (km/h): ");
            var maxSpeed = scan.nextDouble();
            System.out.printf("\tTIPO (1-SONDA, 2-SATÉLITE, 3-TRIPULADA): ");
            var type = scan.nextInt();
            var members = 0;
            if (type == 3) {
                System.out.printf("\tTRIPULANTES (No.): ");
                members = scan.nextInt();
            }
            System.out.printf("\tMISIÓN: ");
            var mission = scan.next().toLowerCase();

            return SpaceVehicleFactory.createShip(
                    UUID.randomUUID().toString(),
                    name,
                    owner,
                    releaseYear,
                    retirementYear,
                    new PropulsionSystem(pow, fuel, drive),
                    maxSpeed,
                    ShipType.values()[type-1],
                    mission,
                    members
            );
        }
    }

    /**
     * Corre el loop de la vista
     */
    public void run() {
        while (true) {
            menu();
            int option = scan.nextInt();

            switch (option) {
                case 1:
                    ctrl.searchCommand();
                    break;
                case 2:
                    ctrl.createCommand();
                    break;
                case 3:
                    System.out.println("Adiós..!!");
                    return;
            }
        }
    }
}
