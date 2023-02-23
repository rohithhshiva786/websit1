package com.example.demo.controllerf;

	

	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.employeeservice;


	@RestController
	public class EmployeeController {
	@Autowired
	private employeeservice empservice;
@GetMapping("/getEmployee")
public List<Employee> getdetails(){
	return empservice.getAllDetails();
}
	
	
	@PostMapping("/addEmployee")
	public Employee postDetails(@RequestBody Employee e) {
		return empservice.saveDetails(e);
	}
}
