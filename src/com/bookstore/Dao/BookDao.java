 package com.bookstore.Dao;

import java.sql.SQLException;
import java.util.List;

import com.bookstore.model.Book;

public interface BookDao {
	
	public boolean insertBook(Book book) throws SQLException ;
	
	public boolean deleteBook(Book book) throws SQLException ;
	
	public boolean updateBook(Book book) throws SQLException;

	public Book getBook(int id) throws SQLException;
	
	public List<Book> listAllBook() throws SQLException;

}
