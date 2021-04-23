package jdbc.basic.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import jdbc.basic.model.Student;

@Repository("studentDoa")
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
