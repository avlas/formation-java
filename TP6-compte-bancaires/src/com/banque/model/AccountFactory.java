package com.banque.model;

/** AccountFactory - class to build Account objects 
 * @author ali
 */
public class AccountFactory {

	/** 
	 * Account creation passing a Client object
	 * 
	 * @param client : Client
	 * @param amount : double
	 * @param overdraft : boolean
	 * @param ceilingDecouvert : double
	 */	
	public static Account getInstance(Client client, double amount, boolean overdraft, double ceilingDecouvert) {
		
		return new Account(client, amount, overdraft, ceilingDecouvert);
	}

	/** 
	 * Account creation passing the parameters of Client object
	 * 
	 * @param name : String
	 * @param age : int
	 * @param amount : double
	 * @param overdraft : boolean
	 * @param ceilingDecouvert : double
	 */
	public static Account getInstance(String name, int age, double amount, boolean overdraft, double ceilingDecouvert) {
		Client client = new Client(name, age);

		Account account = new Account(client, amount, overdraft, ceilingDecouvert);

		return account;
	}
}
