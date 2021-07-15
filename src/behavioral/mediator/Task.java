package behavioral.mediator;

public class Task implements TaskColleague{
	private final String name;
	private final TaskExecutionMediator taskExecutionMediator;

	public Task(TaskExecutionMediator taskExecutionMediator, String name) {
		this.name = name;
		this.taskExecutionMediator = taskExecutionMediator;
	}

	public String getName() {
		return name;
	}

	@Override
	public String run() {
		return this.taskExecutionMediator.run(this);
	}

	@Override
	public String end() {
		return this.taskExecutionMediator.end(this);
	}
}
