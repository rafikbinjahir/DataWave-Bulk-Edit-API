package com.example.employee.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.employee.model.Employee;
import com.example.employee.model.Excel;

public interface ExcelRepository extends MongoRepository<Excel,String>{

}
