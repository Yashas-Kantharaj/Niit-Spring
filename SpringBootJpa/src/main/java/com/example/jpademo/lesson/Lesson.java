package com.example.jpademo.lesson;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

import com.example.jpademo.course.Course;

@Entity
public class Lesson {
	@Id
	int id;
	String name;
	int sem;
	@ManyToOne
	private Course course;
	
	public Lesson(int id, String name, int sem, int average,int courseId,int studentId) {
		super();
		this.id = id;
		this.name = name;
		this.sem = sem;
		this.course = new Course(courseId, "",0, studentId);
		
		
		
		
	}
	public Lesson() {
		
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
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}


}
	

	

	
