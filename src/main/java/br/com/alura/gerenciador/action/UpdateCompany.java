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

public class UpdateCompany {
	
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
				
		String nameCompany = request.getParameter("name");
		String paramDateCompany = request.getParameter("date");
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		System.out.println("Updating a new company " + id);
		
		Date openingDate = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			openingDate = sdf.parse(paramDateCompany);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		System.out.println(id);
		
		Bank bank = new Bank();	
		Company company = bank.searchCompanyId(id);
		company.setName(nameCompany);
		company.setOpeningDate(openingDate);
		
		return "redirect:entry?action=ListCompany";
	
	}
}
