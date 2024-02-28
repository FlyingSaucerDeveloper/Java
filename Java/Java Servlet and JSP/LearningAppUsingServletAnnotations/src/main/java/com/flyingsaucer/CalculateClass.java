package com.flyingsaucer;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calculate") // Whatever we do to register the servlet in the xml, we can do with this annotation.
public class CalculateClass extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		int result = num1 + num2;
		
		PrintWriter printWriter = response.getWriter();
		printWriter.print("Sum of numbers is : "+ result);
		
		
		
	}
	
	
}
