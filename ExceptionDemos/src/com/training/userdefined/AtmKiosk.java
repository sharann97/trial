package com.training.userdefined;

public class AtmKiosk {
	public static void main(String[] args) {
		System.out.println("In atm");
		Bank bank=new Bank(6000);
		
		try {
			bank.withdraw(11000);
			System.out.println("amount withdrawn successfully");
		}catch(InsufficientBalanceException | ExceedingLinitsException e) {
			System.out.println("error"+e.getMessage());
		}
		System.out.println("bye");
	}
}
