package com.banque.model;

/**
 * Account - class to instantiate Account objects
 * 
 * @author ali
 */
public class Account {

	/** client : Client */
	private Client client;

	/** amount : double */
	private double amount;

	/** overdraft : boolean */
	private boolean overdraft;

	/** ceilingDecouvert : double */
	private double ceilingDecouvert;

	/**
	 * Constructor
	 * 
	 * @param client
	 *            : Client
	 * @param amount
	 *            : double
	 * @param overdraft
	 *            : boolean
	 * @param ceilingDecouvert
	 *            : double
	 */
	public Account(Client client, double amount, boolean overdraft, double ceilingDecouvert) {
		this.client = client;
		this.amount = amount;
		this.overdraft = overdraft;
		this.ceilingDecouvert = ceilingDecouvert;
	}

	/**
	 * Add amount to the account
	 * 
	 * @param amount : double
	 */
	public void addAmount(double amount) {
		this.amount += amount;
	}

	/**
	 * Remove amount from the account
	 * 
	 * @param amountToRemove : double
	 */
	public void removeAmount(double amountToRemove) {
		double balance = 0;

		if (this.overdraft) {
			balance = this.amount + ceilingDecouvert;

			if (amountToRemove > balance) {
				System.out.println("Ceiling Depth -> NOT AUTHORISED !!");
			} else {
				this.amount -= amountToRemove;
			}
		} else {
			System.out.println("NOT AUTHORISED - overdraft!!");
		}
	}

	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @param client : the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount : the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * @return the overdraft
	 */
	public boolean isOverdraft() {
		return overdraft;
	}

	/**
	 * @param overdraft : the overdraft to set
	 */
	public void setOverdraft(boolean overdraft) {
		this.overdraft = overdraft;
	}

	/**
	 * @return the ceilingDecouvert
	 */
	public double getCeilingDecouvert() {
		return ceilingDecouvert;
	}

	/**
	 * @param ceilingDecouvert : the ceilingDecouvert to set
	 */
	public void setCeilingDecouvert(double ceilingDecouvert) {
		this.ceilingDecouvert = ceilingDecouvert;
	}

	@Override
	public String toString() {
		return getClient().toString() + " - " + this.amount + " - " + this.overdraft
				+ " - " + this.ceilingDecouvert;
	}
}
