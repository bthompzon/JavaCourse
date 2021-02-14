package vehicle.strategypattern;

public class ElectricDriver implements Driver {
    @Override
    public void drive() {
        System.out.println("Sending voltage to electric motors.");
    }
}
