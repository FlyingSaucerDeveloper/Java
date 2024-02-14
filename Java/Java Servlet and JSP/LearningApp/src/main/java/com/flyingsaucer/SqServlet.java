package com.flyingsaucer;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
	
		
		
		int num1 = (int)(request.getAttribute("num1"));
		int num2 = (int)(request.getAttribute("num2"));
		
		System.out.println("Num 1 : "+num1);
		
		int result = (int)(request.getAttribute("sumResult"));
		
		
		
		int s1 = num1*num1;
		int s2 = num2*num2;
		
		PrintWriter printWriter = response.getWriter();
		
	
		printWriter.println("The sum is : "+result);
		
		printWriter.print("The square of numbers,"+num1+" :"+s1+" and "+num2+" :"+s2 );
	}
	
	
}
