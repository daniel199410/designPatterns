package behavioral.chainOfResponsibility.moneyChain;

public abstract class MoneyChain {
    private MoneyChain next;

    public abstract void setNextChain(MoneyChain moneyChain);

    public abstract void getMoney(int remainingAmount) throws Exception;

    public void notSupportedOperation() throws Exception {
        throw new Exception("No hay suficiente dinero paa realizar la operación");
    }

    public MoneyChain getNext() {
        return next;
    }

    public void setNext(MoneyChain next) {
        this.next = next;
    }
}
