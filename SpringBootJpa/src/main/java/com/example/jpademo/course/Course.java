package com.example.jpademo.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

import com.example.jpademo.student.Student;

@Entity
public class Course {
	@Id
	int id;
	String name;
	int sem;
	@ManyToOne
	private Student student;
	
	public Course(int id, String name, int sem, int average,int studentId) {
		super();
		this.id = id;
		this.name = name;
		this.sem = sem;
		this.student = new Student(studentId,"",0,0);
		
		
		
		
	}
	public Course() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}

}
	

	

	
