package com.flyingsaucer;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet_GET_POST extends HttpServlet {
	
	
	//overriding the service method of HttpServlet, in practice we use doGet and doPost method
	//service method is always called irrespective of the request type.
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2  = Integer.parseInt(request.getParameter("num2"));
		
		int result = num1 +  num2;
		
		System.out.println(result);

		
		request.setAttribute("result",result); //setting this attribute to sent our Addition result to the other servlet, from there we'll print the results together
		
		//Calling servlet from a servlet - Using request Dispatcher
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("sqr");
		requestDispatcher.forward(request, response);
		
		
		//Calling servlet from servlet - Using send Redirect
		// This is used when the user is require to be redirected to page on a different website - example: Redirection to a payment gateway
		
		
		}
	
	//How to redirect
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		System.out.println("Redirecting....");
		
		//Way 1 - Sending the values using Session 
		HttpSession session = request.getSession();
		System.out.println(request.getParameter("sname"));
		session.setAttribute("sessionValue", request.getParameter("sname"));
		
		//Way 1.1 -  Using SendRedirect // This will be used in either ways, either if we are sending value in the url or through the session
		response.sendRedirect("redirect?name="+request.getParameter("uname")); //Url Rewriting
		
		
		
		
		
	}
	
	

}
