package vehicle;

public enum Manufacture {
    HONDA("Honda"),
    FORD("Ford"),
    BMW("Bayerische Motoren Werke"),
    TESLA("Tesla"),
    TOYOTA("Toyota"),
    MAZDA("Mazda"),
    DODGE("Dodge"),
    MERCEDES("Mercedes");

    private final String displayValue;

    private Manufacture(String displayValue) {
        this.displayValue = displayValue;
    }

    @Override
    public String toString() {
        return displayValue;
    }
}
