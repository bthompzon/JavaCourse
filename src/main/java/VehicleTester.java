
import vehicle.*;
import vehicle.factorypattern.Dealership;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VehicleTester {
    public static void main(String[] args) {
        List<Vehicle> fleet = new ArrayList<>();

        // M3 USING FACTORY
        Vehicle tesla = VehicleFactory.newVehicle("electric", Manufacture.TESLA, "Model 3", 4, 80000);
        Vehicle ford = VehicleFactory.newVehicle("combustion", Manufacture.FORD, "Explorer", 6, 50000);
        Vehicle toyota = VehicleFactory.newVehicle("hydrogen", Manufacture.TOYOTA, "Mirai", 4, 85000);

        fleet.add(tesla);
        fleet.add(ford);
        fleet.add(toyota);

        for (Vehicle v : fleet) {
            System.out.println("\n" + v);
            v.start();
            v.stop();
            v.reFuel();

            if (v instanceof ElectricVehicle) {
                ElectricVehicle ev = (ElectricVehicle) v;
                ev.enabledAutoPilot();
            }

            v.drive(); // M3 USING STRATEGY
        }

        System.out.println("\nUnsorted fleet of vehicles:");
        fleet.stream().forEach(vehicle -> System.out.println("model: " + vehicle.getModel()));

        Collections.sort(fleet);

        System.out.println("\nSorted fleet of vehicles");
        fleet.stream().forEach(vehicle -> System.out.println("model: " + vehicle.getModel()));

        // M3 USING BUILDER
        Dealership dealership = new Dealership.DealershipBuilder("123 Sell St", LocalDate.now(), 100,
                10)
                .languageSpoken("English")
                .providesService(true)
                .build();
        System.out.println("\n" + dealership);

        System.out.println("\nPrice before sort");
        fleet.stream().forEach(vehicle -> System.out.println("price: " + vehicle.getPrice()));
        Collections.sort(fleet, Vehicle.PRICE_COMPARATOR); // M3 USING COMPARATOR
        System.out.println("Price after sort");
        fleet.stream().forEach(vehicle -> System.out.println("price: " + vehicle.getPrice()));
    }
}
