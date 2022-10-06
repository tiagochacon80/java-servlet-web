package br.com.alura.gerenciado.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//ola
@WebServlet(urlPatterns="/ola") //chamando a url "/ola"
public class OlaMundo extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException { //requisitando a resposta
		
		PrintWriter out = resp.getWriter(); //A partir da resposta o write devolve algo ao navegador
		out.println("<html>");
		out.println("<body>");
		out.println("Ola mundo, você fez sua primeira linha de codigo!");
		out.println("</body>");
		out.println("</html>");		
		
		System.out.println("o servlet OlaMundo foi chamado.");
	}
}
