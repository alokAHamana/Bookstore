package com.bookstore.service;

import java.sql.SQLException;
import java.util.List;

import com.bookstore.Dao.BookDAOImpl;
import com.bookstore.Dao.BookDao;
import com.bookstore.model.Book;


public class BookServiceImpl  implements BookService{
	
	// declare instance variable
	String jdbcURL ;
	String jdbcUsername ;
	String jdbcPassword ;
	
	// intialize valuee through Constructor

	public BookServiceImpl(String jdbcURL , String jdbcUsername, String jdbcPassword) {
		
		this.jdbcURL =jdbcURL;
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
	}
 //------ato
	private BookDao  bookDao = new BookDAOImpl();

	@Override
	public void insertBook(Book book) throws SQLException {
		
		System.out.println("BookServiceImpl :"+book.getTitle() +" "+ book.getAuthor()+ " "+ book.getPrice());

		bookDao.insertBook(book);
	}	
//---------------ato
	@Override
	public void deleteBook(Book book) throws SQLException {
		// TODO Auto-generated method stub
		//return false;
		
		System.out.println("BookServiceImpl :"+book.getTitle() +" "+ book.getAuthor()+ " "+ book.getPrice());

		bookDao.deleteBook(book);
	}
//--------------ato
	@Override
	public void updateBook(Book book) throws SQLException {
		// TODO Auto-generated method stub
		
		System.out.println("BookServiceImpl :"+book.getTitle() +" "+ book.getAuthor()+ " "+ book.getPrice());

		bookDao.insertBook(book);
	}
//---------------ato
	@Override
	public Book getBook(int id) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("BookServiceImpl  getBook method : "+ id);

		Book existingBook =bookDao.getBook(id);
		
		return existingBook;
	}
//--------------ato  -------problem occured
	
	@Override
	public List<Book> listAllBook() throws SQLException {

		List<Book> listBook = bookDao.listAllBook();
		
		return listBook; 
		
	}
	
}
