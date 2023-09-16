package com.employee.service;

import java.util.List;

import com.employee.entity.Employee;

public interface EmployeeService {
	
	public String createData(Employee employee);
	public String updateData(Employee employee);
	public void deleteData(Integer id);
	public Employee getData(Integer id);
	public List<Employee> getAllEmployee();
}
