package com.ld.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class MyFilter2
 */
@WebFilter(filterName="filterTwo")
public class MyFilter2 implements Filter {

	/**
	 * Default constructor.
	 */
	public MyFilter2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// Pre-Processing Code
		PrintWriter out = response.getWriter();
		out.println("<br/>MyFilter2 is invoked before<br/>");
		
		chain.doFilter(request, response);
		
		// Post-Processing Code
		out.println("<br/>MyFilter2 is invoked after<br/>");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
