package vehicle;

public class Vehicle implements Comparable<Vehicle>{
    private final Color color;
    private int fuelLevel;
    private Manufacture manufacture;
    private final String model;
    private final int numSeats;
    private double price;

    public static final Color DEFAULT_COLOR = Color.RACING_RED;
    public static final int MIN_FUEL_LEVEL = 0;
    public static final int MAX_FUEL_LEVEL = 100;
    public static int TOTAL_NUM_VEHICLES = 0; // M2 HOMEWORK STATIC

    /**
     * Constructor used to create vechicles
     * @param color - color of vechicle
     * @param fuelLevel - fuel leve of vehicle
     * @param manufacture - manufacture of vechicle
     * @param model - model of vehicle
     * @param numSeats - number of seats in vehicle
     * @param price - price of vehicle
     */
    public Vehicle(Color color, int fuelLevel, Manufacture manufacture, String model, int numSeats, double price) {
        this.color = color;
        this.fuelLevel = fuelLevel;
        this.manufacture = manufacture;
        this.model = model;
        this.numSeats = numSeats;
        this.price = price;
        Vehicle.TOTAL_NUM_VEHICLES++;
    }

    /**
     * @see Vehicle#Vehicle(Color, int, Manufacture, String, int, double)
     * Default values provided for color and fuelLevel
     *
     */
    public Vehicle(Manufacture manufacture, String model, int numSeats, double price) {
        this(DEFAULT_COLOR, MAX_FUEL_LEVEL, manufacture, model, numSeats, price);
    }

    public Color getColor() {
        return color;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        if (MIN_FUEL_LEVEL <= fuelLevel && fuelLevel <= MAX_FUEL_LEVEL) {
            this.fuelLevel = fuelLevel;
        }
    }

    public Manufacture getManufacture() {
        return manufacture;
    }

    public void setManufacture(Manufacture manufacture) {
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public double getPrice() {
        return price;
    }

    public static int getTotalNumVehicles() { // M2 HOMEWORK STATIC
        return Vehicle.TOTAL_NUM_VEHICLES;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return String.format("Manufacture: %s\tModel: %s\nColor: %s\tPrice: %s\nSeating Capacity: %s",
                manufacture, model, color + " " + color.getPaintCode(), price, numSeats); // M2 HOMEWORK ENUM USE
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle vehicle = (Vehicle) obj;
            return this.manufacture == vehicle.manufacture && this.model.equalsIgnoreCase(vehicle.model);
        }
        return false;
    }

    public void brake() {
        System.out.println("Apply brake");
    }

    public void reFuel() {
        setFuelLevel(MAX_FUEL_LEVEL);
    }

    public void requiresService() {
        System.out.println("Vehicle needs servicing");
    }

    public void start() {
        System.out.println("Starting vehicle");
    }

    public void stop() {
        System.out.println("Turning off vehicle");
    }

    @Override
    public int compareTo(Vehicle o) {
        return model.compareTo(o.model);
    }
}
