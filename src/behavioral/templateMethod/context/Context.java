package behavioral.templateMethod.context;

import behavioral.templateMethod.enums.EnumNotificationStatus;
import behavioral.templateMethod.models.Notification;
import behavioral.templateMethod.strategies.NotificationStrategy;

public class Context {
	NotificationStrategy strategy;

	public Context(NotificationStrategy strategy) {
		this.strategy = strategy;
	}

	public EnumNotificationStatus sendNotification(Notification notification) {
		return strategy.handleNotification(notification);
	}
}
