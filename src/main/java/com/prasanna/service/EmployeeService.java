package com.prasanna.service;

import java.util.List;

import com.prasanna.Model.Employee;

public interface EmployeeService {
	
	//public int deleteEmployee(Long employeeId); 
	// public int updateEmployee(Employee employee);
	 public List<Employee> getAllEmployees(); 
	 public List<Employee> getemployeeById(String id);
	 public List<Employee> getemployeeByLocationId(String id);
	}

