package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	private static List<Company> list = new ArrayList<>();
	
	static {
		Company company = new Company();
		company.setName("Google");
		Company company2 = new Company();
		company2.setName("Facebook");
		list.add(company);
		list.add(company2);
	}

	public void addCompany(Company company) {		
		list.add(company);
	}
	
	public List<Company> getCompany() {
		return Bank.list;
	}

}
