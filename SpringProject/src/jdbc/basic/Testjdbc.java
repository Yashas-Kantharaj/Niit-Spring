package jdbc.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jdbc.basic.dao.StudentDao;
import jdbc.basic.dao.StudentDaoImpl;
import jdbc.basic.model.Student;

public class Testjdbc {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
		//Student s1= new Student(5, "rakesh", 8, 67);
		//StudentDaoImpl studentDao = (StudentDaoImpl) context.getBean("studentDao");
		//studentDao.insert(s1);
		//studentDao.delRecordById(5);
		//studentDao.delRecordByNameORSem("salman", 7);
		//studentDao.cleanUp();
		StudentHelper helper = context.getBean("studentdoeHelper",StudentHelper.class);
		helper.insertStudents();
	}
}
