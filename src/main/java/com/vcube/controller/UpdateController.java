package com.vcube.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.vcube.Dao.StudentDao;
import com.vcube.Dto.Student;


@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Welcome To Student Update");
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String email=request.getParameter("email");
		long phno=Long.parseLong(request.getParameter("phno"));
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		Student s = new Student();
		s.setFirstname(firstname);
		s.setLastname(lastname);
		s.setEmail(email);
		s.setMobile(phno);
		s.setUsername(username);
		s.setPassword(password);
		
		StudentDao sd = new StudentDao();
		String status = sd.updatestudent(s);
		
		if(status.equals("success")) {
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("update.jsp");
			rd.forward(request, response);
		}
	}

}
