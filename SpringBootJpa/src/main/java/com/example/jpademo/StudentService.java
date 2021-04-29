package com.example.jpademo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	
	
//	public void createStudent(){
//		students.add(new Student(1, "yashas", 8, 85));
//		students.add(new Student(2, "ani", 7, 87));
//		students.add(new Student(3, "sam", 6, 77));
//	}
	
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<>();
		studentRepository.findAll().forEach(students::add);
		return students;
	}
	
	public Student getStudentById(int id) {
		return studentRepository.findById(id).get();
	}
	
	public void addStudent(Student student) {
		studentRepository.save(student);
		
	}
	
	public void updateStudent(Student student,int id) {
		studentRepository.save(student);
	}

	public void removeStudent(int id) {
		studentRepository.deleteById(id);
	}
}
	
