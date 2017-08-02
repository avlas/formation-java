package com.banque.services;

import java.util.List;

import com.banque.model.Account;

/**
 * IExtractionServices - list of Account services
 * 
 * @author ali
 *
 */
public interface IExtractionServices {

	/**
	 * Retrieve the list of accounts where the amount is greater than a given amount
	 * 
	 * @param accounts : list of accounts
	 * @param amount : the given amount
	 */
	public List<Account> getAccountsByAmount(List<Account> accounts, double amount);

	/**
	 * Retrieve the list of accounts belonging to clients whose age is between 2 values : ageMin and ageMax
	 * 
	 * @param accounts : list of accounts
	 * @param ageMin : the minimum age
	 * @param ageMax : the maximum age
	 */
	public List<Account> getAccountsByAge(List<Account> accounts, int ageMin, int ageMax);

	/**
	 * Retrieve the average amount of a collection of accounts
	 * 
	 * @param accounts : list of accounts
	 */
	public double getAccountsAverage(List<Account> accounts);
}
