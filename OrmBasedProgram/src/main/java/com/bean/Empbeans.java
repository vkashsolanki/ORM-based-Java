package com.bean;

public class Empbeans {
	
	private String name, email, address;
	
	
	

	public Empbeans() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empbeans(String name, String email, String address) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
