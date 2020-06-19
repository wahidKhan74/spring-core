package com.simplilearn.spring_core_demo;

public class Employee {
	
	private int empId;
	private String empName;
	private String empDept;
	private double empSalary;
	
	//constructor
	Employee(){}

	public Employee(int empId, String empName, String empDept, double empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empSalary = empSalary;
	}
	
	//setter and getter
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	//override toString 
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empSalary=" + empSalary
				+ "]";
	}
	

}
