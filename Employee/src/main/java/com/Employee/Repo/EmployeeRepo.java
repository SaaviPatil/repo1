package com.Employee.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Employee.beans.Employee;

public interface EmployeeRepo  extends JpaRepository<Employee,Integer> {

}
