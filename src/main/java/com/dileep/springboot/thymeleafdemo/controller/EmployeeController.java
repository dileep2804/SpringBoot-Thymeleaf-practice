 package com.dileep.springboot.thymeleafdemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dileep.springboot.thymeleafdemo.model.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	
	// load employee data
	private List<Employee> theEmployees;
	
	@PostConstruct
	public void loadList() {
		Employee e1 = new Employee(1, "Leslie", "Andrew", "leslie@gmail.com");  	
		Employee e2 = new Employee(2, "Aman", "kushwaha", "aman@gmail.com");  	
		Employee e3 = new Employee(3, "shailendra", "kushwaha", "dabla@gmail.com");  	
		
		theEmployees = new ArrayList<>();
		
		theEmployees.add(e1);
		theEmployees.add(e2);
		theEmployees.add(e3);
	}
	
	
	//add mapping for "/list"
	@GetMapping("/list")
	public String listemployees(Model theModel) {
		
		theModel.addAttribute("employees",theEmployees);
	
		return "list-employees";
	}
}
