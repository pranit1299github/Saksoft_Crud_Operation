package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Employee;
import com.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}


	@Override
	public Employee getEmployee(Integer id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id);
	}


	@Override
	public void deleteEmployee(Integer id) {
		
		employeeRepository.deleteById(id);
		
	}
	
	
}
