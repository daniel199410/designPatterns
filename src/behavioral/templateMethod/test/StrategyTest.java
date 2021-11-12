package behavioral.templateMethod.test;

import behavioral.templateMethod.context.Context;
import behavioral.templateMethod.enums.EnumNotificationStatus;
import behavioral.templateMethod.models.Notification;
import behavioral.templateMethod.enums.Strategies;
import behavioral.templateMethod.factories.StrategyFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StrategyTest {
	@Test
	public void shouldSendByEmail() {
		Context context = new Context(StrategyFactory.getStrategy(Strategies.EMAIL));
		assertEquals(
				EnumNotificationStatus.OK,
				context.sendNotification(new Notification(2))
		);
	}

	@Test
	public void shouldNotSendBySMS() {
		Context context = new Context(StrategyFactory.getStrategy(Strategies.SMS));
		assertEquals(
				EnumNotificationStatus.ERROR,
				context.sendNotification(new Notification(2))
		);
	}

	@Test
	public void shouldSendPushNotification() {
		Context context = new Context(StrategyFactory.getStrategy(Strategies.PUSH));
		assertEquals(
				EnumNotificationStatus.OK,
				context.sendNotification(new Notification(8))
		);
	}
}
