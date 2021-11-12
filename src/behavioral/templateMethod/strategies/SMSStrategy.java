package behavioral.templateMethod.strategies;

import behavioral.templateMethod.enums.EnumNotificationStatus;
import behavioral.templateMethod.models.Notification;

public class SMSStrategy extends NotificationStrategy {
	@Override
	protected EnumNotificationStatus sendNotification(Notification notification) {
		if(notification.getId() != 1) {
			return EnumNotificationStatus.ERROR;
		}
		return EnumNotificationStatus.OK;
	}
}
