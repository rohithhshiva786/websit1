package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Databaseexample.employeerepo;
import com.example.demo.entity.Employee;


	@Service
	public class employeeservice {
	@Autowired
	private employeerepo emp;
	public Employee saveDetails(Employee e) {

		return emp.save(e);
			
	}
	public List<Employee> getAllDetails()
	{
		return emp.findAll();
	}
	public void deleteDepartmentById(int id)
	{
		emp.deleteById(id);
	}
	
	}

