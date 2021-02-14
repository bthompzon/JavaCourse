package vehicle;

public class VehicleFactory {
    public static Vehicle newVehicle(String type, Manufacture manufacture, String model, int numSeats, double price) {
        Vehicle v;
        if(type.equalsIgnoreCase("electric")) {
            v = new ElectricVehicle(manufacture, model, numSeats, price);
        } else if (type.equalsIgnoreCase("combustion")) {
            v = new InternalCombustionVehicle(manufacture, model, numSeats, price);
        } else if (type.equalsIgnoreCase("hydrogen")) {
            v = new HydrogenVehicle(manufacture, model, numSeats, price);
        } else {
            throw new IllegalArgumentException();
        }
        return v;
    }
}
