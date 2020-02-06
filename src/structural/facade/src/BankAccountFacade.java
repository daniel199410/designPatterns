package structural.facade.src;

public class BankAccountFacade {
	private int accountNumber;
	private int securityCode;
	
	AccountNumberCheck accountNumberCheck;
	SecurityCodeCheck codeCheck;
	FundsCheck fundsCheck;
	WelcomeToBank bankWelcome;
	
	public BankAccountFacade(int newAcctNum, int newSecCode) {
		accountNumber = newAcctNum;
		securityCode = newSecCode;
		
		accountNumberCheck = new AccountNumberCheck();
		bankWelcome = new WelcomeToBank();
		codeCheck = new SecurityCodeCheck();
		fundsCheck = new FundsCheck();
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public int getSecurityCode() {
		return securityCode;
	}
	
	public double withdrawCash(double cashToGet) throws Exception {
		if(accountNumberCheck.accountActive(accountNumber) && codeCheck.isCodeCorrect(securityCode) && fundsCheck.haveEnoughMoney(cashToGet)) {
			return fundsCheck.makeDeposit(cashToGet);
		} else {
			throw new Exception("Transacci�n fallida");
		}
	}
	
}
