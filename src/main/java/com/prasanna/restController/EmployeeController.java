package com.prasanna.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prasanna.service.EmployeeService;

@RestController
public class EmployeeController {

@Autowired
EmployeeService employeeService;	
 

@RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
public String getAllEmployees(Model model)
{
    model.addAttribute("employees", employeeService.getAllEmployees());
    
    return "employeesListDisplay";
}

@RequestMapping(value = "/getUserById/user/{id}", method = RequestMethod.GET)
public String getAllEmployeebyAdminId(@RequestParam("id")String id,String user)
{
     if(user.equals("admin")) {
    	 employeeService.getemployeeById(id);
     }
    
    return "employeesListDisplay";
}
@RequestMapping(value = "/getUserById/location/{id}", method = RequestMethod.GET)
public String getAllEmployeebyLocationId(@RequestParam("id")String id,String user)
{
     if(user.equals("location")) {
    	 employeeService.getemployeeByLocationId(id);
     }
    
    return "employeesListDisplay";
}
}
