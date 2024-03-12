package com.example.employee.repository;

import java.util.Map;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.employee.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String >{

	void insert(Map<String, Object> employee);

}
