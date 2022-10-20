package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank {
	
	private static List<Company> list = new ArrayList<>();
	private static Integer sequentialKey = 1;
	
	static {
		Company company = new Company();
		company.setId(sequentialKey++);
		company.setName("Google");
		
		Company company2 = new Company();
		company.setId(sequentialKey++);
		company2.setName("Facebook");
		
		list.add(company);
		list.add(company2);
	}

	public void addCompany(Company company) {
		company.setId(Bank.sequentialKey++);
		list.add(company);
	}
	
	public List<Company> getCompany() {
		return Bank.list;
	}

	public void removeCompany(Integer id) {
		
		Iterator<Company> it = list.iterator();
		
		while(it.hasNext()) {
			Company comp = it.next();
			
			if (comp.getId() == id) {
				it.remove();
			}
		}		
	}
}
