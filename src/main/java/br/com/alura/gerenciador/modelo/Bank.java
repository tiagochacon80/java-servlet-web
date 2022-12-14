package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank {
	
	private static List<Company> list = new ArrayList<>();
	private static List<User> listUser = new ArrayList<>(); 
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
		
		User u1 = new User("Nico", "1234");
		User u2 = new User("Ana", "1234");
		
		listUser.add(u1);
		listUser.add(u2);
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

	public Company searchCompanyId(Integer id) {
		for (Company company : list) {
			if (company.getId() == id) {
				return company;
			}
		}
		return null;
	}
	
	public User userExist(String login, String password) {
		for (User user : listUser) {
			if (user.isEgual(login, password)) {
				return user;
			}
		}
		return null;		
	}
}
