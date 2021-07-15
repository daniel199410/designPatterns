package behavioral.mediator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MediatorTest {
	@Test
	public void shouldRunTask() {
		Task task = new Task(new TaskExecutionMediatorImpl(1), "task1");
		assertEquals("Running task task1", task.run());
	}

	@Test
	public void shouldNotRunTaskDueToExceededThreadLimit() {
		TaskExecutionMediator taskExecutionMediator = new TaskExecutionMediatorImpl(1);
		Task task = new Task(taskExecutionMediator, "task1");
		Task task2 = new Task(taskExecutionMediator, "task2");
		task.run();
		assertEquals("Unable to run task task2. Thread limit exceeded.", task2.run());
	}

	@Test
	public void shouldBeAbleToRunTwoTasksSimultaneously() {
		TaskExecutionMediator taskExecutionMediator = new TaskExecutionMediatorImpl(2);
		Task task = new Task(taskExecutionMediator, "task1");
		Task task2 = new Task(taskExecutionMediator, "task2");
		task.run();
		assertEquals("Running task task2", task2.run());
	}

	@Test
	public void shouldBeAbleToRunSecondTaskWhenFirstTaskEnds() {
		TaskExecutionMediator taskExecutionMediator = new TaskExecutionMediatorImpl(2);
		Task task = new Task(taskExecutionMediator, "task1");
		Task task2 = new Task(taskExecutionMediator, "task2");
		task.run();
		task.end();
		assertEquals("Running task task2", task2.run());
	}
}
