package br.com.alura.gerenciado.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListCompanyServlet
 */
@WebServlet("/listCompany")
public class ListCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Bank bank = new Bank();
		List<Company> list = bank.getCompany();				
		PrintWriter out = response.getWriter();
		
		out.print("<html><body>");
		out.print("<ul>");
		for (Company comp : list) {
			out.print("<li>" + comp.getName() + "</li>");
		}
		out.print("</ul>");
		out.print("</html></body>");
	}
	
	
	//protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	//}

}
