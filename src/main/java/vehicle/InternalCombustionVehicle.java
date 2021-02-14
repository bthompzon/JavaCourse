package vehicle;

import vehicle.strategypattern.CombustionDriver;

public class InternalCombustionVehicle extends Vehicle {
    private final int numberOfCylinders;
    private final String engineDisplacement;

    /**
     * {@inheritDoc}
     *
     * @param numberOfCylinders - number of cylinders
     * @param engineDisplacement - engine displacement
     */
    public InternalCombustionVehicle(Color color, int fuelLevel, Manufacture manufacture, String model,
                                     int numSeats, double price, int numberOfCylinders, String engineDisplacement) {
        super(color, fuelLevel, manufacture, model, numSeats, price, new CombustionDriver());
        this.numberOfCylinders = numberOfCylinders;
        this.engineDisplacement = engineDisplacement;
    }

    /**
     * @see InternalCombustionVehicle#InternalCombustionVehicle(Color, int, Manufacture, String, int, double, int, String)
     */
    public InternalCombustionVehicle(Manufacture manufacture, String model, int numSeats, double price,
                                     int numberOfCylinders, String engineDisplacement) {
        this(DEFAULT_COLOR, MAX_FUEL_LEVEL, manufacture, model, numSeats, price, numberOfCylinders, engineDisplacement);
    }

    public InternalCombustionVehicle(Manufacture manufacture, String model, int numSeats, double price) {
        this(manufacture, model, numSeats, price, -1, "");
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public String getEngineDisplacement() {
        return engineDisplacement;
    }

    @Override
    public void start() {
        System.out.println("Activating starter and pumping fuel to cylinders and applying spark");
        pumpFuelIntoInjectors();
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "\nCombustion Engine Displacement: " + engineDisplacement + "\nNumber of cylinders: " + numberOfCylinders;
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof InternalCombustionVehicle) {
            InternalCombustionVehicle icv = (InternalCombustionVehicle) obj;
            return super.equals(obj) && this.numberOfCylinders == icv.getNumberOfCylinders() &&
                    this.engineDisplacement.equalsIgnoreCase(icv.getEngineDisplacement());
        }
        return false;
    }

    @Override
    public void reFuel() {
        System.out.println("Filling with gasoline");
        super.reFuel();
    }

    public void activatingRadiatorFan() {
        System.out.println("engine is above temperature starting radiator fan.");
    }

    public void enableTurboCharger() {
        System.out.println("If RPM's are over 4000 enable turbo charger here");
    }

    public void pumpFuelIntoInjectors() {
        System.out.println("Pumping fuel to injectors");
    }
}
