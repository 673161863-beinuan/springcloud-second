package com.beinuan.spring.cloud.bean;

public class Employee {

	private Integer empId;
	private String empName;
	private Double empSalary;
	
	public Employee() {
	}

	public Employee(Integer empId, String empName, Double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public Integer getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public Double getEmpSalary() {
		return empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	

}
