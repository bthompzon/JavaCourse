package vehicle;

public enum Color {
    SLOW_SILVER("Slow Silver"),
    MELLO_YELLOW("Mello Yell Oh"),
    RACING_RED("Racing Red"),
    GOLDEN_GREEN("Golden Green");

    private String displayValue;

    private Color(String displayValue) {
        this.displayValue = displayValue;
    }

    @Override
    public String toString() {
        return displayValue;
    }
}
