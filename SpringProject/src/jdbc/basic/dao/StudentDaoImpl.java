package jdbc.basic.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import jdbc.basic.model.Student;

//@Repository("studentDoa")
public class StudentDaoImpl  implements StudentDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate ;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public void insert(Student s) {
		String sql = "insert into student values (?,?,?,?)";
		Object[] objects= {s.getId(),s.getName(),s.getSem(),s.getAverage()};

		int no_rows_inserted =	jdbcTemplate.update(sql,objects);
		System.out.println("no of rows inserted  is"+ no_rows_inserted);
	}

	@Override
	public void delRecordById(int id) {
		String sqldel="delete from student where id = ?";
		int noRecordDeleted = jdbcTemplate.update(sqldel,id);
		System.out.println("no of records deleted is " +noRecordDeleted );
		
	}

	@Override
	public int delRecordByNameORSem(String name, int sem) {
		String sql = "DELETE FROM STUDENT WHERE NAME = ? OR SEM = ?";
		Object[] objects = {name,sem};
		int noRecordsDeleted = jdbcTemplate.update(sql, objects);
		System.out.println("no of records deleted ="+ noRecordsDeleted);
		return noRecordsDeleted;
		
	}
	public void cleanUp() {
		String sql = "TRUNCATE TABLE STUDENT";
		jdbcTemplate.update(sql);
		System.out.println("table cleaned");
	}




	@Override
	public void insert(List<Student> students) {
		String sql = "INSERT INTO student VALUES (?,?,?,?)";
		ArrayList<Object[]> sqlArgs = new ArrayList<>();
		for(Student student : students) {
			Object[] studentData =	{student.getId(),student.getName(),student.getSem(),student.getAverage()};
			sqlArgs.add(studentData);
		}
		
		jdbcTemplate.batchUpdate(sql, sqlArgs);
	}
	
	
//	public  DataSource getDataSource() {
//		String url ="jdbc:mysql://localhost/spring_jdbc";
//		String userid = "root";
//		String pwd = "";
//		DriverManagerDataSource ds = new DriverManagerDataSource(url, userid, pwd);
//		System.out.println("Database is connected !");
//		return ds;
//		
//	}
}
