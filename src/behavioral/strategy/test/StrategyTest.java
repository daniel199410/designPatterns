package behavioral.strategy.test;

import behavioral.strategy.Context;
import behavioral.strategy.Notification;
import behavioral.strategy.Strategies;
import behavioral.strategy.StrategyFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StrategyTest {
	@Test
	public void shouldSendByEmail() {
		Context context = new Context(StrategyFactory.getStrategy(Strategies.EMAIL));
		assertEquals(
				"Notification sent by email",
				context.sendNotification(new Notification())
		);
	}

	@Test
	public void shouldSendBySMS() {
		Context context = new Context(StrategyFactory.getStrategy(Strategies.SMS));
		assertEquals(
				"Message sent by SMS",
				context.sendNotification(new Notification())
		);
	}

	@Test
	public void shouldSendByPushNotification() {
		Context context = new Context(StrategyFactory.getStrategy(Strategies.PUSH));
		assertEquals(
				"Notification sent by push notification",
				context.sendNotification(new Notification())
		);
	}
}
