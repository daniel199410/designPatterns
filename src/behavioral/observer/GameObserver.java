package behavioral.observer;

public class GameObserver extends Observer{
	private final String name;
	private Subject subject;

	public GameObserver(String name) {
		this.name = name;
	}

	public void subscribeTo(Subject subject) {
		subject.attach(this);
		this.subject = subject;
	}

	@Override
	protected void update() {
		if(this.subject != null) {
			state = this.subject.getState().equals(name);
		}
	}
}
