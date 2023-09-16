package com.employee.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;
import com.employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public String createData(Employee employee) {
		 employeeRepository.save(employee);
		return "success";
	}

	@Override
	public String updateData(Employee employee) {
		this.employeeRepository.save(employee);
		return "Success";
	}

	@Override
	public void deleteData(Integer id) {
		employeeRepository.deleteById(id);;
		
	}

	@Override
	public Employee getData(Integer id) {
		return employeeRepository.findById(id).get();
		
	}

	@Override
	public List<Employee> getAllEmployee() {
	// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

}
