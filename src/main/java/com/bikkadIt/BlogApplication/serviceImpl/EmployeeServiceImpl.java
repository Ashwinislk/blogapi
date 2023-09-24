package com.bikkadIt.BlogApplication.serviceImpl;



import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikkadIt.BlogApplication.dto.EmployeeDto;
import com.bikkadIt.BlogApplication.exception.ResourceNotFound;
import com.bikkadIt.BlogApplication.model.Employee;
import com.bikkadIt.BlogApplication.repository.EmployeeRepository;
import com.bikkadIt.BlogApplication.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	@Override
	public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
		Employee employee = this.modelMapper.map(employeeDto,Employee.class);
		
		Employee save = this.employeeRepository.save(employee);
		return this.modelMapper.map(save,EmployeeDto.class);
	
		
	
	  
	}


	@Override
	public EmployeeDto getEmployee(Long empId) {
		Employee employee = this.modelMapper.map(empId,Employee.class);
		 Employee employee2 = this.employeeRepository.findById(empId).orElseThrow(()-> new ResourceNotFound("Resource not found:"+empId));
		 
		return this.modelMapper.map(employee2, EmployeeDto.class);
	}



}
