package TaskListManager;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TaskListManagerTest {
	@Test
	public void addNewTask() {
		TaskManager manager = new TaskManager();
		Task task = new Task("Laundary","Wash dirty clothes","29/06/2024");
		boolean success = manager.add(task.getName(),task);
		assertTrue(success,"Should be able to add a new task.");	
	}
	@Test
	public void MarkTaskAsDone() {
		TaskManager manager = new TaskManager();
		Task task = new Task("Laundary","Wash dirty clothes","29/06/2024");
		manager.add(task.getName(), task);
		Task fetchedTask = manager.getTask("Laundary");
		fetchedTask.setDone(true);
		boolean status = fetchedTask.isDone();
		assertSame(task,fetchedTask,"fetchedTask should be the same as the one added.");
		assertTrue(status,"task in manager should be marked as done.");
	}
	@Test
	public void UpdateTask() {
		TaskManager manager = new TaskManager();
		Task task = new Task("Laundary","Wash dirty clothes","29/06/2024");
		manager.add(task.getName(), task);
		Task fetchedTask = manager.getTask("Laundary");
		boolean successA = fetchedTask.updateDescription("Add to washing machine.");
		boolean successB = fetchedTask.updateDueDate("24/05/2025");
		assertTrue(successA,"Should have updated description.");
		assertTrue(successB, "should have updated due date.");
	}
	@Test
	public void DeleteTask() {
		TaskManager manager = new TaskManager();
		Task task = new Task("Laundary","Wash dirty clothes","29/06/2024");
		manager.add(task.getName(), task);
		boolean success = manager.deleteTask("Laundary");
		assertTrue(success,"should be able to delete task if it exists.");	
	}
	@Test
	public void NotAbleToDeleteWhenEmpty() {
		TaskManager manager = new TaskManager();
		boolean success = manager.deleteTask("Laundary");
		assertFalse(success,"should not be able to delete a task when none exist.");
		
	}
	
	@Test
	public void viewTasks() {
		TaskManager manager = new TaskManager();
		Task task = new Task("Laundary","Wash dirty clothes","29/06/2024");
		manager.add(task.getName(), task);
		Task task2 = new Task("Cook","cook food for dinner","20/06/2024");
		manager.add(task2.getName(), task2);
		Task task3 = new Task("Clean","clean house","20/06/2024");
		manager.add(task3.getName(), task3);
		boolean success = manager.display();
		assertTrue(success,"should be able to display task list.");
		
	}

}
