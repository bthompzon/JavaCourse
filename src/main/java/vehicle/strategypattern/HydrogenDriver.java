package vehicle.strategypattern;

public class HydrogenDriver implements Driver {
    @Override
    public void drive() {
        System.out.println("Start reaction using hydrogen oxygen to produce electrical energy and then send to " +
                "electric motor");
    }
}
