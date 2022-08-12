package com.training.basics;

public class TryDemo {
	public static void main(String[] args) {
		try {
			
		System.out.println("welcome");
		String value =args[0];
		System.out.println("value got");
		int num=Integer.parseInt(value);
		System.out.println("Number is "+num);
		int result=10/num;
		System.out.println("result is"+result);
		}
		catch(Exception e){
			System.out.println(e);
			
		}
		System.out.println("completed");
		
	}
}
