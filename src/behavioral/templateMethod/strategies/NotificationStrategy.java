package behavioral.templateMethod.strategies;

import behavioral.templateMethod.enums.EnumNotificationStatus;
import behavioral.templateMethod.models.Notification;

public abstract class NotificationStrategy {
	private static final int maxAttempts = 5;

	public EnumNotificationStatus handleNotification(Notification notification) {
		EnumNotificationStatus result = sendNotification(notification);
		notification.setAttempts(notification.getAttempts() + 1);
		if(EnumNotificationStatus.ERROR.equals(result) && notification.getAttempts() < maxAttempts) {
			return handleNotification(notification);
		}
		notification.setStatus(result);
		return notification.getStatus();
	}

	protected abstract EnumNotificationStatus sendNotification(Notification notification);
}
