package behavioral.chainOfResponsibility.moneyChain;

public enum Bills {
    TEN_THOUSAND(10000),
    TWENTY_THOUSAND(20000),
    FIFTY_THOUSAND(50000),
    ONE_HUNDRED_THOUSAND(100000);

    private int value;

    Bills(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
