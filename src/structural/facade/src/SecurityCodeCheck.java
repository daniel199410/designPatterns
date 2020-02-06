package structural.facade.src;

public class SecurityCodeCheck {
	private int securityCode = 1234;
	
	public int getSecurityCode() {
		return securityCode;
	}
	
	public boolean isCodeCorrect(int secCoToCheck) {
		return secCoToCheck == securityCode;
	}
}
