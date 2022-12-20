package business;

import java.sql.SQLException;
import java.util.ArrayList;

import data.TaskRepository;
import model.Task;

public class TaskLogic {
	public static ArrayList<Task> getAllTasks() throws SQLException{
		return TaskRepository.getAllTasks();
	}
	
	public static ArrayList<Task> getAllTasksByList(int listId) {
		ArrayList<Task> filteredList = TaskRepository.getAllTasks().stream().filter(task -> task.getListId().collect(Collectors.toList());
	}
	
}
