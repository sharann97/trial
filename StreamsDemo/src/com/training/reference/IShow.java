package com.training.reference;

import java.util.List;

public interface IShow {
	String print(); //return  a welcome message
}

interface IEmpDetails{
	double calcBonus(int amount);
}
interface IStudentDetails{
	int calcTotal(int m1,int m2,int m3);
}
interface INameChecker{
	//if name starts 
	String checkName(String name);
}
interface IMetricsChanger{
	double convertgmstokgs(double grams);
}
interface IShape{
	double areaOfSquare(double length);
}
interface ICourseDetails{
	List<String> showcourses();
}
