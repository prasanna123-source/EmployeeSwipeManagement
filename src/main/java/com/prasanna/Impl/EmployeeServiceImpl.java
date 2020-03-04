package com.prasanna.Impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.prasanna.Model.Employee;
import com.prasanna.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

		public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
        
        Employee vo1 = new Employee();
        vo1.setEmpID(1);
        vo1.setEname("urmila");
        vo1.setLocationName("hyderabad");
        vo1.setSwipeIn(new Date());
        vo1.setSwipeout(new Date()); 
        employees.add(vo1);
         
        Employee vo2 = new Employee();
        vo1.setEmpID(1);
        vo1.setEname("jalaja");
        vo1.setLocationName("hyderabad");
        vo1.setSwipeIn(new Date());
        vo1.setSwipeout(new Date());

        employees.add(vo2);
         
        return employees;
    }

		public List<Employee> getemployeeById() {
			// TODO Auto-generated method stub
			return null;
		}

		public List<Employee> getemployeeById(String id) {
			// TODO Auto-generated method stub
			return null;
		}

		public List<Employee> getemployeeByLocationId(String id) {
			// TODO Auto-generated method stub
			return null;
		}

//	public List<Employee> getAllEmployees() {
//		// TODO Auto-generated method stub
//		return null;
//	}
}


