package com.Employee.Controller;
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

import com.Employee.beans.Employee;
import com.Employee.service.EmployeeService;



@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private EmployeeService es;
	
	@GetMapping("/show")
	public String showMsg() {
		System.out.println("request reached");
		return "hello boot";
	}
	
	@GetMapping("/getEmp/{id}")
	public Employee getEmployee(@PathVariable Integer id) {
		System.out.println("id got "+id);
		Employee e= es.getEmp(id);

		
		return e;
	}
	
	@PostMapping("/insertEmp")
	public int insertEmployee(@RequestBody Employee e) {
		System.out.println(e);
		int id=es.insertIntoDb(e);
		return id;
		
	}
	@GetMapping("/getall")
	public List<Employee>getAllEmployee(){
		List<Employee>emplist=es.getAllEmp();
		return null;
		
	}
	@PutMapping("/updateemp")
	public int updateProduct(@RequestBody Employee e) {
		
		int id=es.updateEmployee(e);
		
		return id;
	}
	@DeleteMapping("/deleteemp/{id}")
	public void deleteEmployee(@PathVariable Integer id) {
		es.deleteEmployee(id);
		System.out.println("Employee deleted");
	}
	
	
}
