public class Money {

    private MoneyType moneyType;

    public Money(MoneyType moneyType) {
        this.moneyType = moneyType;
    }

    public MoneyType getMoneyType() {
        return moneyType;
    }

    public int getValueFromEnum(){
        return this.moneyType.getValue();
    }
}
