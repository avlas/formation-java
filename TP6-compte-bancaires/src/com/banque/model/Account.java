package com.banque.model;

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
	 * @param client - the client
	 * @param amount
	 * @param overdraft
	 * @param ceilingDecouvert 
	 */
	public Account(Client client, double amount, boolean overdraft, double ceilingDecouvert) {
		this.client = client;
		this.amount = amount;
		this.overdraft = overdraft;
		this.ceilingDecouvert = ceilingDecouvert;
	}

	public void addAmount(double amount) {
		this.amount += amount;
	}

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

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public boolean isOverdraft() {
		return overdraft;
	}

	public void setOverdraft(boolean overdraft) {
		this.overdraft = overdraft;
	}

	public double getCeilingDecouvert() {
		return ceilingDecouvert;
	}

	public void setCeilingDecouvert(double ceilingDecouvert) {
		this.ceilingDecouvert = ceilingDecouvert;
	}

	@Override
	public String toString() {
		return "" + getClient().getName() + " - " + getClient().getAge() + " - " + this.amount + " - " + this.overdraft + " - " + this.ceilingDecouvert;
	}
}
