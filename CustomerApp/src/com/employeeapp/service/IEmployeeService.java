package com.employeeapp.service;

import java.util.List;

import com.employeeapp.model.Employee;


public interface IEmployeeService {
	List<Employee>getAll();
	List<Employee>getbyCity(String city);
	List<Employee>getbyDomain(String domain);
	List<Employee>getbyemployeeId(int employeeId);
	
	
	
}
