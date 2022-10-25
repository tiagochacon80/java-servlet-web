package br.com.alura.gerenciador.action;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Bank;
import br.com.alura.gerenciador.modelo.Company;

public class NewCompany implements Action {
	
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
			
		System.out.println("New company registration:");		
		
		String nameCompany = request.getParameter("name");
		String dateOpeningCompany = request.getParameter("date");		
		
		Date openingDate = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			openingDate = sdf.parse(dateOpeningCompany);
		} catch (ParseException e) {
			throw new ServletException(e);			
		}
		
		Company company = new Company();
		company.setName(nameCompany);
		company.setOpeningDate(openingDate);
		
		Bank bank = new Bank();
		bank.addCompany(company);
		
		request.setAttribute("company", company.getName());		
		
		return "redirect:entry?action=ListCompany";		
	}

}
