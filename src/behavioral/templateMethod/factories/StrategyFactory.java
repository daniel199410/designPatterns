package behavioral.templateMethod.factories;

import behavioral.templateMethod.enums.Strategies;
import behavioral.templateMethod.strategies.EmailStrategy;
import behavioral.templateMethod.strategies.NotificationStrategy;
import behavioral.templateMethod.strategies.PushNotificationStrategy;
import behavioral.templateMethod.strategies.SMSStrategy;

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
