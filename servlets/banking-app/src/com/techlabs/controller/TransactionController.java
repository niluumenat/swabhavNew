package com.techlabs.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.model.BankingMaster;
import com.techlabs.model.BankingTransaction;
import com.techlabs.service.BankService;

/**
 * Servlet implementation class TransactionController
 */
@WebServlet("/transaction")
public class TransactionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static String name =null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransactionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpServletRequest httprequest = (HttpServletRequest) request;
		HttpSession session = httprequest.getSession();
		name = (String) session.getAttribute("userName");
		RequestDispatcher view = request.getRequestDispatcher("transaction.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = this.name;
		String amount =request.getParameter("amount");
		String type= request.getParameter("type");
		
		System.out.println(userName+ " "+ amount +" "+ type);
		BankService service = BankService.getInstance();
		
		Date date = new Date();
		SimpleDateFormat ft = new SimpleDateFormat (" yyyy-MM-dd ");
		BankingTransaction transaction = new BankingTransaction(userName, amount, type, ft.format(date));
		
		service.update(transaction);
		
		response.sendRedirect("welcome");
		
		
	}

}
