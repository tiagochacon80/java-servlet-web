package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Bank;
import br.com.alura.gerenciador.modelo.Company;


@WebServlet("/updateCompany")
public class UpdateCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Updating a new company");
		
		String nameCompany = request.getParameter("name");
		String dateOpeningCompany = request.getParameter("date");
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Date openingDate = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			openingDate = sdf.parse(dateOpeningCompany);
		} 
		catch (ParseException e){
			throw new ServletException(e);
		}
		
		System.out.println(id);
		
		Bank bank = new Bank();
		Company company = bank.searchCompanyId(id);
		company.setName(nameCompany);
		company.setOpeningDate(openingDate);
		
		response.sendRedirect("listCompany");
		
	}
}
