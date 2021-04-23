package jdbc.basic;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jdbc.basic.dao.StudentDao;
import jdbc.basic.model.Student;

//@Service("studentdoeHelper")
public class StudentHelper {
	
	@Autowired
	StudentDao studentDaoImpl;

	void insertStudents(){
		Student s1 = new Student(1, "students name1", 1, 11);
		Student s2 = new Student(2, "students name2", 2, 22);
		Student s3 = new Student(3, "students name3", 3, 33);
		Student s4 = new Student(4, "students name4", 4, 44);
		ArrayList<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		studentDaoImpl.insert(students);
		System.out.println("batch updated complete..");

	}

}