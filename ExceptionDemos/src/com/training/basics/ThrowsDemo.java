package com.training.basics;

public class ThrowsDemo {

	public static void main(String[] args) {
		System.out.println("In Atm");
		  Bank ref=new Bank();
		  
		  try {
			  ref.withdraw(7000);
			  }catch(Exception e) {
				  e.printStackTrace();
			  }
		  System.out.println("amount withdrawn");
		  System.out.println("good bye ");
		
	}	

}
