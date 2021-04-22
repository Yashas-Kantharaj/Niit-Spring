package jdbc.basic.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import jdbc.basic.model.Student;

public class StudentDaoImpl  implements StudentDao{
	private JdbcTemplate jt= new JdbcTemplate(getDataSource());
	
	@Override
	public void insert(Student s) {
		String sql = "insert into student values (?,?,?,?)";
		Object[] objects= {s.getId(),s.getName(),s.getSem(),s.getAverage()};

		int no_rows_inserted =	jt.update(sql,objects);
		System.out.println("no of rows inserted  is"+ no_rows_inserted);
	}
	
	
	public  DataSource getDataSource() {
		String url ="jdbc:mysql://localhost/spring_jdbc";
		String userid = "root";
		String pwd = "";
		DriverManagerDataSource ds = new DriverManagerDataSource(url, userid, pwd);
		System.out.println("Database is connected !");
		return ds;
		
	}
}
