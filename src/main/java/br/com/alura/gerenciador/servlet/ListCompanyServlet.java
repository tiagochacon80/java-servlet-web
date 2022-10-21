package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Bank;
import br.com.alura.gerenciador.modelo.Company;

/**
 * Servlet implementation class ListCompanyServlet
 */
@WebServlet("/listCompany")
public class ListCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Bank bank = new Bank();
		List<Company> list = bank.getCompany();			
		
		request.setAttribute("companys", list);
		
		RequestDispatcher rd = request.getRequestDispatcher("/listCompany.jsp");
		rd.forward(request, response);
	}	

}
