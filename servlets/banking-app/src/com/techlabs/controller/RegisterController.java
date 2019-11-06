package com.techlabs.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.model.BankingMaster;
import com.techlabs.model.BankingTransaction;
import com.techlabs.model.Type;
import com.techlabs.service.BankService;

/**
 * Servlet implementation class BankingController
 */
@WebServlet("/register")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher view = request.getRequestDispatcher("register.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("username");
		String userPassword= request.getParameter("userpassword");
		String userPass2= request.getParameter("userpassword2");
		String balance= request.getParameter("balance");
		
		if(userPassword.equals(userPass2)){
			Date date = new Date();
			SimpleDateFormat ft = new SimpleDateFormat (" yyyy-MM-dd ");
			
			System.out.println(ft.format(date));
			BankingMaster master = new BankingMaster(userName, userPassword, balance);
			BankingTransaction transaction = new BankingTransaction(userName, balance, "Deposite",ft.format(date));
			
			BankService service = BankService.getInstance();
			service.add(master, transaction);
			
			response.sendRedirect("login");
			
		}else{
			request.setAttribute("errorMsg","Password does not match...re-type the password");
			RequestDispatcher view = request.getRequestDispatcher("register.jsp");
			view.forward(request, response);
		}
	}


}
