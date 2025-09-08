package com.college.sm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.college.sm.API.Student;
import com.college.sm.SAO.StudentDAO;
import com.college.sm.service.StudentService;
import com.college.sm.service.StudentServiceImpil;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/showStudent")
	public String showStudentList(Model model) {

		List<Student> studentList = studentService.LoadStudents();

		for (Student tempStudent : studentList) {
			System.out.println(tempStudent);
		}

		model.addAttribute("students", studentList);
		return "Student-list";

	}

	@GetMapping("/showAddStudentPage")
	public String addStudent(Model model) {

		Student student = new Student();

		model.addAttribute("student", student);

		return "add-student";

	}

	@PostMapping("/save-student")
	public String saveStudent(Student student) {

		System.out.println(student);

		if (student.getSrNo() == 0) {

			studentService.saveStudent(student);
		} else {
			studentService.update(student);
		}
		return "redirect:/showStudent";

	}

	@GetMapping("/updateStudent")
	public String updateStudent(@RequestParam("UsersrNo") int srNo, @ModelAttribute("student") Student student,
			Model model) {

		System.out.println(srNo);

		Student theStudent = studentService.getStudent(srNo);
		System.out.println(theStudent);
		model.addAttribute("student", theStudent);

		return "add-student";

	}
	
	@GetMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("UsersrNo") int srNo) {
		
		studentService.deleteStudent(srNo);

		

		return "redirect:/showStudent";
	}

}
