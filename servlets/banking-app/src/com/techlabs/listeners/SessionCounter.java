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
	private int currentSessionCount = 0;
	private static int activeSessions = 0;
	private ServletContext context = null;

	public SessionCounter() {
	}

	/**
	 * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
	 */
	@Override
	public void sessionCreated(HttpSessionEvent event) {
		System.out.println("sessionCreated - add one session into counter");
		totalSessionCount++;
		currentSessionCount++;
		activeSessions++;
		if (context == null) {
			System.out.println("Hello");
			HttpSession session = event.getSession();
			context = session.getServletContext();
			context.setAttribute("sessionCounter", this);
		}
	}

	public int getCurrentSessionCount() {
		return (currentSessionCount);
	}

	public int getTotalSessionCount() {
		return (totalSessionCount);
	}

	public static int getActiveSessions() {
		return activeSessions;
	}

	/**
	 * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
	 */
	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		System.out.println("sessionDestroyed - deduct one session from counter");
		currentSessionCount--;
		if (activeSessions > 0)
			activeSessions--;
	}

}
