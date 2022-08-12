package com.training.samples;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Function;

public class StreamDemo {

	
	public static void main(String[] args) {
		
		Function<String,String> fun =(str)->str.toUpperCase();
		
		Arrays.asList("java","angular","css","html","jsp","json")
		.stream()
		.map((str)->str.toUpperCase())
		.sorted()
		.limit(4)
		.skip(2)
		.forEach(System.out::println);
		

		Arrays.asList("java","angular","css","html","jsp","json")
		.stream()
		.map((str)->str.length())
		.forEach(System.out::println);
		
		Optional<String> optString=
				Arrays.asList("java","html","css","javascript","json","angular")
		.stream()
		.filter(str->str.length()<2)
		.findFirst();
		
	if(optString.isPresent()) {
			String value=optString.get();
			System.out.println(value);
	}
	System.out.println("if present");
	Arrays.asList("java","angular","css","html","jsp","json")
	.stream()
	.findFirst()
	.filter(str->str.length()>2)
	.ifPresent(System.out::println);
	
	String course =Arrays.asList("java","angular","css","html","jsp","json")
			.stream()
			.filter(str->str.length()<2)
			.findFirst()
			.orElse("React");
			System.out.println(course);
	
	course=Arrays.asList("java","angular","css","html","jsp","json")
	.stream()
	.filter(str->str.length()<2)
	.findFirst()
	.orElseGet(()-> "React".toUpperCase());
	System.out.println(course);
	
	Arrays.asList("java","angular","css","html","jsp","json")
	.stream()
	.filter(str->str.length()<2)
	.findFirst()
	.orElseThrow(()->new ArithmeticException());
	

	}

	
}
