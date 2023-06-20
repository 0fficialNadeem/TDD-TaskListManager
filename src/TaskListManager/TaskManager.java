package TaskListManager;

import java.util.HashMap;
import java.util.Map;

public class TaskManager {
	Map <String,Task> list = new HashMap<>();
	
	public boolean add(String key,Task task) {
		list.put(key, task);
		return true;
	}

	public Task getTask(String taskName) {
		return list.get(taskName);
	}

	public boolean deleteTask(String string) {
		if(list.containsKey(string)) {
			list.remove(string);
			return true;
		}
		return false;
	}

	public boolean display() {
		if(list.size()>0) {
			int count = 1;
			for(String key : list.keySet()) {
				System.out.println(count+". "+list.get(key));
				count++;
			}
			count = 0;
			return true;
		}
		return false;
	}
	
}
