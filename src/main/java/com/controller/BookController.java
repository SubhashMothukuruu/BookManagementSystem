package com.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Entity.Book;
import com.Service.BookServiceImpl;


@Controller
public class BookController {
	
	
	@Autowired
	BookServiceImpl bookServiceImpl;
	
	@RequestMapping(value="/create", method =RequestMethod.POST )
	@PostMapping("/create")
	public String createBooks(@ModelAttribute("book") Book book) {
		bookServiceImpl.createBook(book);
		return "redirect:/";
	}
	
	
	@RequestMapping(value="/update", method =RequestMethod.GET)
	public String updateBook(@RequestParam Long bookId, Model model ) {
		Book book = bookServiceImpl.getById(bookId);
		model.addAttribute("book", book);
		return "modify";	
	}
	
	
	@RequestMapping(value={"/","/home"}, method =RequestMethod.GET)
	public String getAllBooks(Model model) {
		List<Book> bookList= bookServiceImpl.getAllBooks();
		model.addAttribute("bookList", bookList);
		return "welcome";
		
	}
	
	@RequestMapping(value="/showNewBook", method =RequestMethod.GET )
	public String showNewBook (Model model) {
	    Book book = new Book();
	    model.addAttribute("book", book);
	    return "newbook";
	}
	
	@RequestMapping(value="/delete", method =RequestMethod.GET)
	public String deleteById(@RequestParam Long bookId) {
		bookServiceImpl.deleteBook(bookId);
		return "redirect:/";
	}
		
	

}
