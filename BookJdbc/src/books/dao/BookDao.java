package books.dao;

import java.util.List;

import books.model.Book;

public interface BookDao {
	public void insert(Book b);
	public void delById(int id);
	public void showtable();
	public void updatePriceById(int id,int updatePrice);
}
