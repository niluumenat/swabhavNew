package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.Contact;
import com.techlabs.service.ContactService;

/**
 * Servlet implementation class AddController
 */
@WebServlet("/addContact")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddController() {
        super();
        System.out.println("add controller created");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String phoneno =request.getParameter("phoneno") ;
		String emailid = request.getParameter("emailid");
		
		System.out.println(firstname + " "+lastname+ " "+ phoneno+ " "+ emailid );
		
		
		if (!firstname.equals("") && !lastname.equals("") && !emailid.equals("")) {
			Contact c= new Contact(firstname, lastname,phoneno, emailid);
			ContactService service = ContactService.getInstance();
			service.addStudents(c);
			
			response.sendRedirect("Contacts");

		} else {
			String validationMessage="Please fill all the details";
			request.setAttribute("validate",validationMessage);
			
			request.setAttribute("setFirstName", firstname);
			request.setAttribute("setLastName", lastname);
			request.setAttribute("setPhoneNo", phoneno);
			request.setAttribute("setEmailId", emailid);
			
			RequestDispatcher rd=request.getRequestDispatcher("addContact.jsp"); 
			rd.forward(request, response);
			
		}

	}

}
