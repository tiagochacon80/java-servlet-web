package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Bank;
import br.com.alura.gerenciador.modelo.Company;


//@WebServlet("/showCompany")
public class ShowCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Bank bank = new Bank();
		
		Company company = bank.searchCompanyId(id);
		
		System.out.println(company.getName());
		
		request.setAttribute("company", company);
		
		RequestDispatcher rd = request.getRequestDispatcher("/formUpdateCompany.jsp");		
		rd.forward(request, response);
	}
}
