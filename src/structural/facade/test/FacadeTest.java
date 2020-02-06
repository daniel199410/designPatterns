package structural.facade.test;

import org.junit.Assert;
import org.junit.Test;
import structural.facade.src.BankAccountFacade;

public class FacadeTest {
	
	@Test
	public void should_make_deposit() throws Exception {
		BankAccountFacade bankAccountFacade = new BankAccountFacade(12345678, 1234);
		Assert.assertEquals(105.00, bankAccountFacade.withdrawCash(5.00), 2);
	}
	
	@Test(expected = Exception.class)
	public void shouldThrowForInvalidAccount() throws Exception {
		BankAccountFacade bankAccountFacade = new BankAccountFacade(1235678, 1234);
		bankAccountFacade.withdrawCash(5.00);
	}
	
	@Test(expected = Exception.class)
	public void shouldThrowForInvalidCode() throws Exception {
		BankAccountFacade bankAccountFacade = new BankAccountFacade(12345678, 123);
		bankAccountFacade.withdrawCash(5.00);
	}
	
	@Test(expected = Exception.class)
	public void shouldThrowForNotEnoughMoney() throws Exception {
		BankAccountFacade bankAccountFacade = new BankAccountFacade(12345678, 1234);
		bankAccountFacade.withdrawCash(200.00);
	}
}
