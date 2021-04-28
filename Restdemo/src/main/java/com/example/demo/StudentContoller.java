package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentContoller {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping("students")
	public List<Student> getStudent() {
		return studentService.getStudents();
	}
	
	
	@RequestMapping("/students/{id}")
	public Student getStudendByid(@PathVariable int id) {
		return studentService.getStudentById(id);
	}
}
