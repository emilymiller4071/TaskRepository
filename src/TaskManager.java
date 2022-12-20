import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import business.TaskLogic;
import model.Task;

public class TaskManager {

	public static void main(String[] args) throws SQLException {
		
		// loop through all the tasks in our database
		for (Task task : TaskLogic.getAllTasks()) {
			
			System.out.println(task);
		}
		
//		// get the task description and print it out
//		String description = resultSet.getString("Description");
//		System.out.println("The task description is: " + description);
//		
//		int priority = resultSet.getInt(4);
//		System.out.println("The priority of this task is: " + priority);
//
//		
//		
//		// I want to close out of these records once I've verified there's at least one
//		resultSet.close();
//		
//		String preparedStatementSql = "SELECT * FROM Task "
//				+ "WHERE Difficulty = ?";
//		PreparedStatement preparedStatement1 = connection.prepareStatement(preparedStatementSql);
//		preparedStatement1.setInt(1, 3); // base 1 so position 1, task priority 3
//		ResultSet psResultSet = preparedStatement1.executeQuery();
//		
//		System.out.println(psResultSet.getString("The most difficult task is: " + psResultSet.getString("Description")));
//	
		
//		String insertSql = "INSERT INTO Task (ListID, Description, Priority, Difficulty)" +
//				"VALUES (?,?, ?, ?)";
//		PreparedStatement insertPs = connection.prepareStatement(insertSql);
//		insertPs.setInt(1, 1);
//		insertPs.setString(2, "Clean out fridge");
//		insertPs.setInt(3, 1);
//		insertPs.setInt(4, 3);
//		int rowCount = insertPs.executeUpdate();
//		System.out.println(rowCount + " rows were added");
//		
//		String updateSql = "UPDATE Task SET "+
//		"Description = ? "+
//		"WHERE ID = ?";
//		PreparedStatement updatePs = connection.prepareStatement(updateSql);
//		updatePs.setString(1, "Mop the floors");
//		updatePs.setInt(2, 5);
//		int rowCount1 = updatePs.executeUpdate();
//		System.out.println(rowCount1 + " rows updated");
//		
//		String deleteSql = "DELETE FROM Task "
//				+ "WHERE ID = ?";
//		PreparedStatement deletePs = connection.prepareStatement(deleteSql);
//		deletePs.setInt(1,6);
//		int rowCount2 = deletePs.executeUpdate();
//		System.out.println(rowCount2 + " rows deleted");
		
		
		
		
//		connection.close();
	}

}
