package com.Employee.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Employee {
@Id
private int eid;
@Column
private String ename;
@Column
private int salary;
public Employee(int eid, String ename, int salary) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.salary = salary;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
}

}
