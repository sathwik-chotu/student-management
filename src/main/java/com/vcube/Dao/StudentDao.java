package com.vcube.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.vcube.utility.DBConnection;
import com.vcube.Dto.Student;
import com.vcube.Dto.StudentLogin;

public class StudentDao implements StudentDaoInterface {
	String status = "failure";
	@Override
	public String insertstudent(Student s) {
		
		try {
			DBConnection dbc = new DBConnection();
			Connection con = dbc.getconnection();
			PreparedStatement ps = con.prepareStatement("insert into studrig(firstname,lastname,email,phno,username,password) values(?,?,?,?,?,?)");
			ps.setString(1,s.getFirstname());
			ps.setString(2,s.getLastname());
			ps.setString(3,s.getEmail());
			ps.setLong(4,s.getphno());
			ps.setString(5,s.getUsername());
			ps.setString(6,s.getPassword());
			int n = ps.executeUpdate();
			if(n>0) {
				System.out.println("rows(s) affected");
				status = "success";
				
			}else {
				System.out.println("somthing went wrong");
			}
			
		}catch (Exception s1) {
			System.out.println(s1);
		}
		return status;
		}
	@Override
	public String updatestudent(Student s) {
		
		try {
			DBConnection dbc = new DBConnection();
			Connection con = dbc.getconnection();
			PreparedStatement ps = con.prepareStatement("update studrig set firstname=?,lastname=?,email=?,phno=?,username=?,password=? where firstname=?");
			ps.setString(1,s.getFirstname());
			ps.setString(2,s.getLastname());
			ps.setString(3,s.getEmail());
			ps.setLong(4,s.getphno());
			ps.setString(5,s.getUsername());
			ps.setString(6,s.getPassword());
			ps.setString(7,s.getFirstname());
			int n = ps.executeUpdate();
			if(n>0) {
				System.out.println("rows(s) updated");
				status = "success";
				
			}else {
				System.out.println("somthing went wrong");
			}
			
		}catch (Exception s1) {
			System.out.println(s1);
		}
		return status;
		}

	@Override
	public String selectstudent(StudentLogin lm) {
		try {
		DBConnection dbc = new DBConnection();
		Connection con = dbc.getconnection();
		PreparedStatement ps = con.prepareStatement("select * from studrig where username = ? and password = ?");
		ps.setString(1,lm.getUsername());
		ps.setString(2,lm.getPassword());
		ResultSet rs = ps.executeQuery();
		
		int count = 0;
		while(rs.next()) {
			count++;
		}
		if (count > 0) {
			status = "success";
		}
		}catch(Exception s) {
			System.out.println(s);
		}
		return status;
	}
	
	public String deletestudent(String username) {
	   

	    try {
	    	DBConnection dbc = new DBConnection();
			Connection con = dbc.getconnection();
	        PreparedStatement ps = con.prepareStatement("DELETE FROM Studrig WHERE username = ?");

	        ps.setString(1, username);
	        int n = ps.executeUpdate();
	        if(n>0) {
				System.out.println("rows(s) deleted");
				status = "success";
				
			}else {
				System.out.println("somthing went wrong");
			}
			
		}catch (Exception s1) {
			System.err.println(s1);
		}
		return status;
		}
	

}
