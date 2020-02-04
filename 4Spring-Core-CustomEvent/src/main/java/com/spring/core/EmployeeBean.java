package com.spring.core;

public class EmployeeBean {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 public void init() {
	        System.out.println("Init");
	    }
	    public void destroy() {
	        System.out.println("Destroy");
	    }
	
}
