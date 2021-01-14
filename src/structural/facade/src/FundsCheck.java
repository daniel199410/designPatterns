package structural.facade.src;

public class FundsCheck {
	private double cashInAccount = 100.00;
	
	public double getCashInAccount() {
		return cashInAccount;
	}
	
	public boolean haveEnoughMoney(double cashToWithdrawal) {
		return cashInAccount >= cashToWithdrawal;
	}

	public double increaseCashInAccount(double cashDeposited) {
		cashInAccount += cashDeposited;
		return cashInAccount;
	}

	public double decreaseCashInAccount(double cashWithdrawn) {
		cashInAccount -= cashWithdrawn;
		return cashInAccount;
	}

	public double makeDeposit(double cashToDeposit) {
		return decreaseCashInAccount(cashToDeposit);
	}
}