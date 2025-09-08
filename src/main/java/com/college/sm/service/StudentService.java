package com.college.sm.service;

import java.util.List;

import com.college.sm.API.Student;

public interface StudentService {
	
	 List<Student>  LoadStudents();

	void saveStudent(Student student);
	
	Student getStudent(int srNo);

	void update(Student student);

	void deleteStudent(int srNo);

}
