public enum MoneyType {
    FIVE(5),
    TEN(10),
    TWENTY(20),
    FIFTY(50),
    ONE_POUND(100),
    TWO_POUND(200);

    private final int value;

    MoneyType(int value) {
        this.value=value;
    }

    public int getValue() {
        return value;
    }
}
