package behavioral.memento;

import java.util.Stack;

public class CareTaker {
	private final Stack<Memento> mementoStack = new Stack<>();

	public void save(Memento state) {
		mementoStack.add(state);
	}

	public Memento get() {
		return mementoStack.pop();
	}
}
