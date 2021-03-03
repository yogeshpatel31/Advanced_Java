package com.ld.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet3
 */
@WebServlet("/servlet3")
public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	int count;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet3() {
        super();
        System.out.println("I am constructor.");
        
        
        // TODO Auto-generated constructor stub
    }

    
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
    	count = 0;
    	System.out.println("I am init(). Value of count =  "+ count);
    	
    	
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Request Served and Value of count"+ ++count);
		init();
		destroy();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("I am destroy(). Value of count =  "+ count);
		super.destroy();
		count = 0;
		System.out.println("I am destroy(). Value of count =  "+ count);
		
	}
	
}
