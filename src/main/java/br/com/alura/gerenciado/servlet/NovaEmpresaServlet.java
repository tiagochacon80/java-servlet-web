package br.com.alura.gerenciado.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa:");
		
		//acessando o parametro da requisiçao
		String nomeEmpresa = request.getParameter("nome");
		Company company = new Company();
		company.setName(nomeEmpresa);
		
		Bank bank = new Bank();
		bank.addCompany(company);
		
		PrintWriter out = response.getWriter();		
		out.println("<html><body>Empresa " + nomeEmpresa + " cadastrada com sucesso!</body></html>");
	}
}
