package vehicle;

import vehicle.strategypattern.HydrogenDriver;

public class HydrogenVehicle extends Vehicle {
    private final String hydrogenVehicleFuelCellType;

    /**
     * {@inheritDoc}
     *
     * @param hydrogenVehicleFuelCellType - fuel cell type
     */
    public HydrogenVehicle(Color color, int fuelLevel, Manufacture manufacture, String model, int numSeats,
                           double price, String hydrogenVehicleFuelCellType) {
        super(color, fuelLevel, manufacture, model, numSeats, price, new HydrogenDriver());
        this.hydrogenVehicleFuelCellType = hydrogenVehicleFuelCellType;
    }

    /**
     * @see HydrogenVehicle#HydrogenVehicle(Color, int, Manufacture, String, int, double, String)
     */
    public HydrogenVehicle(Manufacture manufacture, String model, int numSeats, double price,
                           String hydrogenVehicleFuelCellType) {
        this(DEFAULT_COLOR, MAX_FUEL_LEVEL, manufacture, model, numSeats, price, hydrogenVehicleFuelCellType);
    }

    public HydrogenVehicle(Manufacture manufacture, String model, int numSeats, double price) {
        this(manufacture, model, numSeats, price, "unknown");
    }

    public String getHydrogenVehicleFuelCellType() {
        return hydrogenVehicleFuelCellType;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "\nHydrogen cell type: " + hydrogenVehicleFuelCellType;
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof HydrogenVehicle) {
            HydrogenVehicle hv = (HydrogenVehicle) obj;
            return super.equals(obj) &&
                    this.hydrogenVehicleFuelCellType.equalsIgnoreCase(hv.hydrogenVehicleFuelCellType);
        }
        return false;
    }

    @Override
    public void start() {
        System.out.println("combine hydrogen and oxygen to produce electricity");
    }

    @Override
    public void reFuel() {
        System.out.println("Replenish Hydrogen");
        super.reFuel();
    }

    public void performReverseElectrolysis() {
        System.out.println("providing power");
    }

    public void activateHydrogenSpecificReaction() {
        System.out.println("Performing fancy reaction here. Sorry I don't know enough about this so fake method :(");
    }

    public void openHydrogenFuelingCellPortLid() {
        System.out.println("Opening hydrogen Fuel Port Lid");
    }
}
