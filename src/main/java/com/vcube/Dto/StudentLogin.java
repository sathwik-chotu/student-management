package com.vcube.Dto;

public class StudentLogin {
	private String username;
	private String password;
	
	public StudentLogin() {
		

	
		
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
    	// TODO Auto-generated method stub
    	return username;
    }
	public StudentLogin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

}
