package com.ld.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */

@WebServlet(
        urlPatterns = "/servlet2",
        initParams = {
                @WebInitParam(name = "config_DRIVER", value = "com.mysql.jdbc.Driver"),
                @WebInitParam(name = "config_URL", value = "jdbc:mysql://localhost/test_config_servlet2"),
                @WebInitParam(name = "config_Username", value = "root_dml"),
                @WebInitParam(name = "config_Password", value = "root_dml"),
        })



public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet2() {
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

		ServletContext context=getServletContext();  
		String DB_DRIVER = context.getInitParameter("context_DRIVER");
		String DB_URL = context.getInitParameter("context_URL");
		String username = context.getInitParameter("context_Username");
		String password = context.getInitParameter("context_Password");
		int latest_i;
		if(context.getAttribute("userCount") != null) {
			latest_i = Integer.parseInt(context.getAttribute("userCount").toString());
		}else {
			latest_i = 0;
		}
		 
		
		
		
		PrintWriter out = response.getWriter(); 
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
			
		out.println("<h3 style=\"color: red;\">Servlet Context Details</h3>");
		out.println("<h3>DB_DRIVER : "+ DB_DRIVER +"</h3>");
		out.println("<h3>DB_URL : "+ DB_URL +"</h3>");
		out.println("<h3>Username :"+ username +"</h3>");
		out.println("<h3>Password :"+ password +"</h3>");
		out.println("<h3>User Count :"+ latest_i +"</h3>");
		
		
		ServletConfig config = getServletConfig();
		DB_DRIVER = config.getInitParameter("config_DRIVER"); 
		DB_URL = config.getInitParameter("config_URL");
		username = config.getInitParameter("config_Username");
		password = config.getInitParameter("config_Password");
		
		
		out.println("<h3 style=\"color: red;\">Servlet Config Details</h3>");			
		out.println("<h3>DB_DRIVER : "+ DB_DRIVER +"</h3>");
		out.println("<h3>DB_URL : "+ DB_URL +"</h3>");
		out.println("<h3>Username :"+ username +"</h3>");
		out.println("<h3>Password :"+ password +"</h3>");
		out.println("</body>");
		out.println("</html>");
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
