package com.abc.bankapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ApproveLoan
 */
public class ApproveLoan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApproveLoan() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		HttpSession session = request.getSession();
		int accno = (int) session.getAttribute("accno");
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String occupation = request.getParameter("occupation");
		String loan_type = request.getParameter("loan_type");
		int salary = Integer.parseInt(request.getParameter("salary"));
		int loan_amount = Integer .parseInt(request.getParameter("loan_amount"));
		int time_duration = Integer.parseInt(request.getParameter("time_duration"));
		int interest = Integer.parseInt(request.getParameter("interest"));
		
		
		
		Model model = new Model();
		
		model.setFirst_name(first_name);
		model.setLast_name(last_name);
		model.setOccupation(occupation);
		model.setLoan_type(loan_type);
		model.setSalary(salary);
		model.setLoan_amount(loan_amount);
		model.setTime_duration(time_duration);
		model.setInterest(interest);
		model.setAccno(accno);
		
		
		boolean result = model.loanDetails();
		
		if(result==true)
		{
			response.sendRedirect("/BankApp/SuccessApplyLoan.jsp");
		}
		else
			response.sendRedirect("/BankApp/ApplyLoanFail.html");
			
		
		
		
		


		
	}

}
