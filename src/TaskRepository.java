import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import model.Task;

public class TaskRepository {
	
	private static Connection getConnection() throws SQLException {
		String host = "localhost";
		String sqlInstance = "DESKTOP-VDMQ3OL\\SQLEXPRESS";
		String sqlDatabase = "TaskManager";
		String sqlUser = "TaskManagerLogin";
		String sqlPassword = "Circlewood15!";
		
		String jdbcConnection = String.format("jdbc:sqlserver://%s:1433;instance=%s:databaseName=%s;encrypt=true;trustServerCertificate=true",
				host,
				sqlInstance,
				sqlDatabase);
		
		Connection connection = DriverManager.getConnection(jdbcConnection, sqlUser, sqlPassword);
		System.out.println("Connection to database successful!");
		
		return connection;
		
	}
	
	/* CRUD Operations
	 * 
	 * (C)reate = creates a new Task
	 * (R)ead = get a single Task or multiple Tasks
	 * (U)pdate = updates a Task
	 * (D)elete = delete a Task
	 */ 
	
	 
	// method that returns all of the tasks in our database
	public static ArrayList<Task> getAllTasks() throws SQLException {
		Statement statement = getConnection().createStatement();
		String sql = "SELECT * FROM Task";
		ArrayList<Task> allTasks = new ArrayList<Task>();
		
		ResultSet resultSet = statement.executeQuery(sql);
		
		while(resultSet.next()) {
			
			// for each result, create a new Task object using column values
			Task taskToAdd = new Task (
					resultSet.getInt("ID"),
					resultSet.getInt("ListID"),
					resultSet.getString("Description"),
					resultSet.getInt("Priority"),
					resultSet.getInt("Difficulty"),
					LocalDateTime.parse(resultSet.getString("DueDate"))
					);
			
			// add the Task to the list
			allTasks.add(taskToAdd);
		}
		
		
		return allTasks;
	}
	
	
	// method that returns all of the tasks in our list
	
	
	// method that returns a single task
	
	
	// method that adds a new task
	
	
	//method that deletes a task
	
	
	//method that updates a task

}
