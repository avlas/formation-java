package com.banque;

import java.util.ArrayList;
import java.util.List;

import com.banque.model.Client;
import com.banque.model.Account;
import com.banque.model.AccountFactory;
import com.banque.services.ExtractionServices;
import com.banque.services.IExtractionServices;

public class ApplicationAccount {

	public static List<Account> accounts = null;

	public static void main(String[] args) {
		int amountToCheck = 1375;
		int minAge = 40;
		int maxAge = 71;
		
		initAccounts();

		IExtractionServices extractionServices = new ExtractionServices();

		List<Account> comptesByAmount = extractionServices.getAccountsByAmount(accounts, amountToCheck);
		if (comptesByAmount.isEmpty()) {
			System.out.println("NO COMPTES FOUND - using this amount !!");
		} else {
			System.out.println(" Accounts greater than \"" + amountToCheck + "\"  :");
			System.out.println("--------------------------------------------- ");
			
			for (Account compte : comptesByAmount) {
				System.out.println(compte);
			}
		}

		List<Account> comptesByAge = extractionServices.getAccountsByAge(accounts, minAge, maxAge);
		if (comptesByAge.isEmpty()) {
			System.out.println("NO COMPTES FOUND for this interval of age !!");
		} else {
			System.out.println("\n--------------------------------------------- ");
			System.out.println(" Accounts between \"" + minAge + "\" and \"" + maxAge + "\" : ");
			System.out.println("--------------------------------------------- ");
			
			for (Account compte : comptesByAge) {
				System.out.println(compte);
			}
		}
		
		System.out.println("\n--------------------------------------------- ");
		System.out.println("The average of the accounts = " + extractionServices.getAccountsAverage(accounts));
	}

	public static void initAccounts() {
		accounts = new ArrayList<>();

		Account account = AccountFactory.getInstance(new Client("Martin", 27), 250, false, 0);
		accounts.add(account);

		account = AccountFactory.getInstance(new Client("Strome", 28), 1375, true, 450);
		accounts.add(account);

		account = AccountFactory.getInstance(new Client("Gilbert", 59), 9750, true, 1000);
		accounts.add(account);

		account = AccountFactory.getInstance(new Client("Ali", 51), 5240, true, 1000);
		accounts.add(account);

		account = AccountFactory.getInstance(new Client("Macron", 40), 15500, true, 2500);
		accounts.add(account);

		account = AccountFactory.getInstance(new Client("Matthias", 24), -150, true, 450);
		accounts.add(account);

		account = AccountFactory.getInstance(new Client("Serendim", 29), 490, false, 0);
		accounts.add(account);

		account = AccountFactory.getInstance(new Client("Goura", 71), 1500, true, 450);
		accounts.add(account);
	}
}
