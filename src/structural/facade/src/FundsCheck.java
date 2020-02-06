package structural.facade.src;

public class FundsCheck {
	private double cashInAccount = 100.00;
	
	public double getCashInAccount() {
		return cashInAccount;
	}
	
	public void decreaseCashInAccount(double cashWithdrawn) {
		cashInAccount -= cashWithdrawn;
	}
	
	public double increaseCashInAccount(double cashDeposited) {
		cashInAccount += cashDeposited;
		return cashInAccount;
	}
	
	public boolean haveEnoughMoney(double cashToWithdrawal) {
		return cashInAccount >= cashToWithdrawal;
	}
	
	public double makeDeposit(double cashToDeposit) {
		return increaseCashInAccount(cashToDeposit);
	}
}