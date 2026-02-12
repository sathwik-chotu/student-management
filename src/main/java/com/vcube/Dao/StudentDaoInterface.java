package com.vcube.Dao;

import com.vcube.Dto.Student;
import com.vcube.Dto.StudentLogin;

public interface StudentDaoInterface {
	public String insertstudent(Student s);
	
	public String selectstudent(StudentLogin lm);

	public String updatestudent(Student s);
	
	public String deletestudent(String username);

}
