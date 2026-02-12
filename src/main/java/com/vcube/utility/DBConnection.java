package com.vcube.utility;
	import java.sql.Connection;
	import java.sql.DriverManager;

	public class DBConnection {
		Connection con = null;
		public Connection getconnection() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			}catch(Exception s1) {
				System.out.println(s1);
			}
			return con;
		}
		

	}

