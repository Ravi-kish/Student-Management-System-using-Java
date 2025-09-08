package com.college.sm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.sm.API.Student;
import com.college.sm.SAO.StudentDAO;

@Service
public class StudentServiceImpil implements StudentService {

	@Autowired
	private StudentDAO studentDAO;

	@Override
	public List<Student> LoadStudents() {

		List<Student> studentList = studentDAO.loadStudent();

		return studentList;
	}

	@Override
	public void saveStudent(Student student) {
		studentDAO.saveStudent(student);

	}

	@Override
	public Student getStudent(int srNo) {
		return studentDAO.getStudent(srNo);
	}

	@Override
	public void update(Student student) {
		studentDAO.update(student);
	}

	@Override
	public void deleteStudent(int srNo) {
		studentDAO.deleteStudent(srNo);	
	}

}
