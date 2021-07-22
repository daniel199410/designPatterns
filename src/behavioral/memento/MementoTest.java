package behavioral.memento;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MementoTest {

	@Test
	public void shouldUndoSecondState() {
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		originator.setState("State 1");
		careTaker.save(originator.createMemento());
		originator.setState("State 2");
		careTaker.save(originator.createMemento());
		originator.setState("State 3");
		originator.setMemento(careTaker.get());
		assertEquals("State 2", originator.getState());
	}
}
