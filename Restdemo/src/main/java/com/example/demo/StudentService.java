package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sun.el.stream.Optional;


@Service
public class StudentService {
	
	List<Student> students = new ArrayList<>();
	
	public void createStudent(){
		
		
		students.add(new Student(1, "yashas", 8, 85));
		students.add(new Student(2, "ani", 7, 87));
		students.add(new Student(3, "sam", 6, 77));
		
	}
	public List<Student> getStudents(){
		createStudent();
		return students;
	}
	public Student getStudentById(int id) {
		Student student =	students.stream().filter(s -> s.getId() == id).findFirst().get();
		return student;
	}
	
}
	
