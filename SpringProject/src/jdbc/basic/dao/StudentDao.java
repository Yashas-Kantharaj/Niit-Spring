package jdbc.basic.dao;

import java.util.List;

import jdbc.basic.model.Student;

public interface StudentDao {
	public void insert(Student s) ;
	public void delRecordById(int id);
	public int delRecordByNameORSem( String name, int sem);
	 void insert(List<Student> students);
	List<Student> getAllStudents();
	Student findStudentById(int id);

}
