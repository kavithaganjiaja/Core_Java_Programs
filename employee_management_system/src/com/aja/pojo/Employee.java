package com.aja.pojo;

public class Employee {
	int empID;
	String empName;
	String empAdd;
	String empEmail;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public Employee(int empID, String empName, String empAdd, String empEmail) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empAdd = empAdd;
		this.empEmail = empEmail;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}

}
