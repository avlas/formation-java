package com.banque.services;

import java.util.ArrayList;
import java.util.List;

import com.banque.model.Account;

public class ExtractionServices implements IExtractionServices {

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
