package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.action.Action;


@WebServlet("/entry")
public class SingleEntryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramAction = request.getParameter("action");
		
		String nameClass = "br.com.alura.gerenciador.action." + paramAction;
		
		String name;
		try {
			Class class = Class.forName(nameClass);
			Action action = (Action) class.newInstance();		
			name = action.execute(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		}		
		
		String[] addressType = name.split(":");
		if (addressType[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + addressType[1]);
			rd.forward(request, response);
		} else {
			response.sendRedirect(addressType[1]);
		}		
	
		
		//String name = null;
		//if (paramAction.equals("ListCompany")) {			
			//ListCompany action = new ListCompany();
			//name = action.execute(request, response);			
		//} else if (paramAction.equals("DeleteCompany")) {
			//System.out.println("removing company");			
			//DeleteCompany action = new DeleteCompany();
			//name = action.execute(request, response);			
		//} else if (paramAction.equals("ShowCompany")) {
			//ShowCompany action = new ShowCompany();
			//name = action.execute(request, response);		
		//} else if (paramAction.equals("UpdateCompany")) {
			//UpdateCompany action = new UpdateCompany();
			//name = action.execute(request, response);		
		//} else if (paramAction.equals("NewCompany")) {
			//NewCompany action = new NewCompany();
			//name = action.execute(request, response);
		//} else if (paramAction.equals("NewCompanyForm")) {
			//NewCompanyForm action = new NewCompanyForm();
			//name = action.executes(request, response);
		//}		
		
	}	
	
}
