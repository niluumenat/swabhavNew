package com.techlabs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public WelcomeServlet() {
		super();
		System.out.println("Servlet Created");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside Get");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String docType = "<!doctype html>";

		String name = request.getParameter("Developer");
		if (name == "") {
			out.println("Welcome to Servlet");
		} else {
			for (int i = 0; i < 5; i++) {
				out.println(docType + "<html>\n" + "<body bgcolor = \"#ff0000\" >\n" + "</body></html>"
			+ "<h1 align=\"center\">" + name+ "</h1><br>");
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside Post");
	}
}
