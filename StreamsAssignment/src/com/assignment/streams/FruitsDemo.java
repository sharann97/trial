package com.assignment.streams;

import java.util.Arrays;

public class FruitsDemo {

	public static void main(String[] args) {
		Arrays.asList("apple","banana","malberry","blueberry")
		.stream()
		.filter((name)->name.contains("berry"))
		.findFirst()
		.ifPresent(System.out::println);
		
		
		
		
	}
}
