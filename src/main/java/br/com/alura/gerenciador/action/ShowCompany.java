package br.com.alura.gerenciador.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Bank;
import br.com.alura.gerenciador.modelo.Company;

public class ShowCompany implements Action {
	
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Bank bank = new Bank();
		
		Company company = bank.searchCompanyId(id);
		
		System.out.println(company.getName());
		
		request.setAttribute("company", company);
		
		return "forward:formUpdateCompany.jsp";		
	}
}
