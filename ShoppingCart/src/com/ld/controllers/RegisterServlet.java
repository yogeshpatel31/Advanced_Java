package com.ld.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ld.helper.RegistrationHelper;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String requestArrived = request.getParameter("page");
		
		if (requestArrived.equalsIgnoreCase("register")) {

			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
			String mobileNo = request.getParameter("mobileNo");

			RegistrationHelper helper = new RegistrationHelper();
			boolean flag = helper.registerUser(username, password, firstName, lastName, mobileNo);

			if (flag) {

				PrintWriter out = response.getWriter();
				out.println("<html>");
				out.println("<head>");
				out.println("</head>");
				out.println("<body>");
				out.print("You are registered successfully. Plese click here to login.");
				out.println("<a href='index.html'>Login</a>");
				out.println("</body>");
				out.println("</html>");

			} else {

				System.out.println("Flag = "+ flag);
				//response.sendRedirect("index.html?message=Invalid Username or Password");
			}

		} else if (requestArrived.equalsIgnoreCase("login")) {

			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			RegistrationHelper helper = new RegistrationHelper();
			try {
				boolean flag = helper.validateUser(username, password);
											
				if(flag) {
					
					HttpSession session = request.getSession();
					session.setAttribute("username", username);
					response.sendRedirect("welcome.jsp");
					
				}else {
					
					response.sendRedirect("index.html");
					
				}
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// RegistrationHelper reHelper = new RegistrationHelper();
		// boolean flag = false;//reHelper.registerUser(username, password, firstName,
		// lastName, mobileNo);

		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
