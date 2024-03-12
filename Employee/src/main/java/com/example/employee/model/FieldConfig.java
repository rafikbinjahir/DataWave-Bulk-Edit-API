package com.example.employee.model;


import java.util.List;

import org.springframework.data.annotation.Id;

public class FieldConfig {

	@Id
	public String id;
	public String description;
	public List<FieldGroup> fieldGroups;
	public String entryType;
	public String templateLogoPath;
	
	
	public String getTemplateLogoPath() {
		return templateLogoPath;
	}
	public void setTemplateLogoPath(String templateLogoPath) {
		this.templateLogoPath = templateLogoPath;
	}
	public String getEntryType() {
		return entryType;
	}
	public void setEntryType(String entryType) {
		this.entryType = entryType;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<FieldGroup> getFieldGroups() {
		return fieldGroups;
	}
	public void setFieldGroups(List<FieldGroup> fieldGroups) {
		this.fieldGroups = fieldGroups;
	}
	
	
	
	
	public static class FieldGroup{
		private String groupName;
		private String groupFieldName;
		private boolean multipleEntries;
		private List<Fields> fields;
		
		public String getGroupName() {
			return groupName;
		}
		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
		public String getGroupFieldName() {
			return groupFieldName;
		}
		public void setGroupFieldName(String groupFieldName) {
			this.groupFieldName = groupFieldName;
		}
		public boolean isMultipleEntries() {
			return multipleEntries;
		}
		public void setMultipleEntries(boolean multipleEntries) {
			this.multipleEntries = multipleEntries;
		}
		public List<Fields> getFields() {
			return fields;
		}
		public void setFields(List<Fields> fields) {
			this.fields = fields;
		}

		
		public static class Fields{
			private String fieldName;
			private String displayName;
			private String dataType;
			private boolean isMandatory;
			private Integer length;
			private List<String> allowedExtension;
			private Integer allowedFiles;
			private Integer allowedSize;
			private boolean isSystemField;
			private boolean isDisplayField;
			private Integer objectKey;
			private String objectDisplayField;
			private String objectDisplayFieldName;
			private String objectName;
			private List<String> Values;
			private String score;
			private String correctAnswers;
			private int minSize;
			private int maxSize;
			
			public List<String> getAllowedExtension() {
				return allowedExtension;
			}
			public void setAllowedExtension(List<String> allowedExtension) {
				this.allowedExtension = allowedExtension;
			}
			public String getScore() {
				return score;
			}
			public void setScore(String score) {
				this.score = score;
			}
			public String getFieldName() {
				return fieldName;
			}
			public void setFieldName(String fieldName) {
				this.fieldName = fieldName;
			}
			public String getDisplayName() {
				return displayName;
			}
			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}
			public String getDataType() {
				return dataType;
			}
			public void setDataType(String dataType) {
				this.dataType = dataType;
			}
			public boolean isMandatory() {
				return isMandatory;
			}
			public void setMandatory(boolean isMandatory) {
				this.isMandatory = isMandatory;
			}
			public Integer getLength() {
				return length;
			}
			public void setLength(Integer length) {
				this.length = length;
			}
			
			public Integer getAllowedFiles() {
				return allowedFiles;
			}
			public void setAllowedFiles(Integer allowedFiles) {
				this.allowedFiles = allowedFiles;
			}
			public Integer getAllowedSize() {
				return allowedSize;
			}
			public void setAllowedSize(Integer allowedSize) {
				this.allowedSize = allowedSize;
			}
			public boolean isSystemField() {
				return isSystemField;
			}
			public void setSystemField(boolean isSystemField) {
				this.isSystemField = isSystemField;
			}
			public boolean isDisplayField() {
				return isDisplayField;
			}
			public void setDisplayField(boolean isDisplayField) {
				this.isDisplayField = isDisplayField;
			}
			public Integer getObjectKey() {
				return objectKey;
			}
			public void setObjectKey(Integer objectKey) {
				this.objectKey = objectKey;
			}
			public String getObjectDisplayField() {
				return objectDisplayField;
			}
			public void setObjectDisplayField(String objectDisplayField) {
				this.objectDisplayField = objectDisplayField;
			}
			public String getObjectDisplayFieldName() {
				return objectDisplayFieldName;
			}
			public void setObjectDisplayFieldName(String objectDisplayFieldName) {
				this.objectDisplayFieldName = objectDisplayFieldName;
			}
			public String getObjectName() {
				return objectName;
			}
			public void setObjectName(String objectName) {
				this.objectName = objectName;
			}
			public List<String> getValues() {
				return Values;
			}
			public void setValues(List<String> values) {
				Values = values;
			}
		
			public String getCorrectAnswers() {
				return correctAnswers;
			}
			public void setCorrectAnswers(String correctAnswers) {
				this.correctAnswers = correctAnswers;
			}
			public int getMinSize() {
				return minSize;
			}
			public void setMinSize(int i) {
				this.minSize = i;
			}
			public int getMaxSize() {
				return maxSize;
			}
			public void setMaxSize(int maxSize) {
				this.maxSize = maxSize;
			}
			
			
			
			
		} 
		
	}

	}
