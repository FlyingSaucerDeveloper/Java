package com.flyingsaucer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//using the DAO to get the data from the database

//DAO - Data Access Object


class StudentDetails{
	
	private String nameString;
	private int stuID;
	
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getStuID() {
		return stuID;
	}
	public void setStuID(int stuID) {
		this.stuID = stuID;
	}
	
}


class studentDAO {
	
	public StudentDetails getDetails(int id)
	{
		StudentDetails studentDetails = new StudentDetails();
		studentDetails.setStuID(id);
		
		//Working in JDBC
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/jdbc_Learning_DB";
			String user_name="root";
			String pswd = "Sharma1234@";
		
			Connection conn = DriverManager.getConnection(url ,user_name, pswd);
			
			Statement st = conn.createStatement();
				
			String sqlQuery1 = "Select name from students where stuid ="+id;
			
			ResultSet result = st.executeQuery(sqlQuery1);
			
			result.next();
			
			studentDetails.setNameString(result.getString("name"));
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return studentDetails;
		
	}
	
}



public class JDBC_02_DAO {
	
	public static void main(String argString[]) {
		
		studentDAO dao = new studentDAO();
		StudentDetails studemtDetails = dao.getDetails(343);
		System.out.println(studemtDetails.getNameString());
		
	}
	

}
