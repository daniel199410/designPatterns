package behavioral.strategy;

public class Context {
	NotificationStrategy strategy;

	public Context(NotificationStrategy strategy) {
		this.strategy = strategy;
	}

	public String sendNotification(Notification notification) {
		return strategy.sendNotification(notification);
	}
}
