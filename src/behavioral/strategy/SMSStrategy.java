package behavioral.strategy;

class SMSStrategy implements NotificationStrategy{
	@Override
	public String sendNotification(Notification notification) {
		return "Message sent by SMS";
	}
}
