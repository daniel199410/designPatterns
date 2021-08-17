package behavioral.observer.test;

import behavioral.observer.GameObserver;
import behavioral.observer.ConcreteSubject;
import behavioral.observer.Subject;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ObserverTest {

	@Test
	public void shouldBePlayerOneTurn() {
		Subject subject = new ConcreteSubject();
		GameObserver player1 = new GameObserver("player 1");
		GameObserver player2 = new GameObserver("player 2");
		player1.subscribeTo(subject);
		player2.subscribeTo(subject);
		subject.setState("player 1");
		assertTrue(player1.getState());
		assertFalse(player2.getState());
	}
}
