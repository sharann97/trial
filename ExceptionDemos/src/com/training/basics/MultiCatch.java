package com.training.basics;

public class MultiCatch {
	public static void main(String[] args) {
		System.out.println("welcome");
		try {	
		String value =args[0];
		System.out.println("value"+value);
		int num=Integer.parseInt(value);
		System.out.println("Number is "+num);
		int result=10/num;
		System.out.println("result is"+result);
		}
		catch(ArithmeticException e) {
			System.out.println("please enter a number greater than zero");
		}catch(ArrayIndexOutOfBoundsException e) {	
			System.out.println("please enter the value");
		}catch(NumberFormatException e) {
	    	System.out.println("please enter a number");
	    }
	    catch(Exception e) {
	         System.out.println("please enter a number");
		}
		
		System.out.println("completed");	
		}
}
