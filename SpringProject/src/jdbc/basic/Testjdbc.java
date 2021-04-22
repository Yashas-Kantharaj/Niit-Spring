package jdbc.basic;

import jdbc.basic.dao.StudentDao;
import jdbc.basic.dao.StudentDaoImpl;
import jdbc.basic.model.Student;

public class Testjdbc {
	public static void main(String[] args) {
		Student s1= new Student(4, "ramya", 8, 60);
		StudentDao studentDao = new StudentDaoImpl();
		studentDao.insert(s1);

		
	}
}
