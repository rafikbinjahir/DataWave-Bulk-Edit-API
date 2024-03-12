package com.example.employee.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.service.EmployeeService;

import jakarta.xml.bind.ValidationException;

import com.example.employee.model.FieldConfig;
import com.example.employee.repository.EmployeeRepository;

@RestController
@RequestMapping(path="/main")
public class Controller {

	@Autowired
	public EmployeeService employeeService;
	@Autowired
	public ConfigController configController;
	@Autowired
	public EmployeeRepository employeeRepository;
	
	@PostMapping(path="/create",consumes="application/json")
	public Object create(@RequestBody Map<String, Object> employee) throws ValidationException {
		FieldConfig fieldValues=configController.getFieldValue();
		Map<String, Object>fieldName=employeeService.getFieldValues(fieldValues,employee);
		
		
		Integer errorCount = (Integer) fieldName.get("errorCount");
		 if (errorCount != null && errorCount > 0) 
		 {
	     return fieldName;
		 }
		 else
		 {
		 employeeRepository.insert(employee);
		 return "created successfully";
		 }
	}
}