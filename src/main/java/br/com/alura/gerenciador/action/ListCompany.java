package br.com.alura.gerenciador.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.modelo.Bank;
import br.com.alura.gerenciador.modelo.Company;

public class ListCompany implements Action {
	
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		if (session.getAttribute("userIsConnected") == null) {
			return "redirect:entry?action=LoginForm";
		}
		
		System.out.println("Listing companies");
		
		Bank bank = new Bank();
		List<Company> list = bank.getCompany();
		
		request.setAttribute("company", list);			
		
		return "forward:formUpdateCompany.jsp";		
	}
}
