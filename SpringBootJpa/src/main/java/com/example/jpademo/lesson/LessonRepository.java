package com.example.jpademo.lesson;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface LessonRepository extends CrudRepository<Lesson, Integer> {
	public List<Lesson> findByCourseId(Integer courseId);
}
