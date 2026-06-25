package com.mmcoe.bank;

public class Accounts {
	private double balance;
	private double overdraft;

	public Accounts() {
		// TODO Auto-generated constructor stub

	}

	public Accounts(double balance) {
//		super();
		this.balance = balance;
		overdraft = 10000;
	}

	public void deposit(double amount) {
		if(overdraft != 10000) {
			overdraft += amount;
			if(overdraft > 10000) {
				
			double rem = overdraft -10000;
			overdraft =10000;
			balance +=rem;
			}
		}
		else {
			balance += amount;
		}
	}

	public void withdraw(double amount) throws BalanceException{
		if(balance < amount) {
			double rem = amount - balance;
			balance=0;
			overdraft -= rem;
			throw new BalanceException("Insufficient balance ! deducted from overdraft.");
			
			}
		else {
			balance -= amount;
		}
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Accounts [Balance "+balance+ ", Overdraft "+overdraft +"]";
	}
	
	

}
