package com.techlabs.controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.model.Contact;
import com.techlabs.service.ContactService;

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
		String id = request.getParameter("id");
		System.out.println(id);
		ContactService service = ContactService.getInstance();
		List<Contact> contact = service.getByName(id);

		for (Contact c : contact) {
			request.setAttribute("id", c.getId());
			request.setAttribute("setFname", c.getFirstname());
			request.setAttribute("setLname", c.getLastName());
			request.setAttribute("setPhoneno", c.getPhoneNo());
			request.setAttribute("setEmailid", c.getEmailId());

			RequestDispatcher rd = request.getRequestDispatcher("editContact.jsp");
			rd.forward(request, response);

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String firstname = request.getParameter("fname");
		String lastname = request.getParameter("lname");
		String phoneno = request.getParameter("phoneno");
		String emailid = request.getParameter("emailid");

		ContactService service = ContactService.getInstance();
		String id = request.getParameter("id");
		System.out.println(firstname + " " + lastname + " " + phoneno + " " + emailid);

		if (!firstname.equals("") && !lastname.equals("") && !emailid.equals("") && !phoneno.equals("")) {
			Contact c = new Contact(firstname, lastname, phoneno, emailid);
			service.editContact(id, c);
			response.sendRedirect("Contacts");

		} else {
			String validationMessage = "Please fill all the contact details";
			request.setAttribute("validate", validationMessage);

			request.setAttribute("setFname", firstname);
			request.setAttribute("setLname", lastname);
			request.setAttribute("setPhoneno", phoneno);
			request.setAttribute("setEmailid", emailid);

			RequestDispatcher rd = request.getRequestDispatcher("editContact.jsp");
			rd.forward(request, response);

		}

	}

}
