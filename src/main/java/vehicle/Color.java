package vehicle;

public enum Color {
    SLOW_SILVER("Slow Silver", "#C0C0C0"),
    MELLO_YELLOW("Mello Yell Oh", "#FFFF00"),
    RACING_RED("Racing Red", "#FF0000"),
    GOLDEN_GREEN("Golden Green", "#7CFC00");

    private String displayValue;
    private String paintCode;

    private Color(String displayValue, String paintCode) {
        this.displayValue = displayValue;
        this.paintCode = paintCode;
    }

    @Override
    public String toString() {
        return displayValue;
    }

    public String getPaintCode() {
        return paintCode;
    }
}
