package behavioral.observer;

public abstract class Observer {
	protected boolean state;

	public boolean getState() {
		return state;
	}

	protected abstract void update();
}
