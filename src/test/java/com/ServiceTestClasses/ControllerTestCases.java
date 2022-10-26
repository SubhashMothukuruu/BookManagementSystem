package com.ServiceTestClasses;


import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.Model;

import com.Entity.Book;
import com.Service.BookServiceImpl;
import com.controller.BookController;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class ControllerTestCases {
	
	
	@InjectMocks
	BookController bookController;
	
	@Mock
	BookServiceImpl bookService;
	
	@Mock
	Model model;
	
	@Mock
	Book book;
	
	List<Book> books;
	
	@Test
	public void createMethodTestCase() {
		
		Book book = new Book();
		book.setBookId((long)1);
		book.setBookName("Harry Porter");
		book.setBookDescription("Magical Book");
		book.setBookDepartment("Adventures");
		when(bookService.createBook(book)).thenReturn(book);
		bookController.createBooks(book);
		
	}
	
	
	@Test
	public void updateMethodTestCase() {
		Book book = new Book();
		book.setBookId(1l);
		book.setBookName("Subhash");
		book.setBookDescription("Subhash");
		book.setBookDepartment("Subhash");
		when(bookService.getById((long)1)).thenReturn(book);
		bookController.updateBook(1l, model);
	}
	
	@Test
	public void getAllBooksTestCase() {
		books= new ArrayList<>();
		books.add(new Book(1L, "subhash", "subhash", "subhash"));
		books.add(new Book(2L, "ram", "subhash", "subhash"));
		when(bookService.getAllBooks()).thenReturn(books);
		bookController.getAllBooks(model);
	}
	
	@Test
	public void showNewBookTestCase() {
		Book book = new Book();
		book.setBookId(1l);
		book.setBookName("Subhash");
		book.setBookDescription("Subhash");
		book.setBookDepartment("Subhash");
		when(bookService.createBook(book)).thenReturn(book);
		bookController.showNewBook(model);
	}
	
	@Test
	public void deleteByIdTestCase() {
		Book book = new Book();
		book.setBookId(1l);
		book.setBookName("Subhash");
		book.setBookDescription("Subhash");
		book.setBookDepartment("Subhash");
		
		when(bookService.deleteBook(1L)).thenReturn(true);
		bookController.deleteById(1L);
		
		
	}

}
