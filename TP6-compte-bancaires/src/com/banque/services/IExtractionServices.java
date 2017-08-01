/**
 * 
 */
package com.banque.services;

import java.util.List;

import com.banque.model.Account;

/**
 * @author ali
 *
 */
public interface IExtractionServices {
	
	// List of accounts where the amount is greater than a given value
	public List<Account> getAccountsByAmount(List<Account> accounts, double amount);

	// List of accounts belonging to clients whose age is between 2 values
	public List<Account> getAccountsByAge(List<Account> accounts, int ageMin, int ageMax);
	
	// Average amount of a collection of accounts
	public double getAccountsAverage (List<Account> accounts);
}
