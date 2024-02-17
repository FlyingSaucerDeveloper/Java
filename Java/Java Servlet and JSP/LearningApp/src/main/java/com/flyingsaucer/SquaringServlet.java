package com.flyingsaucer;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SquaringServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		int additionResult = (int) request.getAttribute("result");
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));

		int r1 = num1*num1;
		int r2 = (int) Math.pow(num2,2);
		
		PrintWriter printWriter = response.getWriter();
		
		
		printWriter.println("Sum of numbers: "+ additionResult);
		
		printWriter.println("<br>Square of: "+num1+" is: "+r1);
		printWriter.print("<br>Square of: "+num2+" is: "+r2);
		
		
	}
	
	
}
