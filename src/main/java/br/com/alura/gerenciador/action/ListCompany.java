package br.com.alura.gerenciador.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Bank;
import br.com.alura.gerenciador.modelo.Company;

public class ListCompany {
	
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Listing companies");
		
		Bank bank = new Bank();
		List<Company> list = bank.getCompany();
		
		request.setAttribute("company", list);
		
		RequestDispatcher rd = request.getRequestDispatcher("/listCompnay.jsp");
		rd.forward(request, response);
		
	}
}