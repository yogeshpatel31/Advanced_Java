package com.ld.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet(description = "Test", urlPatterns = { "/servlet1" },
initParams = {@WebInitParam(name = "config_DRIVER", value = "com.mysql.jdbc.Driver"),
		@WebInitParam(name = "config_URL", value = "jdbc:mysql://localhost/test_config"),
		@WebInitParam(name = "config_Username", value = "root_dql"),
		@WebInitParam(name = "config_Password", value = "root_dql"),
}) 
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String DB_DRIVER;
	private String DB_URL;
	private String username;
	private String password;
	static int i = 0;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext context=getServletContext();  
		DB_DRIVER = context.getInitParameter("context_DRIVER");
		DB_URL = context.getInitParameter("context_URL");
		username = context.getInitParameter("context_Username");
		password = context.getInitParameter("context_Password");
		context.setAttribute("userCount", ++i);
		
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
