package com.Employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.Repo.EmployeeRepo;
import com.Employee.beans.Employee;


@Service
public class EmployeeServiceIml implements EmployeeService{

	@Autowired
    private EmployeeRepo er;

	@Override
	public int insertIntoDb(Employee e) {
		Employee e1=er.save(e);
		return e1.getEid();
	}

	@Override
	public Employee getEmp(Integer id) {
		Optional<Employee>opt=er.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
			else {
		
		return null;
			}
	}

	@Override
	public List<Employee> getAllEmp() {
		List<Employee>list=er.findAll();
		return list;
	}

	@Override
	public int updateEmployee(Employee e) {
		Employee e1=er.save(e);
		return e1.getEid();
	}

	@Override
	public void deleteEmployee(int id) {
		er.deleteById(id);
	}

	
}
