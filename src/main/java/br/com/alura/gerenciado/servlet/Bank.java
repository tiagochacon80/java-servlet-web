package br.com.alura.gerenciado.servlet;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	private static List<Company> list = new ArrayList<>();

	public void addCompany(Company company) {		
		list.add(company);
	}
	
	public List<Company> getCompany() {
		return Bank.list;
	}

}
