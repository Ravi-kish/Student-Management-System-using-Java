package com.college.sm.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.college.sm.API.Student;

public class StudentRowMpper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setSrNo(rs.getInt("srNo"));
		student.setId(rs.getInt("id"));
		student.setName(rs.getString("name"));
		student.setMobile(rs.getLong("mobile"));
		student.setEmail(rs.getString("email"));
		student.setBranch(rs.getString("branch"));

		return student;
	}

}
