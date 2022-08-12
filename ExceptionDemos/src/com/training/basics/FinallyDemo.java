package com.training.basics;

public class FinallyDemo {
	public static void main(String[] args) {
		System.out.println("welcome");
		try {	
		String value =args[0];
		System.out.println("value"+value);
		int num=Integer.parseInt(value);
		System.out.println("Number is "+num);
		int result=100/num;
		System.out.println("result is"+result);
		}
		catch(Exception e) {
	         System.out.println("please enter a number");
		}
		finally {
			System.out.println("closing db");
		}
		System.out.println("completed");	
		}
	
}
