package com.bookstore.service;

import java.sql.SQLException;
import java.util.List;

import com.bookstore.model.Book;


public interface BookService {               //  github changes          testing --------------------------------
	
	public void insertBook(Book book) throws SQLException;
	
	public void deleteBook(Book book) throws SQLException ;
	
	public void updateBook(Book book) throws SQLException;

	public Book getBook(int id) throws SQLException;

	public List<Book> listAllBook() throws SQLException;

	
	
	
	//public List<Book> listBook() throws SQLException;


}
