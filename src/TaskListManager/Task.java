package TaskListManager;

public class Task {
	
	private String TaskName, TaskDescription;
	private boolean isDone = false;
	private String date; 
	
	public Task(String taskName,String taskDescription, String date) {
		this.TaskName = taskName;
		this.TaskDescription = taskDescription;
		this.date = date;
		
	}
	
	public String getName() {
		return this.TaskName;
	}
	
	public String getDescription() {
		return TaskDescription;
		
	}
	public String getDueDate() {
		return date;
	}
	
	public String toString() {
		return "Task:"+ getName()+ ", "+ getDescription()+ ",Due By: "+getDueDate() ;
	}

	public boolean isDone() {
		return this.isDone;
	}

	public void setDone(boolean b) {
		this.isDone = b;
	}

	public boolean updateDescription(String desc) {
		this.TaskDescription = desc;
		return true;
	}

	public boolean updateDueDate(String date) {
		this.date = date;
		return true;
	}

}
