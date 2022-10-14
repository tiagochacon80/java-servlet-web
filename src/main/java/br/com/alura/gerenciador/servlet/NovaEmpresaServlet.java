package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/newCompany")
public class NovaEmpresaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("New company registration:");
		
		//acessando o parametro da requisiçao
		String nameCompany = request.getParameter("name");
		Company company = new Company();
		company.setName(nameCompany);
		
		Bank bank = new Bank();
		bank.addCompany(company);
		
		//Call the JPS
		RequestDispatcher rd = request.getRequestDispatcher("/newCompanyCreated.jsp");
		request.setAttribute("company", company.getName());
		rd.forward(request, response);
	}
}
