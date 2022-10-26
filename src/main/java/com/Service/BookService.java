package com.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Entity.Book;

@Service
public interface BookService {
	
	public Book createBook(Book book);
	
	public Book updateBook(Long bookId);
	
	public Boolean deleteBook(Long bookId);
	
	public Book getById(Long bookId);
	
	public List<Book> getAllBooks();
	
	

}
