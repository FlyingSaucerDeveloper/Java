package com.flyingsaucer;

/*
 * 1. import --> java.sql
 * 2. load and register  the driver --> com.mysql.jdbc.Driver
 * 3. Create connection -> object of connection interface
 * 4. Create a statement ->  object of statement interface
 * 5. execute the query
 * 6. Process the result 
 * 7. Close the connection
   */

// !!!-> 1.
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
// and Add the jar file it in the libraries
import java.util.Scanner;

import com.mysql.cj.exceptions.RSAException;

public class JDBC_01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// !!!-> 2. 
		Class.forName("com.mysql.jdbc.Driver");
		
		
		//
		String url = "jdbc:mysql://localhost:3306/jdbc_Learning_DB";
		String user_name="root";
		/*
		*Scanner sc = new Scanner(System.in);
		*System.out.print("Enter The Password : ");
		*String pswd = sc.nextLine();
		*/
		
		String pswd = "Sharma1234@";
		//		
		
		
		// !!!-> 3.
		Connection conn = DriverManager.getConnection(url ,user_name, pswd);
		
		// !!!-> 4. 
		Statement st = conn.createStatement();
		
		
		//
		String sqlQuery1 = "Select * from students where stuid =222";
		//
		
		
		// !!!-> 5.
		ResultSet result = st.executeQuery(sqlQuery1);
		
		//
		String stuName = new String();		
		//
		
		// !!!-> 6.
		result.next();
		String nameString = result.getString("name");
		Integer rollInteger = result.getInt("stuid");
		System.out.println(nameString); // the first entry will be printed
		System.out.println(rollInteger);
		
		//----> Getting all the data
		System.out.println("\nAll the Data");
		String sqString2 = "Select * from students";
		
		result = st.executeQuery(sqString2);
		
		String studentDetail =  "";
		List<String> data  = new ArrayList<>();
		
		while(result.next()) {
			 studentDetail = result.getInt("stuid")+" : "+result.getString("name")+", Fees: "+result.getInt("fees");
			data.add(studentDetail);
		}
		
			for (String string : data) {
						System.out.println(string);
			}
		
		
		//----> Inserting the values in the database
		System.out.println("\nInserting the data");
		String sqlString2 = "insert into students values (202,'Mohit k Sharma',11,'B',4520,'Kashmir House')";
		/*Execute Query is used for select queries as it returns the data*/
		/*ExecuteUpdate is used for the insert query as it returns number of rows affected*/
		
		int rowsAffectedCount = st.executeUpdate(sqlString2);
		System.out.println("Number of rows affected : "+ rowsAffectedCount);
			
		//----> Using The Prepared Statement, when we need to execute same query for different variables
		System.out.println("\nInserting the data using the Prepared Statement");
		String sqlString3 = "insert into students values(?, ?, ?, ?, ?, ?)";
		PreparedStatement preparedStatement = conn.prepareStatement(sqlString3);
		
		preparedStatement.setInt(1, 343);
		preparedStatement.setString(2, "Kartik Sharma");
		preparedStatement.setInt(3, 12);
		preparedStatement.setString(4, "B");
		preparedStatement.setInt(5, 5555);
		preparedStatement.setString(6, "Kashmir House");
		
		rowsAffectedCount = preparedStatement.executeUpdate();
		System.out.println("Number of rows affected : "+ rowsAffectedCount);
		//
		
			
		// !!!-> 7.
		st.close();
		conn.close();
		

	}

}
