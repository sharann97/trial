package com.training.basics;

public class MultiCatch22 {
	public static void main(String[] args) {
		System.out.println("welcome");
		try {	
		String value =args[0];
		System.out.println("value"+value);
		int num=Integer.parseInt(value);
		System.out.println("Number is "+num);
		int result=100/num;
		System.out.println("result is"+result);
		int[] marks =null;
		System.out.println(marks[0]);
		}
		catch(ArithmeticException |ArrayIndexOutOfBoundsException | NumberFormatException | NullPointerException e) {
			System.out.println("please enter a number greater than zero");
		}catch(RuntimeException e) {	
			System.out.println("please enter the value");
        }
	    catch(Exception e) {
	         System.out.println("please enter a number");
		}
		
		System.out.println("completed");	
		}
	
}
