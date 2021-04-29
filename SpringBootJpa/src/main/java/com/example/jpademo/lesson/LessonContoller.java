package com.example.jpademo.lesson;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpademo.course.Course;
import com.example.jpademo.student.Student;

@RestController
public class LessonContoller {
	
	@Autowired
	LessonService lService;
	
		
	@RequestMapping("students/courses/{id}/lesson")
	public List<Lesson> showCourse(@PathVariable int id) {
		return lService.getLessons(id);
	}
	
	
	@RequestMapping("/students/courses/lesson/{id}")
	public Lesson getCourseByid(@PathVariable int id) {
		return lService.getLessonById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "students/courses/{courseID}/lesson/add")
	public void addCourse(@RequestBody Lesson lesson,@PathVariable int courseID) {
		lesson.setCourse(new Course(courseID,"",0,0));
		lService.addLesson(lesson);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "students/courses/{courseID}/lesson/{lessonID}")
	public void updateCourse(@RequestBody Lesson lesson, @PathVariable int courseID,@PathVariable int lessonID) {
		lService.updateLesson(lesson);
	}
	
	@RequestMapping(method =  RequestMethod.DELETE, value = "students/courses/{id}/lesson/{id}")
	public void  deleteCourse(@PathVariable int id) {
		lService.removeLesson(id);
	}
}
