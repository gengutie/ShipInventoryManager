package Model;

/**
 * Sistema de propulsión
 */
public final class PropulsionSystem {
    /**
     * Potencia
     */
    private final double power;
    /**
     * Combustible
     */
    private final String fuel;
    /**
     * Empuje
     */
    private final double drive;

    /**
     * Inicializa una nueva instancia de un sistema de propulsión
     * @param power Potencia
     * @param fuel Combustible
     * @param drive Empuje
     */
    public PropulsionSystem(double power, String fuel, double drive) {
        this.power = power;
        this.fuel = fuel;
        this.drive = drive;
    }

    /**
     * Obtiene la potencia
     * @return potencia
     */
    public double getPower() {
        return power;
    }

    /**
     * Obtiene el combustible
     * @return combustible
     */
    public String getFuel() {
        return fuel;
    }

    /**
     * Obtiene el empuje
     * @return empuje
     */
    public double getDrive() {
        return drive;
    }

    @Override
    public String toString() {
        return "{ Potencia: " + power + ", Combustible: '" + fuel + '\'' + ", Empuje: " + drive + '}';
    }
}
