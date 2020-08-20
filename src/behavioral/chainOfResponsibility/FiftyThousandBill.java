package behavioral.chainOfResponsibility;

public class FiftyThousandBill extends MoneyChain {
    @Override
    public void setNextChain(MoneyChain moneyChain) {
        this.setNext(moneyChain);
    }

    @Override
    public void getMoney(int remainingAmount) throws Exception {
        int amount = remainingAmount / Bills.FIFTY_THOUSAND.getValue();
        if(amount > 0) {
            GlobalVariables.moneyDistribution.put(Bills.FIFTY_THOUSAND, amount);
            remainingAmount -= amount * Bills.FIFTY_THOUSAND.getValue();
            if(remainingAmount > 0) {
                this.getNext().getMoney(remainingAmount);
            }
        } else if(this.getNext() != null) {
            this.getNext().getMoney(remainingAmount);
        }
        this.notSupportedOperation();
    }
}
