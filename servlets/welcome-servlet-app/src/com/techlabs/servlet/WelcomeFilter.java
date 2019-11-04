package com.techlabs.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class WelcomeFilter
 */
@WebFilter(value={ "/welcome", "/AuthenticateServlet"})
public class WelcomeFilter implements Filter {
	protected FilterConfig config;
	/**
	 * Default constructor.
	 */
	public WelcomeFilter() {
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
		
		long startTime = System.currentTimeMillis();
		Date date = new Date();
		chain.doFilter(request, response);
		System.out.println("In time: "+ date.toString());
		HttpServletRequest httprequest =(HttpServletRequest) request;
		String name= httprequest.getRequestURI();
		long elapsed = System.currentTimeMillis() - startTime;
		
		System.out.println("Out time: "+ date.toString());
		
		System.out.println(name + " took " + elapsed + " ms");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig config) throws ServletException {
		this.config = config;
	}

}
