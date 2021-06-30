package behavioral.iterator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IteratorImplTest {
	@Test
	public void shouldGetNumbers() {
		IteratorImpl iterator = new IteratorImpl();
		assertEquals("1234", iterator.iteratorList());
		assertEquals("1234", iterator.iteratorLinkedList());
	}

}
