package com.ServiceTestClasses;

import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.Entity.Book;
import com.Service.BookServiceImpl;
import com.repository.BookRepository;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class BookServiceTestCases {
	
	
	@InjectMocks
	BookServiceImpl bookServiceImpl;
	
	@Mock
	BookRepository bookRepository;
	
	List<Book> books;
	
	@Test
	public void createBookTest() {
		Book book = new Book();
		book.setBookId(1l);
		book.setBookName("Harry Porter");
		book.setBookDescription("Magical Book");
		book.setBookDepartment("Adventures");
		when(bookRepository.save(book)).thenReturn(book);
		bookServiceImpl.createBook(book);
		
	}
	
	@Test
	public void createBookExceptionTestId() {
		Book book = new Book();
		book.setBookId(null);
		book.setBookName(null);
		book.setBookDescription(null);
		book.setBookDepartment(null);
		when(bookRepository.save(book)).thenReturn(book);
		bookServiceImpl.createBook(book);
		
	}
	
	
	@Test
	public void createBookExceptionTestName() {
		Book book = new Book();
		book.setBookId(1l);
		book.setBookName(null);
		book.setBookDescription(null);
		book.setBookDepartment(null);
		when(bookRepository.save(book)).thenReturn(book);
		bookServiceImpl.createBook(book);
		
	}
	
	
	@Test
	public void createBookExceptionTestDescription() {
		Book book = new Book();
		book.setBookId(1l);
		book.setBookName("Harry Porter");
		book.setBookDescription(null);
		book.setBookDepartment(null);
		when(bookRepository.save(book)).thenReturn(book);
		bookServiceImpl.createBook(book);
		
	}
	
	

	
	@Test
	public void updateBookExceptionTest1() {
		Book book = new Book();
		book.setBookId(1l);
		book.setBookName("Harry Porter");
		book.setBookDescription("Magical Book");
		book.setBookDepartment("Adventures");
		
		
		when(bookRepository.save(book)).thenReturn(book);
		Long id =book.getBookId();
		bookServiceImpl.updateBook(id);
		
	}
	
	
	@Test
	public void getBookById() {
		Book book = new Book();
		book.setBookId(1l);
		book.setBookName("Harry Porter");
		book.setBookDescription("Magical Book");
		book.setBookDepartment("Adventures");
		
		Long id = book.getBookId();
		bookServiceImpl.getById(id);
		verify(bookRepository, times(1)).findById(id);
		
	}
	
	@Test
	public void getBookByIdException() {
		Book book = new Book();
		book.setBookId(null);
		book.setBookName("Harry Porter");
		book.setBookDescription("Magical Book");
		book.setBookDepartment("Adventures");
		
		Long id = book.getBookId();
		bookServiceImpl.getById(id);
		verify(bookRepository, times(1)).findById(id);
		
	}
	
	
	@Test
	public void deleteBook() {
		Book book = new Book();
		book.setBookId(1L);
		book.setBookName("Harry Porter");
		book.setBookDescription("Magical Book");
		book.setBookDepartment("Adventures");
		Long id = book.getBookId();
		boolean  flag = bookServiceImpl.deleteBook(id);
		assertNotEquals(true, flag);
		
	}
	
	
	@Test
	public void deleteBookIfNull() {
		Book book = new Book();
		book.setBookId(0l);
		Long id = book.getBookId();
		boolean  flag = bookServiceImpl.deleteBook(id);
		assertNotEquals(true, flag);
		
	}
	
	
	@Test
	public void getAllTest() {
		books= new ArrayList<>();
		books.add(new Book(1l, "harry porter", "magic", "adventures"));
		books.add(new Book(2l, "harry", "magic", "adventures"));
		when(bookRepository.saveAll(books)).thenReturn(books);
		bookServiceImpl.getAllBooks();
		
		
	}
	
	
	
	
	
	

}
