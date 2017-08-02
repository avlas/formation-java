package com.banque.services;

import java.util.ArrayList;
import java.util.List;

import com.banque.model.Account;

/**
 * ExtractionServices - implementation of the list of Account services
 * 
 * @author ali
 *
 */
public class ExtractionServices implements IExtractionServices {

	/**
	 * Retrieve the list of accounts where the amount is greater than a given amount
	 * 
	 * @param accounts : list of accounts
	 * @param amount : the given amount
	 */
	@Override
	public List<Account> getAccountsByAmount(List<Account> accounts, double amount) {
		List<Account> accountsByAmount = new ArrayList<>();
		
		for (Account account : accounts) {
			if (account.getAmount() > amount) {
				accountsByAmount.add(account);
			}
		}
		
		return accountsByAmount;
	}

	/**
	 * Retrieve the list of accounts belonging to clients whose age is between 2 values : ageMin and ageMax
	 * 
	 * @param accounts : list of accounts
	 * @param ageMin : the minimum age
	 * @param ageMax : the maximum age
	 */
	@Override
	public List<Account> getAccountsByAge(List<Account> accounts, int ageMin, int ageMax) {
		List<Account> accountsByAge = new ArrayList<>();
		
		for (Account account : accounts) {
			if (ageMin < account.getClient().getAge() && account.getClient().getAge() < ageMax) {				
				accountsByAge.add(account);
			}
		}
		
		return accountsByAge;
	}

	/**
	 * Retrieve the average amount of a collection of accounts
	 * 
	 * @param accounts : list of accounts
	 */
	@Override
	public double getAccountsAverage(List<Account> accounts) {
		double average = 0.0;
		
		for (Account account : accounts) {
			average += account.getAmount();
		}

		average /= accounts.size();
		return average;
	}

}
