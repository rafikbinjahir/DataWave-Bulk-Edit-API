package com.example.employee.model;

import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Excel {

	  @Id
	    private String id;

	    private Map<String, Object> jsonValues;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Map<String, Object> getJsonValues() {
			return jsonValues;
		}

		public void setJsonValues(Map<String, Object> jsonValues) {
			this.jsonValues = jsonValues;
		}
	    
	    
}
