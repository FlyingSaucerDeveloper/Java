package com.flyingsaucer;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	//overriding the service method of HttpServlet, in practice we use doGet and doPost method
	//service method is always called irrespective of the request type.
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		int result = num1 +  num2;
		
		System.out.println(result);
		
		//sending the data/response to the page/browser
		
		PrintWriter printWriter = response.getWriter();
		
		printWriter.print("Sum : "+ result);
		
		}
	
	
}
