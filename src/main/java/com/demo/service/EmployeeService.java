package com.demo.service;

import com.demo.model.Employee;

public interface EmployeeService 
{
	public Employee saveEmployee(Employee employee);
	
	public Employee getEmployee(Integer id);
	
	public void deleteEmployee(Integer id);

}
