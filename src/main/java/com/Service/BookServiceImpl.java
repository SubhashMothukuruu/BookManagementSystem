package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookException.BookException;
import com.Entity.Book;
import com.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;
	
	


	@Override
	public Book createBook(Book book) {
//		String bookName = bookRepository.findByName(book.getBookName());
//		if (bookName == book.getBookName()) {
//			throw new BookException("This book " + bookName + " is already Existed.");
//		} else
 if (book.getBookId() == null) {
			throw new BookException("Id can't be null.");

		} else if (book.getBookName() == null) {
			throw new BookException(" Name can't be null.");
		} else

		if (book.getBookDescription() == null) {
			throw new BookException(" Description can't be null.");
		} else {
			return bookRepository.save(book);
		}

	}

	@Override
	public Book updateBook(Long bookId) {
		

		Book booktest = bookRepository.findById(bookId).orElse(null);

			return bookRepository.saveAndFlush(booktest);
		

	}

	@Override
	public Boolean deleteBook(Long bookId) {
		boolean flag = false;

		if (bookId == 0) {
			throw new BookException("Book id can't be null.");

		} else {
			Book book = getById(bookId);
			bookRepository.delete(book);
			return flag;

		}

	}

	@Override
	public Book getById(Long bookId) {
		if (bookId == null) {
			throw new BookException("Book id can't be null.");
		} else {
			Book book = bookRepository.findById(bookId).orElse(null);
			return book;
		}

	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

}
