package com.example.employee.service;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;

import com.example.employee.exceptionhandler.RecordExceededException;
import com.example.employee.model.Employee;
import com.example.employee.model.Excel;
import com.example.employee.model.FieldConfig;
import com.example.employee.model.FieldConfig.FieldGroup;
import com.example.employee.model.FieldConfig.FieldGroup.Fields;
import com.example.employee.repository.ExcelRepository;

@Service
public class ExcelService {

	
	@Autowired
	public ExcelRepository excelRepository;
	
	 public void save(MultipartFile file,FieldConfig fieldConfig) {
		 try {
			 Workbook workbook = new XSSFWorkbook(file.getInputStream());
	            Sheet sheet = workbook.getSheetAt(0);
	            Iterator<Row> rows = sheet.iterator();
	            Map<Integer, String> headers = new HashMap<>();
	            int dataRowCount = 0;
	            
	            if (rows.hasNext()) {
	            	  Row headerRow = rows.next();
	                  headers = parseHeaders(headerRow);
	              }
	            
	            while (rows.hasNext()) {
	                if (dataRowCount >= 1000)
	                {
	        	        throw new RecordExceededException("Total number of records exceeds the maximum allowed 1000");	                
	                }
                	workbook.close();
	                Row currentRow = rows.next();
	                Excel excelData = new Excel();
	                Map<String, Object> jsonValues = new HashMap<>();
	                
	                for (Cell cell : currentRow) {
	                    String header = headers.get(cell.getColumnIndex());
	                    String cellValue = getCellValueAsString(cell);
	                    
	                    for (FieldGroup fieldGroup : fieldConfig.getFieldGroups()) {
	                        for (Fields fields : fieldGroup.getFields()) {
	                            if (header.equalsIgnoreCase(fields.getDisplayName())) {
	                                jsonValues.put(fields.getFieldName(), cellValue);
	                    }
	                }
	                    }
	    	            
	                }
	                excelData.setJsonValues(jsonValues);
	                excelRepository.save(excelData);
	                dataRowCount++; 
	            
	            }
		 }
	 catch (IOException e) {
         throw new RuntimeException("fail to parse Excel file: " + e.getMessage());
	   }
	    }
		 

	 private String getCellValueAsString(Cell cell) {
	        DataFormatter formatter = new DataFormatter();
	        return formatter.formatCellValue(cell);
	    }

	    

private Map<Integer, String> parseHeaders(Row headerRow) {
    Map<Integer, String> headers = new HashMap<>();
    headerRow.forEach(cell -> headers.put(cell.getColumnIndex(), getCellValueAsString(cell)));
    return headers;
}
}     