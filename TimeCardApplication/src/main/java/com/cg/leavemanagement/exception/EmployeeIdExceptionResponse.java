package com.cg.leavemanagement.exception;

public class EmployeeIdExceptionResponse {
	
	private String empId;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public EmployeeIdExceptionResponse(String empId) {
		super();
		this.empId = empId;
	}
}

	

