package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	private final List<Observer> observers = new ArrayList<>();

	public void attach(Observer observer) {
		this.observers.add(observer);
	}

	public void detach(Observer observer){
		this.observers.remove(observer);
	}

	protected void broadcast() {
		this.observers.forEach(Observer::update);
	}

	protected abstract String getState();
	public abstract void setState(String state);
}
