package com.example.jpademo.course;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpademo.student.Student;

@RestController
public class CourseContoller {
	
	@Autowired
	CourseService courseService;
	
		
	@RequestMapping("students/{id}/courses")
	public List<Course> showCourse(@PathVariable int id) {
		return courseService.getCourses(id);
	}
	
	
	@RequestMapping("/students/courses/{id}")
	public Course getCourseByid(@PathVariable int id) {
		return courseService.getCourseById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "students/{studentID}/courses/add")
	public void addCourse(@RequestBody Course course,@PathVariable int studentID) {
		course.setStudent(new Student(studentID,"",0));
		courseService.addCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "students/{studentID}/courses/{courseID}")
	public void updateCourse(@RequestBody Course course, @PathVariable int courseID,@PathVariable int studentID) {
		courseService.updateCourse(course);
	}
	
	@RequestMapping(method =  RequestMethod.DELETE, value = "students/{id}/courses/{id}")
	public void  deleteCourse(@PathVariable int id) {
		courseService.removeCourse(id);
	}
}