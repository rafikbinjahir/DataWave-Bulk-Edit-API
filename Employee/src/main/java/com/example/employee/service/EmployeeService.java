package com.example.employee.service;


import java.util.HashMap;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.employee.model.FieldConfig;

import jakarta.xml.bind.ValidationException;
@Service
public class EmployeeService {



	public Map<String, Object> getFieldValues(FieldConfig fieldValues,Map<String,Object> values) throws ValidationException {
		
		Map<String, Object> fieldError = new HashMap<>();
		int errorCount = 0;

		
		for(FieldConfig.FieldGroup fieldGroup :fieldValues.fieldGroups)
		{
			for(FieldConfig.FieldGroup.Fields feldsValues :fieldGroup.getFields())
			{
				for(Map.Entry<String, Object> entry:values.entrySet())
				{
					if(feldsValues.isMandatory() && entry.getKey().equalsIgnoreCase(feldsValues.getFieldName())) 
					{
						 if (values.containsKey(feldsValues.getFieldName())) 
						 {
				                Object value = values.get(feldsValues.getFieldName());
				                System.out.print("values"+value);
				                if(feldsValues.getDataType().equalsIgnoreCase("textbox")) 
								{ 						
									if(value == null || ((String) value).trim().isEmpty())
											{
										fieldError.put(feldsValues.getFieldName(), feldsValues.getDisplayName()+ " cannot be empty");
										errorCount++;
											}
									else if(((String)value).length()>feldsValues.getLength())
									{
										fieldError.put(feldsValues.getFieldName(), feldsValues.getDisplayName()+ " exceeds the allowed limit");
										errorCount++;
									}
								}
				                if(feldsValues.getDataType().equalsIgnoreCase("dropdown")) 
				                {
									if(value == null || ((String) value).trim().isEmpty())
									{
										fieldError.put(feldsValues.getFieldName(), feldsValues.getDisplayName()+" there is no values");
										errorCount++;
									}
								}
				                if(feldsValues.getDataType().equalsIgnoreCase("object"))
				                {
									if(value == null || ((String) value).trim().isEmpty())
									{
										fieldError.put(feldsValues.getFieldName(), feldsValues.getDisplayName()+" there is no values");
										errorCount++;
									}
									else if(((String)value).length()>feldsValues.getLength())
									{
										fieldError.put(feldsValues.getFieldName(), feldsValues.getDisplayName()+ " exceeds the allowed limit");
										errorCount++;
									}
								}
				                if(feldsValues.getDataType().equalsIgnoreCase("number"))
				                {
									if(value == null || ((String) value).trim().isEmpty())
									{
										fieldError.put(feldsValues.getFieldName(), feldsValues.getDisplayName()+" there is no values");
										errorCount++;
									}
								
								}
				                
						 }
					}
				}
			}
		}
		Map<String ,Object> result = new HashMap<>();
		result.put("fieldErrors", fieldError);
		result.put("errorCount", errorCount);
		
		
		return result;
		
		
		
	}

}