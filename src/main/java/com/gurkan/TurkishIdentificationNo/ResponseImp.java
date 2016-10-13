package com.gurkan.TurkishIdentificationNo;

import java.util.List;

public class ResponseImp implements Response{
	
	private boolean valid;
	private List<String> errors;
	
	public List<String> getErrors() {
		return errors;
	}
	
	public boolean isValid() {
		return valid;
	}
	
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
	

}
