package vehicle;

public class ElectricVehicle extends Vehicle {
    private String batteryType;
    private final int numMotors;

    /**
     * {@inheritDoc}
     *
     * @param batteryType - battery type
     * @param numMotors - number of motors
     */
    public ElectricVehicle(Color color, int fuelLevel, Manufacture manufacture, String model, int numSeats,
                           double price, String batteryType, int numMotors) {
        super(color, fuelLevel, manufacture, model, numSeats, price);
        this.batteryType = batteryType;
        this.numMotors = numMotors;
    }

    /**
     * @see ElectricVehicle#ElectricVehicle(Color, int, Manufacture, String, int, double, String, int)
     */
    public ElectricVehicle(Manufacture manufacture, String model, int numSeats, double price, String batteryType,
                           int numMotors) {
        this(DEFAULT_COLOR, MAX_FUEL_LEVEL, manufacture, model, numSeats, price, batteryType, numMotors);
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    public int getNumMotors() {
        return numMotors;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "\nElectric battery type: " + batteryType + "\tNumber of motors: " + numMotors;
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ElectricVehicle) {
            ElectricVehicle ev = (ElectricVehicle) obj;
            return super.equals(obj) && this.numMotors == ev.getNumMotors() &&
                    this.batteryType.equalsIgnoreCase(ev.batteryType);
        }
        return false;
    }

    public void enabledAutoPilot() {
        System.out.println("Enabling autopilot. Good luck!\n");
    }

    public boolean openTrunkRemotely() {
        System.out.println("Opening trunk");
        return true;
    }

    public void installUpdate() {
        System.out.println("Installing software update");
    }

    @Override
    public void start() {
        System.out.println("No need to start electric car is ready");
    }

    @Override
    public void brake() {
        System.out.println("Regenerative braking activated");
        if (getFuelLevel() < 100) {
            setFuelLevel(getFuelLevel()+1);
        }
    }

    @Override
    public void reFuel() {
        System.out.println("Charging battery");
        super.reFuel();
    }
}
