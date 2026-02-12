package com.vcube.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.vcube.Dao.StudentDao;
import com.vcube.Dto.StudentLogin;


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Welcome To Login Page");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		StudentLogin lm =new StudentLogin();
		lm.setUsername(username);
		lm.setPassword(password);
		
		StudentDao sd = new StudentDao();
		String status = sd.selectstudent(lm);
		
		if(status.equals("success")) {
			//request.setAttribute("username", username);
			HttpSession session = request.getSession();
			session.setAttribute("username",username);
			RequestDispatcher rd=	request.getRequestDispatcher("studenthome.jsp");
				rd.forward(request, response);
			}
		else {
			RequestDispatcher rd=	request.getRequestDispatcher("login.jsp");
					rd.forward(request, response);
				}
		}
	}


