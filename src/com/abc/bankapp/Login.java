package com.abc.bankapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Login extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String custid = request.getParameter("custid");
		String pwd = request.getParameter("pwd");
		Model model = new Model();
		model.setCustid(custid);
		model.setPwd(pwd);
		boolean result = model.login();
		if(result==true) 
		{
			int accno = model.getAccno();
			String name = model.getName();
			HttpSession session = request.getSession(true);
			session.setAttribute("accno", accno);
			session.setAttribute("name", name);
			response.sendRedirect("/BankApp/home.jsp");
		}
		else
		{
			response.sendRedirect("/BankApp/errorLogin.html");
		}
	}

}
	

