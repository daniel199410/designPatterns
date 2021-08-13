package behavioral.observer;

public class ConcreteSubject extends Subject{
	private String state;

	@Override
	protected String getState() {
		return state;
	}

	@Override
	public void setState(String state) {
		this.state = state;
		broadcast();
	}
}
