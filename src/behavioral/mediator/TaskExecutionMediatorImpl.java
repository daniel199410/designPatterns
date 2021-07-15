package behavioral.mediator;

import java.util.LinkedList;

public class TaskExecutionMediatorImpl extends TaskExecutionMediator{
	private final LinkedList<TaskColleague> tasks = new LinkedList<>();

	public TaskExecutionMediatorImpl(int threads) {
		super(threads);
	}

	@Override
	public boolean isAbleToRun() {
		return tasks.size() < getThreads();
	}

	@Override
	public String run(Task task) {
		if(isAbleToRun()) {
			tasks.add(task);
			return String.format("Running task %s", task.getName());
		} else {
			return String.format("Unable to run task %s. Thread limit exceeded.", task.getName());
		}
	}

	@Override
	public String end(Task task) {
		tasks.remove(task);
		return String.format("Task %s finished successfully", task.getName());
	}
}
