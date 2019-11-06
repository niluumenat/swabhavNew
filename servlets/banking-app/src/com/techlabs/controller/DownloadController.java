package com.techlabs.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.model.BankingTransaction;
import com.techlabs.service.BankService;

/**
 * Servlet implementation class DownloadController
 */
@WebServlet("/download")
public class DownloadController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownloadController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		{
		    response.setContentType("text/csv");
		    response.setHeader("Content-Disposition", "attachment; filename=\"passBook.csv\"");
		    try
		    {	
		    	HttpServletRequest httprequest = (HttpServletRequest) request;
				HttpSession session = httprequest.getSession();
				String userName = (String) session.getAttribute("userName");
		    	BankService s = BankService.getInstance();
		    	List<BankingTransaction> trans = s.getByNameTrans(userName);
				request.setAttribute("transaction", trans);
		        OutputStream outputStream = response.getOutputStream();
		        String outputResult=null;
		        for(BankingTransaction t1 : trans){
		        	outputResult = t1.getName()+","+t1.getAmount()+","+ t1.getType()+","+ t1.getDate()+"\n";
		        	outputStream.write(outputResult.getBytes());
		        }
		        
		        outputStream.flush();
		        outputStream.close();
		    }
		    catch(Exception e)
		    {
		        System.out.println(e.toString());
		    }
		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
