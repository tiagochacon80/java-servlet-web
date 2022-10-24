package br.com.alura.gerenciador.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Bank;

public class DeleteCompany {
	
	public void executes(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		System.out.println("Removing company");
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);		
		
		Bank bank = new Bank();
		bank.removeCompany(id);	
		
		response.sendRedirect("ListCompany");
	}	
}

