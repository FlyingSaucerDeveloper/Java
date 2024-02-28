package com.flyingsaucer;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String TRUE = null;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uname = request.getParameter("uname");
		String pswd = request.getParameter("pswd");

		UserDetailsPOJO userDetailsPOJO = new UserDetailsPOJO();

		System.out.println("The User Name is : " + uname + " and Password is : " + pswd + "\n");

		userDetailsPOJO.setUname(uname);
		userDetailsPOJO.setPswd(pswd);

		UserDetailsService service = new UserDetailsService();

		try {
			if (service.fetchAndCheckUserData(userDetailsPOJO.getUname(), userDetailsPOJO.getPswd())) {

				HttpSession session = request.getSession();
				session.setAttribute("uname", userDetailsPOJO.getUname());
				session.setAttribute("pswd", userDetailsPOJO.getPswd());
				response.sendRedirect("Welcome.jsp");

			}
			else {
				System.out.println("Connection Failed");
				response.sendRedirect("LoginPage.html");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
