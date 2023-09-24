package com.bikkadIt.BlogApplication.service;

import com.bikkadIt.BlogApplication.dto.EmployeeDto;

public interface EmployeeService {

	public EmployeeDto saveEmployee(EmployeeDto employeeDto);
	
	public EmployeeDto getEmployee(Long empId);
}
