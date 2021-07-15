package behavioral.mediator;

public abstract class TaskExecutionMediator {
	private final int threads;

	public TaskExecutionMediator(int threads) {
		this.threads = threads;
	}

	public int getThreads() {
		return threads;
	}

	abstract boolean isAbleToRun();
	abstract String run(Task task);
	abstract String end(Task task);
}
