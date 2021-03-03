package com.ld.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ld.jdbc.LoginHelper;

/**
 * Servlet implementation class LoginServlet
 */

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public LoginServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username").toString();
		String password = request.getParameter("password").toString();

		LoginHelper handler = new LoginHelper();
		try {
			if (handler.validateUser(username, password)) {

				PrintWriter out = response.getWriter();
				out.print("<html>");
				out.print("<body>");
				out.println("Bingo You are valid user. Enjoy Now");

				out.print("</body>");
				out.print("</html>");

			} else {

				PrintWriter out = response.getWriter();
				out.print("<html>");
				out.print("<body>");
				out.println("Sorry you are invalid user. Please check username or password");

				out.print("</body>");
				out.print("</html>");

			}
		} catch (Exception e) {

			PrintWriter out = response.getWriter();
			out.print("<html>");
			out.print("<body>");
			out.println("Response from Server : " + e.getMessage());

			out.print("</body>");
			out.print("</html>");

		}

		String message;

		if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {

			message = "Valid user. Show welcome page";

		} else {

			message = "Invalid user. Show login page again";

		}

		// response.getWriter().append("Served at: \nusername :"+username+"\nPassword :
		// "+ password ).append(request.getContextPath());

		// doGet(request, response);
	}

}
