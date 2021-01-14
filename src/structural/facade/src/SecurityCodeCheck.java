package structural.facade.src;

public class SecurityCodeCheck {
	private final int securityCode = 1234;
	
	public int getSecurityCode() {
		return securityCode;
	}
	
	public boolean isCodeCorrect(int secCoToCheck) {
		return secCoToCheck == securityCode;
	}
}
