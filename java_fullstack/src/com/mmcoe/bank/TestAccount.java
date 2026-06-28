package com.mmcoe.bank;

public class TestAccount {
	public static void main(String[] args) {
		Accounts ac = new Accounts(5000);
		System.out.println(ac);
		
		try {
			ac.withdraw(7000);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println(e);
			System.out.println(e.getMessage());
		}
		System.out.println(ac);
//		ac.withdraw(7000);
//		System.out.println(ac);
		
		ac.deposit(2000);
		System.out.println(ac);
		ac.deposit(5000);
		System.out.println(ac);
	}
}
