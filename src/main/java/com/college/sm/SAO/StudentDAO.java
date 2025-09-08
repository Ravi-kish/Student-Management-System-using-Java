package com.college.sm.SAO;

import java.util.List;

import com.college.sm.API.Student;

public interface StudentDAO {
	
	List<Student> loadStudent();
	
	void saveStudent(Student student);
	Student getStudent(int srNo);

	void update(Student student);

	

	void deleteStudent(int srNo);
		
	
	

}
