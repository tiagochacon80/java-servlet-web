package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.action.DeleteCompany;
import br.com.alura.gerenciador.action.ListCompany;
import br.com.alura.gerenciador.action.NewCompany;
import br.com.alura.gerenciador.action.ShowCompany;
import br.com.alura.gerenciador.action.UpdateCompany;


@WebServlet("/entry")
public class SingleEntryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramAction = request.getParameter("action");
		
		if (paramAction.equals("listCompany")) {			
			ListCompany action = new ListCompany();
			action.execute(request, response);			
		} else if (paramAction.equals("Deletecompany")) {
			System.out.println("removing company");			
			DeleteCompany action = new DeleteCompany();
			action.executes(request, response);			
		} else if (paramAction.equals("Showcompany")) {
			ShowCompany action = new ShowCompany();
			action.executes(request, response);		
		} else if (paramAction.equals("UpdateCompany")) {
			UpdateCompany action = new UpdateCompany();
			action.executes(request, response);		
		} else if (paramAction.equals("NewCompany")) {
			NewCompany action = new NewCompany();
			action.executes(request, response);
		}
	}
}
