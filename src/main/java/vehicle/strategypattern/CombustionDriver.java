package vehicle.strategypattern;

public class CombustionDriver implements Driver {
    @Override
    public void drive() {
        System.out.println("Combining air spark and fuel to drive vehicle");
    }
}
