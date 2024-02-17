package com.flyingsaucer;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class RedirectHere extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		HttpSession session = request.getSession();
		
		String sname= (String) session.getAttribute("sessionValue");
		String uname= request.getParameter("name");
		
		
		PrintWriter printWriter = response.getWriter();
		printWriter.print(uname);
		printWriter.print(sname);
		
	}
	
}
