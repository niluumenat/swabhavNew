package com.techlabs.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.Student;
import com.techlabs.services.StudentService;

/**
 * Servlet implementation class EditController
 */
@WebServlet("/edit")
public class EditController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int paramValue = Integer.parseInt(request.getParameter("id"));

		StudentService service = StudentService.getInstance();
		Student student = service.getById(paramValue);

		request.setAttribute("id", student.getId());
		request.setAttribute("setName", student.getName());
		request.setAttribute("setCgpa", student.getCgpa());

		RequestDispatcher rd = request.getRequestDispatcher("edit.jsp");
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name1");
		String cgpa = request.getParameter("cgpa");

		int paramValue = Integer.parseInt(request.getParameter("id"));
		StudentService service = StudentService.getInstance();
		
		if (!name.equals("") && !cgpa.equals("")) {
			Student student1 = new Student(name, cgpa);
			service.edit(paramValue, student1);
			response.sendRedirect("students");
			
		} else {
			System.out.println("Hello from else part");
			String validationMessage = "Please fill all the details";
			request.setAttribute("validate", validationMessage);
			request.setAttribute("setName", name);
			request.setAttribute("setCgpa", cgpa);
			request.setAttribute("id", paramValue);
			
			RequestDispatcher rd = request.getRequestDispatcher("edit.jsp");
			rd.forward(request, response);

		}
	}
}
