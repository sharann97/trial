package com.training.userdefined;



public class Bank {
	double balance;
	
	public Bank(double balance) {
		super();
		this.balance=balance;
	}
	void withdraw(int amount)throws InsufficientBalanceException,ExceedingLinitsException{
		try {
		if(amount>balance) {
			throw new InsufficientBalanceException();
		}
		if(amount>10000) {
			throw new ExceedingLinitsException("exceeding day limits");
		}else {
			    balance=balance-amount;
			    System.out.println("amount withdrawn");
			    System.out.println("balance is"+balance);
		}}
		 catch(Exception e) {
			System.out.println("exception"+ e);
			throw e;
		}
		finally {
			System.out.println("close");
		}
		System.out.println("completed");
	}
	}

