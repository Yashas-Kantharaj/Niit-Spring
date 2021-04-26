package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.dao.StudentDaoImpl;
import com.example.demo.model.Student;


@SpringBootApplication
public class SpringBootJdbcApplication {
	

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootJdbcApplication.class, args);
		StudentDaoImpl studentdao = context.getBean(StudentDaoImpl.class);
		
		Student s = new Student(7,"ani",8,55);
		studentdao.insert(s);
		studentdao.getAllStudents();
	}

}
