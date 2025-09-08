package com.college.sm.SAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.college.sm.API.Student;
import com.college.sm.rowmapper.StudentRowMpper;

@Repository
public  class StudentDAOImpil implements StudentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Student> loadStudent() {

		String sql = "SELECT * FROM students";
		List<Student> theListOfStudents = jdbcTemplate.query(sql, new StudentRowMpper());
		return theListOfStudents;
	}

	@Override
	public void saveStudent(Student student) {

		Object[] sqlParameters = { student.getId(), student.getName(), student.getMobile(), student.getEmail(),
				student.getBranch() };

		String sql = "insert into students(id,name,mobile,email,branch) values(?,?,?,?,?)";
		jdbcTemplate.update(sql, sqlParameters);
		System.out.println("table updated......");
	}

	@Override
	public Student getStudent(int srNo) {

		String sql = "SELECT * FROM STUDENTS WHERE SRNO= ?";

		Student student = jdbcTemplate.queryForObject(sql, new StudentRowMpper(), srNo);
		return student;
	}

	@Override
	public void update(Student student) {
		String sql = "UPDATE STUDENTS SET  id = ?, name = ?, mobile = ?, email = ?, branch = ? WHERE srNo = ?";
        jdbcTemplate.update(sql,student.getId(), student.getName(), student.getMobile(), student.getEmail(),student.getBranch(),student.getSrNo() );
	System.out.println("record updated");	
	}

	public void deleteStudent(int srNo) {
		
		String sql = "DELETE FROM STUDENTS WHERE srNo = ?";
		
		jdbcTemplate.update(sql, srNo);
		
	}
	
	

}
