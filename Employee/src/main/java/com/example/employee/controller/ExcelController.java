package com.example.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.employee.exceptionhandler.RecordExceededException;
import com.example.employee.model.FieldConfig;
import com.example.employee.model.FieldConfig.FieldGroup;
import com.example.employee.service.ExcelService;


@RestController
@RequestMapping(path="/excel")
public class ExcelController {

	@Autowired
	public ExcelService excelService;
	
	@PostMapping("/upload")
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) { 
	    try {
	    	 FieldConfig fieldConfig = new FieldConfig();
	         List<FieldGroup> fieldGroups = new ArrayList<>();
	         fieldConfig.setFieldGroups(fieldGroups);
	         excelService.save(file, fieldConfig);
	        return ResponseEntity.ok("File uploaded successfully: " + file.getOriginalFilename());
	    } catch (RecordExceededException e) {
	        return ResponseEntity.badRequest().body(e.getMessage());
	    } catch (Exception e) {
	        return ResponseEntity.badRequest().body("Error processing file: " + e.getMessage());
	    }
	}
}