package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/create")
	public String createData(@RequestBody Employee employee) {
	return employeeService.createData(employee);	
	}
	
	@PutMapping("/update")
	public String updateData(@RequestBody Employee employee) {
		return employeeService.updateData(employee);
	}
	
	@GetMapping("/get/{id}")
	public Employee getData(@PathVariable("id") Integer id) {
		return employeeService.getData(id);
	}
	
	@GetMapping("getAll")
	public List<Employee> getAllData(){
		return employeeService.getAllEmployee();
		
	}
	@DeleteMapping("/delete/{id}")
	public void deleteData(@PathVariable("id") Integer id) {
		 employeeService.deleteData(id);
	}
	
}
