package behavioral.strategy;

class EmailStrategy implements NotificationStrategy {
	@Override
	public String sendNotification(Notification notification) {
		return "Notification sent by email";
	}
}
