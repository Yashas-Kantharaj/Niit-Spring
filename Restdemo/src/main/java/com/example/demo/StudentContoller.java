package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentContoller {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping("students")
	public void getStudent() {
		studentService.createStudent();
	}
		
	@RequestMapping("students/show")
	public List<Student> showStudent() {
		return studentService.getStudents();
	}
	
	
	@RequestMapping("/students/{id}")
	public Student getStudendByid(@PathVariable int id) {
		return studentService.getStudentById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "students/add")
	public void addStudents(@RequestBody Student student) {
		studentService.addStudent(student);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "students/update/{id}")
	public void updateStudent(@RequestBody Student student, @PathVariable int id) {
		studentService.updateStudent(student,id);
	}
	
	@RequestMapping(method =  RequestMethod.DELETE, value = "students/delete/{id}")
	public void  deleteStudent(@PathVariable int id) {
		studentService.removeStudent(id);
	}
}
