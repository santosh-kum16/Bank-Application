package com.abc.bankapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Transfer
 */
public class Transfer extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession();
		int accno = (int) session.getAttribute("accno");
		String racno = request.getParameter("racn");
		String balance = request.getParameter("amt");
		
		int theRacn = Integer.parseInt(racno);
		int theAmt = Integer.parseInt(balance);
		
		
		session.setAttribute("balance", theAmt);
		session.setAttribute("racn", theRacn);
		
		
		Model model =new Model();
		model.setAccno(accno);
		model.setBalance(theAmt);
		model.setRacno(theRacn);
		
		boolean result = model.transfer();
		
		if(result==true)
			response.sendRedirect("/BankApp/transferSuccess.jsp");
		else
			response.sendRedirect("/BankApp/transferFail.html");
		
		
	}

}
