package com.techlabs.listeners;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class SessionCounter
 *
 */
@WebListener
public class SessionCounter implements HttpSessionListener {
	private int totalSessionCount = 0;
	private ServletContext context = null;
	ServletContext ctx = null;
	static int totalUserCount = 0, currentUserCount = 0;

	public SessionCounter() {
	}

	/**
	 * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
	 */
	@Override
	public void sessionCreated(HttpSessionEvent event) {
		System.out.println("sessionCreated - add one session into counter");
		totalSessionCount++;
		totalUserCount++;
    	currentUserCount++;
    	
    	ctx = event.getSession().getServletContext();
    	
    	ctx.setAttribute("totalUsers", totalUserCount);
    	ctx.setAttribute("currentUsers", currentUserCount);
		
		if (context == null) {
			System.out.println("Hello");
			HttpSession session = event.getSession();
			context = session.getServletContext();
			context.setAttribute("sessionCounter", this);
		}
	}


	public int getTotalSessionCount() {
		return (totalSessionCount);
	}


	/**
	 * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
	 */
	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		System.out.println("sessionDestroyed - deduct one session from counter");
		currentUserCount--;
    	ctx.setAttribute("currentUsers", currentUserCount);
	}

}
