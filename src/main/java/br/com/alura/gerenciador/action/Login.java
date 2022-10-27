package br.com.alura.gerenciador.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.modelo.Bank;
import br.com.alura.gerenciador.modelo.User;

public class Login implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		System.out.println("Login" + login);
		
		Bank bank = new Bank();
		User user = new bank.userExist(login, password);
		
		if (user != null) {
			System.out.println("User exist!");
			HttpSession session = request.getSession();
			session.setAttribute("userIsConnected", user);
			return "redirect:entry?action=ListCompany";
		} else {
			return "redirect:entry?action=LoginForm";
		}		
	}
}
