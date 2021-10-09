package com.abc.bankapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class ChangePwd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException{
   		HttpSession session = request.getSession();
   		int accno = (int) session.getAttribute("accno");
   		String pwd = request.getParameter("npd");
   		
   		Model model = new Model();
   		model.setAccno(accno);
   		model.setPwd(pwd);
   		boolean result = model.changePassword();
   		
   		if(result==true)
   		{
   			response.sendRedirect("/BankApp/ChangePwdSuccess.html");
   		}
   		else
   		{
   			response.sendRedirect("/BankApp/ChangePwdFail.html");
   		}
	}

}
