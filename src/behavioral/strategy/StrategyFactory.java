package behavioral.strategy;

public class StrategyFactory {
	public static NotificationStrategy getStrategy(Strategies strategy) {
		switch (strategy) {
			case SMS: return new SMSStrategy();
			case EMAIL: return new EmailStrategy();
			case PUSH: return new PushNotificationStrategy();
			default: return null;
		}
	}
}
