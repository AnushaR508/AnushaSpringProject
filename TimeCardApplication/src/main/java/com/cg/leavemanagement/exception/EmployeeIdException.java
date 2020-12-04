package com.cg.leavemanagement.exception;

public class EmployeeIdException extends RuntimeException{
	public  EmployeeIdException()
	{
		super();
	}
	public  EmployeeIdException(String errMSg)
	{
		super(errMSg);
	}
}
