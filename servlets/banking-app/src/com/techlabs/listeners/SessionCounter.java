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
	private int currentSessionCount =0;
	private ServletContext context = null;

    public SessionCounter() {
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent event)  { 
    	currentSessionCount ++;
    	if (context == null) {
    	    storeInServletContext(event);
    	   }
    }

	private void storeInServletContext(HttpSessionEvent event) {
		HttpSession session = event.getSession();
	    context = session.getServletContext();
	    context.setAttribute("sessionCounter", this);
	}
	
	public int getCurrentSessionCount() {
		  return(currentSessionCount );
		}

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent event)  { 
    		currentSessionCount --;
    }
    
    
	
}
