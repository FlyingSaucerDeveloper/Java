package com.flyingsaucer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDetailsService {
	// In this class method we will check the if user id and password is true or not
	public Boolean fetchAndCheckUserData(String uname, String pswd) throws ClassNotFoundException {

		String url = "jdbc:mysql://localhost:3306/LoginApp";
		String user = "root";
		String password = "Sharma1234@";

		try {
			// Register the JDBC Driver.
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("JDBC Class Registered");

			// Connect to the MySql DB
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connection Successfull");

			// Create a Statement
			String query = "select * from userData where username =  ? and password = ? ";
			PreparedStatement preparedStatement = connection.prepareStatement(query);

			// Execute the Query
			preparedStatement.setString(1, uname);
			preparedStatement.setString(2, pswd);

			System.out.println("The Queried Statement is : " + preparedStatement);

			ResultSet resultSet = preparedStatement.executeQuery();
			
			resultSet.next();
			System.out.println("The Resultset has User name : "+ resultSet.getString("username") );
			
			if (resultSet.getString("username").contentEquals(uname) ) {
				System.out.println("The Result Set verified");
				return true;

			}
			preparedStatement.close();
			connection.close();

		} catch (Exception e) {
		System.out.println(e);	
		
		}

		return false;

	}

}
