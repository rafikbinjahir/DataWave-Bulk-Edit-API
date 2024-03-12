package com.example.employee.controller;

import java.util.Arrays;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.model.FieldConfig;


//@RestController
//@RequestMapping(path="/validation")
@Service
public class ConfigController {
	
	//@RequestMapping(path="/valid",method=RequestMethod.POST,consumes="application/json")
	public FieldConfig getFieldValue(){
		
		FieldConfig employee = new FieldConfig();
		employee.setDescription("Employee");
		employee.setEntryType("private");
		employee.setTemplateLogoPath("");
		
		FieldConfig.FieldGroup EmployeeFieldGroup = new FieldConfig.FieldGroup();
		
		EmployeeFieldGroup.setGroupName("Employee Details");
		EmployeeFieldGroup.setGroupFieldName(null);
		EmployeeFieldGroup.setMultipleEntries(false);
		
		FieldConfig.FieldGroup.Fields fields1=new FieldConfig.FieldGroup.Fields();
		fields1.setFieldName("firstname");
		fields1.setDisplayName("First Name");
		fields1.setDataType("textbox");
		fields1.setMandatory(true);
		fields1.setAllowedExtension(null);
		fields1.setAllowedFiles(0);
		fields1.setAllowedSize(0);
		fields1.setLength(10);
		fields1.setObjectDisplayFieldName(null);
		fields1.setObjectDisplayField(null);
		fields1.setObjectName(null);
		fields1.setObjectKey(null);
		fields1.setScore(null);
		fields1.setSystemField(false);
		fields1.setDisplayField(true);
		fields1.setCorrectAnswers(null);
		fields1.setValues(null);
		
		
		
		FieldConfig.FieldGroup.Fields fields2=new FieldConfig.FieldGroup.Fields();
		fields2.setFieldName("lastname");
		fields2.setDisplayName("Last Name");
		fields2.setDataType("textbox");
		fields2.setMandatory(true);
		fields2.setAllowedExtension(null);
		fields2.setAllowedFiles(0);
		fields2.setAllowedSize(0);
		fields2.setLength(10);
		fields2.setObjectDisplayFieldName(null);
		fields2.setObjectDisplayField(null);
		fields2.setObjectName(null);
		fields2.setObjectKey(null);
		fields2.setScore(null);
		fields2.setSystemField(false);
		fields2.setDisplayField(true);
		fields2.setCorrectAnswers(null);
		fields2.setValues(null);
		
		FieldConfig.FieldGroup.Fields fields3=new FieldConfig.FieldGroup.Fields();
		fields3.setFieldName("dob");
		fields3.setDisplayName("Date of Birth");
		fields3.setDataType("date");
		fields3.setMandatory(true);
		fields3.setAllowedExtension(null);
		fields3.setAllowedFiles(0);
		fields3.setAllowedSize(0);
		fields3.setLength(20);
		fields3.setObjectDisplayFieldName(null);
		fields3.setObjectDisplayField(null);
		fields3.setObjectName(null);
		fields3.setObjectKey(null);
		fields3.setScore(null);
		fields3.setSystemField(false);
		fields3.setDisplayField(true);
		fields3.setCorrectAnswers(null);
		fields3.setValues(null);
		
		FieldConfig.FieldGroup.Fields fields4=new FieldConfig.FieldGroup.Fields();
		fields4.setFieldName("position");
		fields4.setDisplayName("Employee Position");
		fields4.setDataType("textbox");
		fields4.setMandatory(true);
		fields4.setAllowedExtension(null);
		fields4.setAllowedFiles(0);
		fields4.setAllowedSize(0);
		fields4.setLength(100);
		fields4.setObjectDisplayFieldName(null);
		fields4.setObjectDisplayField(null);
		fields4.setObjectName(null);
		fields4.setObjectKey(null);
		fields4.setScore(null);
		fields4.setSystemField(false);
		fields4.setDisplayField(true);
		fields4.setCorrectAnswers(null);
		fields4.setValues(null);
		
		FieldConfig.FieldGroup.Fields fields5=new FieldConfig.FieldGroup.Fields();
		fields5.setFieldName("type");
		fields5.setDisplayName("Employee Type");
		fields5.setDataType("dropdown");
		fields5.setMandatory(true);
		fields5.setAllowedExtension(null);
		fields5.setAllowedFiles(0);
		fields5.setAllowedSize(0);
		fields5.setLength(100);
		fields5.setObjectDisplayFieldName(null);
		fields5.setObjectDisplayField(null);
		fields5.setObjectName(null);
		fields5.setObjectKey(null);
		fields5.setScore(null);
		fields5.setSystemField(false);
		fields5.setDisplayField(true);
		fields5.setCorrectAnswers(null);
		fields5.setValues(null);
		
		FieldConfig.FieldGroup.Fields fields6=new FieldConfig.FieldGroup.Fields();
		fields6.setFieldName("employeeId");
		fields6.setDisplayName("Employee ID");
		fields6.setDataType("textbox");
		fields6.setMandatory(true);
		fields6.setAllowedExtension(null);
		fields6.setAllowedFiles(0);
		fields6.setAllowedSize(0);
		fields6.setLength(5);
		fields6.setObjectDisplayFieldName(null);
		fields6.setObjectDisplayField(null);
		fields6.setObjectName(null);
		fields6.setObjectKey(null);
		fields6.setScore(null);
		fields6.setSystemField(false);
		fields6.setDisplayField(true);
		fields6.setCorrectAnswers(null);
		fields6.setValues(null);
		
		FieldConfig.FieldGroup.Fields fields7=new FieldConfig.FieldGroup.Fields();
		fields7.setFieldName("cardId");
		fields7.setDisplayName("Access Card ID");
		fields7.setDataType("number");
		fields7.setMandatory(true);
		fields7.setAllowedExtension(null);
		fields7.setAllowedFiles(0);
		fields7.setAllowedSize(0);
		fields7.setLength(100);
		fields7.setObjectDisplayFieldName(null);
		fields7.setObjectDisplayField(null);
		fields7.setObjectName(null);
		fields7.setObjectKey(null);
		fields7.setScore(null);
		fields7.setSystemField(false);
		fields7.setDisplayField(true);
		fields7.setCorrectAnswers(null);
		fields7.setValues(null);
		fields7.setMinSize(10);
		fields7.setMaxSize(20);
	
		
		FieldConfig.FieldGroup.Fields fields8=new FieldConfig.FieldGroup.Fields();
		fields8.setFieldName("departmentId");
		fields8.setDisplayName("Department ID");
		fields8.setDataType("object");
		fields8.setMandatory(true);
		fields8.setAllowedExtension(null);
		fields8.setAllowedFiles(0);
		fields8.setAllowedSize(0);
		fields8.setLength(10);
		fields8.setObjectDisplayFieldName(null);
		fields8.setObjectDisplayField(null);
		fields8.setObjectName(null);
		fields8.setObjectKey(null);
		fields8.setScore(null);
		fields8.setSystemField(false);
		fields8.setDisplayField(true);
		fields8.setCorrectAnswers(null);
		fields8.setValues(null);
	
		
		
		employee.setFieldGroups(Arrays.asList(EmployeeFieldGroup));
		EmployeeFieldGroup.setFields(Arrays.asList(fields1,fields2,fields3,fields4,fields5,fields6,fields8));
		
		return employee;
		
		
	}
	
	
	
	

}
