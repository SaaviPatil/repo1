package com.Employee.service;

import java.util.List;

import com.Employee.beans.Employee;

public interface EmployeeService {

	public int insertIntoDb(Employee e);
	public Employee getEmp(Integer id);
	public List<Employee>getAllEmp();
	public int updateEmployee(Employee p);
	public void deleteEmployee(int id);
}
