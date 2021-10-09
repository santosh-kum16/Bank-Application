package com.abc.bankapp;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class ApproveLoanFilter
 */
public class ApproveLoanFilter implements Filter {

    /**
     * Default constructor. 
     */
    public ApproveLoanFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		int salary =Integer.parseInt(request.getParameter("salary"));
		int loan_amount =Integer.parseInt(request.getParameter("loan_amount"));
		if(salary > loan_amount) 
		{

			chain.doFilter(request, response);
		}
		else
			((HttpServletResponse) response).sendRedirect("/BankApp/ErrorApply.html");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
