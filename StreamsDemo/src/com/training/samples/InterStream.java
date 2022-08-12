package com.training.samples;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;                                                                                                         

public class InterStream {

	public static void main(String[] args) {
		//create a list
//		List<String> courses =Arrays.asList("java","html","javascript","css","json","angular")
//		.stream()
//		.filter(str->str.length()>3)
//		.sorted()
//		.collect(Collectors.toList());
//		System.out.println(courses);
//	
		Arrays.asList("java","javascript","css","json","angular","html")
		.forEach(courseName->System.out.println(courseName.toUpperCase()));
		System.out.println();
		Arrays.asList("java","javascript","css","json","angular","html")
		.forEach(System.out::println);
		
		Stream.generate(()->"sharan").limit(5).forEach(str->System.out.println(str.toUpperCase()));
		
		
		
	}
		
		
}
