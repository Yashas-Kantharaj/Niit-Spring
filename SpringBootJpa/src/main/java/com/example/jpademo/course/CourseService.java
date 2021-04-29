package com.example.jpademo.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	CourseRepository courseRepository;
	
	List<Course> courses = new ArrayList<>();
	
	public List<Course> getCourses(int id){
		List<Course> courses = new ArrayList<>();
		courseRepository.findByStudentId(id).forEach(courses::add);
		return courses;
	}
	
	public Course getCourseById(int id) {
		return courseRepository.findById(id).get();
	}
	
	public void addCourse(Course course) {
		courseRepository.save(course);
		
	}
	
	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void removeCourse(int id) {
		courseRepository.deleteById(id);
	}

}