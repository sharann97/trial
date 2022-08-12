package com.training.reference;

import java.util.Arrays;

public class RefDemo {

	public static void main(String[] args) {
		IShow showRef=()->{
			return "great day";
		};
		System.out.println(showRef.print());
		
		IEmpDetails empdetails =(int amount)->{
			return amount;
		};
		System.out.println(empdetails.calcBonus(5000));
		
		IStudentDetails studentref=(int m1,int m2,int m3)->{
			int sum=m1+m2+m3;
		return sum;
		};
		System.out.println(studentref.calcTotal(25, 450, 760));
		
		INameChecker checkerref=(String name)->{
			return name;
		};
		System.out.println(checkerref.checkName("sharan"));
		
		IMetricsChanger metricref=(double grams)->{
			double kg=grams/1000;
			return kg;
		};
		System.out.println(metricref.convertgmstokgs(200));
		
		IShape shape=(length)->{
			double area=length*length;
			return area;
		};
		System.out.println(shape.areaOfSquare(20));
		
		ICourseDetails courseref=()->Arrays.asList("java","jsp");
		System.out.println(courseref.showcourses());
		
	}
	

}
