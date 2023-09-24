package com.bikkadIt.BlogApplication.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadIt.BlogApplication.dto.EmployeeDto;
import com.bikkadIt.BlogApplication.serviceImpl.EmployeeServiceImpl;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@PostMapping("/employees")
	public EmployeeDto saveEmp(@RequestBody EmployeeDto employeeDto) {
		EmployeeDto saveEmployee = employeeServiceImpl.saveEmployee(employeeDto);
		
		return saveEmployee;
		
	}
	@GetMapping("/employees/{empId}")
	public EmployeeDto getemployee(@PathVariable Long empId) {
		EmployeeDto employee = employeeServiceImpl.getEmployee(empId);
		
		return employee ;
	
}
}