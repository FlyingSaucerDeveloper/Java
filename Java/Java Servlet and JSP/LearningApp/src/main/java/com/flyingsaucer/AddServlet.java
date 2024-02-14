package com.flyingsaucer;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
// tHIS IS THE DEFAULT METHOD TO WHICH REQUEST GOES , HERE WE ARE OVERIDING IT AS WE ARE EXTENDING THE sERVLET cLASS
	/* 
	 * public void service(HttpServletRequest request, HttpServletResponse response)
	 * throws IOException {
	 * 
	 * int i = Integer.parseInt(request.getParameter("num1")); int j =
	 * Integer.parseInt(request.getParameter("num2"));
	 * 
	 * int result = i+j; System.out.println(result);
	 * 
	 * //sending result as response PrintWriter outPrintWriter =
	 * response.getWriter(); outPrintWriter.print("The answer is : "+result);
	 * 
	 * 
	 * }
	 */
	
	// To only receive post requests
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException 
	{
		
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		
		int result = i+j;
 
		
		//sending result as response
		//PrintWriter outPrintWriter = response.getWriter();
		//outPrintWriter.print("The sum is : "+result);
		
		request.setAttribute("sumResult", result);
		request.setAttribute("num1", i);
		request.setAttribute("num2", j);
		
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("sq");
		requestDispatcher.forward(request, response);
		
	}
	
	
	
}
