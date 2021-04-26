package com.example.demo.dao;


import java.util.List;

import com.example.demo.model.Student;


public interface StudentDao {
	public void insert(Student s) ;
	public void delRecordById(int id);
	public int delRecordByNameORSem( String name, int sem);
	 void insert(List<Student> students);
	void getAllStudents();
	Student findStudentById(int id);
	List<Student> GroupBySem();

}
