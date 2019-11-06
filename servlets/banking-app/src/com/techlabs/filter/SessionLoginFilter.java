package com.techlabs.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class SessionLoginFilter
 */
@WebFilter(value= {"/transaction","/passbook","/welcome","/download"})
public class SessionLoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public SessionLoginFilter() {
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
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httprequest = (HttpServletRequest) request;
		HttpSession session = httprequest.getSession();
		String userName = (String) session.getAttribute("userName");

		if (userName != null && !userName.equals("")) {
			chain.doFilter(request, response);
		}else{
			request.setAttribute("errorMsg","Please Login First");
			RequestDispatcher view = request.getRequestDispatcher("login.jsp");
			view.forward(request, response);	
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
