package br.com.alura.gerenciador.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewCompanyForm implements Action {
	
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {			
		return "forward:formNewCompany.jsp";		
	}
}
