package com.vcube.Dto;

public class Student {
	public Student(String firstname, String lastname, String email, long phno, String username, String password) {
	super();
	this.firstname=firstname;
	this.lastname=lastname;
	this.email=email;
	this.phno=phno;
	this.username=username;
	this.password=password;
	
	}
	private String firstname;
	private String lastname;
	private String email;
	private long phno;
	private String username;
	private String password;
	
	public Student() {
		
	
}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getphno() {
		return phno;
	}

	public void setMobile(long phno) {
		this.phno = phno;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return lastname;
		
	}

	
}
