package com.banque;

import java.util.ArrayList;
import java.util.List;

import com.banque.model.Account;
import com.banque.model.AccountFactory;
import com.banque.model.Client;
import com.banque.services.ExtractionServices;
import com.banque.services.IExtractionServices;

/**
 * ApplicationAccount - The entry point of the application
 * 
 * @author ali
 *
 */
public class ApplicationAccount {

	public static List<Account> accounts = null;

	public static void main(String[] args) {
		int amountToCheck = 1375;
		int minAge = 40;
		int maxAge = 71;
		
		// Accounts initialise
		initAccounts();

		IExtractionServices extractionServices = new ExtractionServices();

		// Retrieve accounts by a given amount
		List<Account> accountsByAmount = extractionServices.getAccountsByAmount(accounts, amountToCheck);
		if (accountsByAmount.isEmpty()) {
			System.out.println("NO ACCOUNT FOUND using this amount !!");
		} else {
			System.out.println("Accounts greater than \"" + amountToCheck + "\"  :");
			System.out.println("--------------------------------------------- ");
			System.out.println("NAME (AGE) | AMOUNT | OVERDRAFT | CEILING DECOUVERT");
			System.out.println("--------------------------------------------- ");
			
			for (Account account : accountsByAmount) {
				System.out.println(account);
			}
		}

		// Retrieve accounts by a range of client's age
		List<Account> accountsByAge = extractionServices.getAccountsByAge(accounts, minAge, maxAge);
		if (accountsByAge.isEmpty()) {
			System.out.println("NO ACCOUNTS FOUND for this interval of age !!");
		} else {
			System.out.println("\n--------------------------------------------- ");
			System.out.println(" Accounts between \"" + minAge + "\" and \"" + maxAge + "\" : ");
			System.out.println("--------------------------------------------- ");
			System.out.println("NAME (AGE) | AMOUNT | OVERDRAFT | CEILING DECOUVERT");
			System.out.println("--------------------------------------------- ");
			for (Account account : accountsByAge) {
				System.out.println(account);
			}
		}
		
		// Retrieve the accounts average
		System.out.println("\n--------------------------------------------- ");
		System.out.println("The average of the accounts = " + extractionServices.getAccountsAverage(accounts));
	}

	// Initialise the accounts
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
