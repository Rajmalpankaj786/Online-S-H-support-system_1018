package com.hardware_software_support.model;

public class Employee {

	private int empId;
	private int deptid;
	private String name;
	private String userName;
	private String password;
	
	public Employee() {}

	public Employee(int empId, int deptid, String name, String userName, String password) {
		super();
		this.empId = empId;
		this.deptid = deptid;
		this.name = name;
		this.userName = userName;
		this.password = password;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", deptid=" + deptid + ", name=" + name + ", userName=" + userName
				+ ", password=" + password + "]";
	}
	
	
}