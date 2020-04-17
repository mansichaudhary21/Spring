package com.capg.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private int employeeId;
	private String employeeName;
	private double salary;
	private String businessUnit;
	private int age;
	
	private Employee emp;
	
	public Employee getEmp() {
		return emp;
	}
	@Autowired
	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, double salary, String businessUnit, int age) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.businessUnit = businessUnit;
		this.age = age;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public Employee getEmpDetails()
	{
		emp.setEmployeeId(12345);
		emp.setEmployeeName("Harriett");
		emp.setSalary(40000);
		emp.setBusinessUnit("PES-BU");
		emp.setAge(30);
		return emp;

	}


	public void showDetails()
	{
		emp.getEmpDetails();
        System.out.println("Employee Details");
        System.out.println("-------------------");
		System.out.println("Employee ID: " + emp.getEmployeeId());
		System.out.println("Employee Name: " + emp.getEmployeeName());
		System.out.println("Employee Salary: " + emp.getSalary());
		System.out.println("Employee BussinessUnit: " + emp.getBusinessUnit());
		System.out.println("Employee Age: " + emp.getAge());
	}
	


}
