package com.banque.model;

public class AccountFactory {

	public static Account getInstance(Client client, double amount, boolean overdraft, double ceilingDecouvert) {
		
		return new Account(client, amount, overdraft, ceilingDecouvert);
	}

	public static Account getInstance(String name, int age, double amount, boolean overdraft, double ceilingDecouvert) {
		Client client = new Client(name, age);

		Account account = new Account(client, amount, overdraft, ceilingDecouvert);

		return account;
	}
}
