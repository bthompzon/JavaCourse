
import vehicle.*;

import java.util.ArrayList;
import java.util.List;

public class VehicleTester {
    public static void main(String[] args) {
        List<Vehicle> fleet = new ArrayList<>();

        Vehicle tesla = new ElectricVehicle(Manufacture.TESLA, "Model 3", 4, 80000,
                "lithium-ion", 2);

        Vehicle ford = new InternalCombustionVehicle(Manufacture.FORD, "Explorer", 6, 50000,
                6, "180 in3");

        Vehicle toyota = new HydrogenVehicle(Manufacture.TOYOTA, "Mirai", 4, 85000,
                "SuperCell2000");

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
        }
    }
}
