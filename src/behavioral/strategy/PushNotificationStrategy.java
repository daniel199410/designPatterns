package behavioral.strategy;

class PushNotificationStrategy implements NotificationStrategy{
	@Override
	public String sendNotification(Notification notification) {
		return "Notification sent by push notification";
	}
}
