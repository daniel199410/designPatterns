package behavioral.templateMethod.strategies;

import behavioral.templateMethod.enums.EnumNotificationStatus;
import behavioral.templateMethod.models.Notification;

public class EmailStrategy extends NotificationStrategy {
	@Override
	public EnumNotificationStatus sendNotification(Notification notification) {
		if(notification.getId() == 1 || notification.getId() == 3) {
			return EnumNotificationStatus.ERROR;
		}
		return EnumNotificationStatus.OK;
	}
}
