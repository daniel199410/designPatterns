package behavioral.state.test;

import behavioral.state.Package;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StateTest {
	@Test
	public void givenNewPackageNextMustBeStateReceived() {
		Package pkg = new Package();
		assertEquals("Ordered", pkg.getState().getStatus());
		pkg.nextState();
		assertEquals("Delivered", pkg.getState().getStatus());
		pkg.nextState();
		assertEquals("Received", pkg.getState().getStatus());
	}

	@Test
	public void shouldBeAbleToReturnFromReceivedToDelivered() {
		Package pkg = new Package();
		assertEquals("Ordered", pkg.getState().getStatus());
		pkg.nextState();
		assertEquals("Delivered", pkg.getState().getStatus());
		pkg.nextState();
		assertEquals("Received", pkg.getState().getStatus());
		pkg.previousState();
		assertEquals("Delivered", pkg.getState().getStatus());
	}
}
