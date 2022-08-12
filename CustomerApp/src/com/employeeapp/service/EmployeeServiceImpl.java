package com.employeeapp.service;

import java.util.ArrayList;
import java.util.List;

import com.employeeapp.model.Employee;

public class EmployeeServiceImpl implements IEmployeeService {

	private static final String Employee = null;

	@Override
	public List<Employee> getAll() {
		return showAll();
	}

	@Override
	public List<Employee> getbyCity(String city) {
		List(Employee) employeelist=showAll();
		List<Employee>employeebyCity=new ArrayList<Employee>();
		for(Employee employee :employeebyCity) {
			if(employee.getCity().equalsIgnoreCase("Banglore")) {
				employeebyCity.add(employee);
			}
		}
		return null;
	}

	@Override
	public List<Employee> getbyDomain(String domain) {
		return null;
	}

	@Override
	public List<Employee> getbyemployeeId(int employeeId) {
		return null;
	}
	
	private List<Employee>showAll(){
		Employee employee1=new Employee("Sharan", 111, "digital", "banglore");
		Employee employee2=new Employee("Rajath", 128, "digital", "banglore");
		Employee employee3=new Employee("Thanush",139, "tech", "thumkoor");
		Employee employee4=new Employee("Navss", 145, "tech",  "thumkoor");
		Employee employee5=new Employee("Nagss", 182, "digital", "goa");
		Employee employee6=new Employee("Akash", 148, "tech", "goa");
		
	
	 List<Employee> employeelist=new ArrayList <Employee>();
	   employeelist.add(employee4);
	   employeelist.add(employee5);
	   employeelist.add(employee6);
	   employeelist.add(employee2);
	   employeelist.add(employee1);
	   employeelist.add(employee3);
	   employeelist.add(employee4);
	   return employeelist;
	}
	
}
