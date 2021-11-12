package behavioral.templateMethod.models;

import behavioral.templateMethod.enums.EnumNotificationStatus;

public class Notification {
	String message;
	private EnumNotificationStatus status;
	private Integer attempts;
	private final int id;

	public Notification(int id) {
		this.id = id;
		this.attempts = 0;
	}

	public void setStatus(EnumNotificationStatus status) {
		this.status = status;
	}

	public Integer getAttempts() {
		return attempts;
	}

	public void setAttempts(Integer attempts) {
		this.attempts = attempts;
	}

	public int getId() {
		return id;
	}

	public EnumNotificationStatus getStatus() {
		return status;
	}
}
