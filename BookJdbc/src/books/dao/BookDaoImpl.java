package books.dao;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import books.model.Book;


@Repository("bookDao")
public class BookDaoImpl implements BookDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate ;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
		
	@Override
	public void insert(Book b) {
		String sql = "insert into books values (?,?,?,?)";
		Object[] objects= {b.getId(),b.getName(),b.getAuthor(),b.getPrice()};

		int no_rows_inserted =	jdbcTemplate.update(sql,objects);
		System.out.println("\nno of rows inserted  is "+ no_rows_inserted);
		
	}

	@Override
	public void delById(int id) {
		String sqldel="delete from books where id = ?";
		int noRecordDeleted = jdbcTemplate.update(sqldel,id);
		System.out.println("no of records deleted is " +noRecordDeleted );
		
	}

	@Override
	public void showtable() {
		String sql = "select * from books";
		List<Book> books = jdbcTemplate.query(sql, new BookRowMapper());
		printStudents(books);
	}
	
	
	private void printStudents(List<Book> books) {
		for(Book b : books) {
			System.out.println(b);
		}
	}

	@Override
	public void updatePriceById(int id, int updatePrice) {
		String sql = "update books set price = ? where id = ?";
		int noRecordUpdated = jdbcTemplate.update(sql,updatePrice,id);
		System.out.println("no of records updated is " +noRecordUpdated );
		
		
	}
}
