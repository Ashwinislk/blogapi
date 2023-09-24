package com.bikkadIt.BlogApplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="employee")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long empId;
	
	@Column(name="emp_Name")
	private String empName;
	
	@Column(name="emp_Address")
	private String empAddress;
	
	@Column(name="emp_Email")
	private String empEmail;
	
	@Column(name="emp_Pass")
	private String empPass;
	
	
	
}
