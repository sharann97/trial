package com.training.reference;

public class StaticRefDemo {

	public static void main(String[] args) {
		
		Calculator obj=(int x,int y)->System.out.println("SUM"+x+y);
		obj.calculate(20, 30);
		
		Calculator calc=Checker::printTotal;
		calc.calculate(20, 30);
		
		IGreeter ref=(String name)->{
			System.out.println("hello "+name);
	
		
		ref.greetMessage("sharan");
		
		Checker checkobj=new Checker();
		//refer to non static
		IGreeter greetref=checkobj::show;
		greetref.greetMessage("sharan");
		
		};
	}
	}
