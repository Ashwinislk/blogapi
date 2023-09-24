package com.bikkadIt.BlogApplication.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

    
	private Long empId;
	
	private String empName;
	
	private String empAddress;
	
	private String empEmail;
	
	
	private String empPass;
}
