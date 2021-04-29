package com.example.jpademo.lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonService {
	
	@Autowired
	LessonRepository lRepository;
	
	List<Lesson> lessons = new ArrayList<>();
	
	public List<Lesson> getLessons(int id){
		List<Lesson> lessons = new ArrayList<>();
		lRepository.findByCourseId(id).forEach(lessons::add);
		return lessons;
	}
	
	public Lesson getLessonById(int id) {
		return lRepository.findById(id).get();
	}
	
	public void addLesson(Lesson lesson) {
		lRepository.save(lesson);
		
	}
	
	public void updateLesson(Lesson lesson) {
		lRepository.save(lesson);
	}

	public void removeLesson(int id) {
		lRepository.deleteById(id);
	}

}
	
